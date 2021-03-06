package org.kevoree.library.hocl;

import org.kevoree.ComponentInstance;
import org.kevoree.ContainerNode;
import org.kevoree.ContainerRoot;
import org.kevoree.MBinding;
import org.kevoree.annotation.*;
import org.kevoree.api.service.core.handler.ModelListener;
import org.kevoree.api.service.core.script.KevScriptEngine;
import org.kevoree.framework.KevoreePropertyHelper;
import org.kevoree.hocl.scubeDemo.HoclInitializationManager;
import org.kevoree.hocl.scubeDemo.HoclRunner;
import org.kevoree.hocl.scubeDemo.PlanningManager;
import org.kevoree.tools.hocl.framework.AbstractHoclComponentType;
import org.kevoreeAdaptation.AdaptationModel;
import org.slf4j.LoggerFactory;
import scala.Option;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Erwan Daubert - erwan.daubert@gmail.com
 * Date: 15/03/12
 * Time: 17:50
 *
 * @author Erwan Daubert
 * @version 1.0
 */
@Library(name = "HOCL")
@ComponentType
public class ScubeCase1 extends AbstractHoclComponentType implements ModelListener {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ScubeCase1.class);

	private boolean starting;

	public ScubeCase1 () throws Exception {
		super();
	}

	@Start
	public void start () throws Exception {
		initializeSolution();
		this.getModelService().registerModelListener(this);
		starting = true;
	}


	@Stop
	public void stop () {
		this.getModelService().unregisterModelListener(this);
	}

	@Update
	public void update () throws Exception {
		stop();
		start();
	}

	public boolean preUpdate (ContainerRoot currentModel, ContainerRoot proposedModel) {
		return true;
	}

	public boolean initUpdate (ContainerRoot currentModel, ContainerRoot proposedModel) {
		return true;
	}

	public void modelUpdated () {

		getModelService().unregisterModelListener(this);
		AdaptationModel adaptationModel;
		if (starting) {
			logger.debug("HOCL solution intialization");
			// init HOCL solution with initial model configuration
			adaptationModel = HoclInitializationManager.execute(getModelService().getLastModel(), getSolution());
			starting = false;
		} else {
			List<ContainerRoot> previousModels = getModelService().getPreviousModel();
			adaptationModel = PlanningManager.kompare(previousModels.get(previousModels.size() - 1), getModelService().getLastModel());
		}


		logger.debug("model update on HOCL with {} command", adaptationModel.getAdaptationsForJ().size());
		if (adaptationModel.getAdaptationsForJ().size() > 0) {
			logger.debug("apply model update on HOCL");
			// build hocl command to add or remove molecule
			HoclRunner.execute(adaptationModel, getSolution(), this.getNodeName(), this.getName());
			// get result and adapt Kevoree according to result of the chemical engine
			applyHoclResult(getSolution().toString());
		}

		getModelService().registerModelListener(this);
	}

	private void applyHoclResult (String result) {

		KevScriptEngine kengine = getKevScriptEngineFactory().createKevScriptEngine();
		String content = result.substring(1).substring(0, result.substring(1).length() - 1);
//		Pattern pattern = Pattern.compile("\\(([^()]*(?:(<.*>))?)\\)");
		Pattern pattern = Pattern.compile("\\((((<((\"[^<>:,\"]*\"|[0-9]*|\\(((\"[^<>:,\"]*\"|[0-9]*)(:)?)*\\))(,)?)*>|\"[^<>:,\"]*\"|[0-9]*)(:)?)*)\\)");
		Matcher matcher = pattern.matcher(content);

		boolean isThereUpdateToApply = false;

		while (matcher.find()) {
			String molecule = matcher.group(1);
			if (molecule.startsWith("\"NODE\"")) {
				String[] values = molecule.split(":");
				String nodeName = values[2].substring(1, values[2].length() - 1);
				if (!nodeName.equals(this.getNodeName())) {
					String componentsString = values[5].substring(1, values[5].length() - 1);
					String[] components = componentsString.split(",");
					for (String component : components) {
						if (!"".equals(component)) {
							String componentName = component.substring(1, component.length() - 1);
							// look for the component on the model to know if the component must move according to decision taken by HOCL engine
							String oldName = getOldNodeNameForComponent(componentName);
							if (oldName != null && !"".equals(oldName) && !oldName.equals(nodeName)) {
								isThereUpdateToApply = true;
								kengine.addVariable("nodeName", oldName);
								kengine.addVariable("newNodeName", nodeName);
								kengine.addVariable("componentName", componentName);
								kengine.append("moveComponent {componentName}@{nodeName} =>{newNodeName}");
								// if some bindings are remote we must check if a port is defined for the channels
								fixPortAndBinding(nodeName, componentName, kengine);

							}
						}
					}
				}
			} else if (molecule.startsWith("\"CHANNEL\"")) {
				String[] values = molecule.split(":");
				String channelName = values[2].substring(1, values[2].length() - 1);
				String bindingsString = molecule.split("<")[1].substring(0, molecule.split("<")[1].length() - 1);
				String[] bindings = bindingsString.split(",");
				for (String binding : bindings) {
					if (!"".equals(binding)) {
						String[] bindingData = binding.substring(1, binding.length() - 1).split(":");
						String nodeName = bindingData[0].substring(1, bindingData[0].length() - 1);
						String componentName = bindingData[1].substring(1, bindingData[1].length() - 1);
						String portName = bindingData[2].substring(1, bindingData[2].length() - 1);
						if (!"".equals(componentName)) {
							boolean alreadyExist = false;
							for (MBinding mbinding : getModelService().getLastModel().getMBindingsForJ()) {
								if (mbinding.getPort().getPortTypeRef().getName().equals(portName)
										&& ((ComponentInstance) mbinding.getPort().eContainer()).getName().equals(componentName)
										&& ((ContainerNode) mbinding.getPort().eContainer().eContainer()).getName().equals(nodeName)
										&& mbinding.getHub().getName().equals(channelName)) {
									alreadyExist = true;
									break;
								}
							}
							if (!alreadyExist) {
								isThereUpdateToApply = true;
								kengine.addVariable("nodeName", nodeName);
								kengine.addVariable("componentName", componentName);
								kengine.addVariable("portName", portName);
								kengine.addVariable("channelName", channelName);
								kengine.append("bind {componentName}.{portName}@{nodeName} =>{channelName}");
								fixPort(channelName, nodeName, kengine);
							}
						}
					}
				}
			}
		}
		try {
			if (isThereUpdateToApply) {
				logger.info("HOCL DEFINE UPDATE");
			} else {
				logger.info("NO UPDATE DEFINE BY HOCL");
			}
			kengine.interpretDeploy();
		} catch (Exception e) {
			logger.warn("Unable to apply the HOCL result");
		}
	}

	private String getOldNodeNameForComponent (String componentName) {
		ContainerRoot model = getModelService().getLastModel();
		for (ContainerNode node : model.getNodesForJ()) {
			for (ComponentInstance componentInstance : node.getComponentsForJ()) {
				if (componentInstance.getName().equals(componentName)) {
					return node.getName();
				}
			}
		}
		return "";
	}

	private void fixPort (String channelName, String nodeName, KevScriptEngine kengine) {
		kengine.addVariable("nodeName", nodeName);
		kengine.addVariable("channelName", channelName);
		kengine.addVariable("portPropertyValue", "" + selectPort(channelName, nodeName));
		kengine.append("updateDictionary {channelName} {port='{portPropertyValue}'}@{nodeName}");
	}

	private int selectPort (String channelName, String nodeName) {
		Option<Integer> portOption = KevoreePropertyHelper.getIntPropertyForChannel(this.getModelService().getLastModel(), channelName, "port", true, this.getName());
		int defaultNB = 0;
		if (portOption.isDefined()) {
			defaultNB = portOption.get();
		}
		List<ContainerNode> nodes = this.getModelService().getLastModel().getNodesForJ();
		Map<String, Integer> portAlreadyUsed = new HashMap<String, Integer>(nodes.size());
		for (ContainerNode node : nodes) {
			portOption = KevoreePropertyHelper.getIntPropertyForChannel(this.getModelService().getLastModel(), channelName, "port", true, node.getName());
			if (portOption.isDefined()) {
				if (portAlreadyUsed.containsValue(portOption.get())) {
					if (portAlreadyUsed.containsKey(nodeName) && portAlreadyUsed.get(nodeName).equals(portOption.get())) {
						portAlreadyUsed.remove(nodeName);
					}
				}
				portAlreadyUsed.put(node.getName(), portOption.get());
			}
		}
		if (portAlreadyUsed.containsKey(nodeName) && !portAlreadyUsed.get(nodeName).equals(defaultNB)) {
			return portAlreadyUsed.get(nodeName);
		} else {
			int maxPortNumber = 9000;
			for (int portNumber : portAlreadyUsed.values()) {
				if (portNumber > maxPortNumber) {
					maxPortNumber = portNumber;
				}
			}
			return maxPortNumber + 1;
		}

	}

	private void fixPortAndBinding (String nodeName, String componentName, KevScriptEngine kengine) {
		ContainerRoot model = getModelService().getLastModel();
		for (MBinding mb : model.getMBindingsForJ()) {
			if (((ComponentInstance) mb.getPort().eContainer()).getName().equals(componentName)) {
				fixPort(mb.getHub().getName(), nodeName, kengine);
			}
		}
	}
}
