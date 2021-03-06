/*******************************************************************************
 * Pattern builder for pattern enforcementInfo.nodeObject
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
 * Generated automatically from pattern enforcementInfo.nodeObject
 */
public class PatternBuilderFornodeObject implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("enforcementInfo.nodeObject".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("enforcementInfo.nodeObject");
		
		final Address<? extends Receiver> var_27 = buildable.patternCollector("enforcementInfo.nodeObject");
		final Stub<Address<? extends Supplier>> var_28 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_29 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_30 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEF", "TYPNAME"}), var_29);
		final TupleMask var_31 = new TupleMask(new int[] {}, 0);
		final TupleMask var_32 = new TupleMask(new int[] {}, 2);
		final TupleMask var_33 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_34 = buildable.buildBetaNode(var_28, var_30, var_31, var_32, var_33, false);
		final Stub<Address<? extends Supplier>> var_35 = buildable.buildInjectivityChecker(var_34, 0, new int[] {1});
		final AbstractEvaluator var_36 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(1).toString(),"AddressBook");
			}
		};
		final Stub<Address<? extends Supplier>> var_37 = buildable.buildPredicateChecker(var_36, null, new int[] {1}, var_35);
		final Object var_38 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_39 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C", "TYPDEF"}), var_38);
		final TupleMask var_40 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_41 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_42 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_43 = buildable.buildBetaNode(var_37, var_39, var_40, var_41, var_42, false);
		final Stub<Address<? extends Supplier>> var_44 = buildable.buildInjectivityChecker(var_43, 2, new int[] {0});
		final Stub<Address<? extends Supplier>> var_45 = buildable.buildInjectivityChecker(var_44, 2, new int[] {1});
		final Object var_46 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode"))).getEStructuralFeature("components");
		final Stub<Address<? extends Supplier>> var_47 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"N", "C"}), var_46);
		final TupleMask var_48 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_49 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_50 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_51 = buildable.buildBetaNode(var_45, var_47, var_48, var_49, var_50, false);
		final Stub<Address<? extends Supplier>> var_52 = buildable.buildInjectivityChecker(var_51, 2, new int[] {3});
		final Stub<Address<? extends Supplier>> var_53 = buildable.buildInjectivityChecker(var_52, 3, new int[] {0});
		final Stub<Address<? extends Supplier>> var_54 = buildable.buildInjectivityChecker(var_53, 3, new int[] {1});
		final TupleMask var_55 = new TupleMask(new int[] {3}, 4);
		final Stub<Address<? extends Supplier>> var_56 = buildable.buildTrimmer(var_54, var_55);
		buildable.buildConnection(var_56, var_27);
		return var_27;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("enforcementInfo.nodeObject".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("N", 0);

		}
		return posMapping;
	}
}
