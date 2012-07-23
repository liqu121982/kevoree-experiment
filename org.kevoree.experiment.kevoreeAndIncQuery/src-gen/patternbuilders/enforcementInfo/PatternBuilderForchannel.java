/*******************************************************************************
 * Pattern builder for pattern enforcementInfo.channel
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.enforcementInfo;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra2.emf.incquery.runtime.IStatelessGeneratedRetePatternBuilder;
import org.eclipse.viatra2.emf.incquery.runtime.term.VPMTermEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.boundary.AbstractEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.ReteContainerBuildable;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.RetePatternBuildException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.Stub;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.IPatternMatcherContext;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Receiver;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Supplier;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.remote.Address;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.FlatTuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.TupleMask;

/**
 * Generated automatically from pattern enforcementInfo.channel
 */
public class PatternBuilderForchannel implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("enforcementInfo.channel".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("enforcementInfo.channel");
		
		final Address<? extends Receiver> var_608 = buildable.patternCollector("enforcementInfo.channel");
		final Stub<Address<? extends Supplier>> var_609 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_610 = EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Channel");
		final Stub<Address<? extends Supplier>> var_611 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"C"}), var_610);
		final TupleMask var_612 = new TupleMask(new int[] {}, 0);
		final TupleMask var_613 = new TupleMask(new int[] {}, 1);
		final TupleMask var_614 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_615 = buildable.buildBetaNode(var_609, var_611, var_612, var_613, var_614, false);
		final TupleMask var_616 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_617 = buildable.buildTrimmer(var_615, var_616);
		buildable.buildConnection(var_617, var_608);
		return var_608;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("enforcementInfo.channel".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("C", 0);

		}
		return posMapping;
	}
}