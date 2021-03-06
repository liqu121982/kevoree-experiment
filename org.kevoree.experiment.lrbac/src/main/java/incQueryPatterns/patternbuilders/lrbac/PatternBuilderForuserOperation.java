/*******************************************************************************
 * Pattern builder for pattern lrbac.userOperation
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package incQueryPatterns.patternbuilders.lrbac;

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
 * Generated automatically from pattern lrbac.userOperation
 */
public class PatternBuilderForuserOperation implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("lrbac.userOperation".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("lrbac.userOperation");
		
		final Address<? extends Receiver> var_20 = buildable.patternCollector("lrbac.userOperation");
		final Stub<Address<? extends Supplier>> var_21 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_22 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://lrbac/1.0").getEClassifier("PolicyElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_23 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OPERATION", "OPERATIONNAME"}), var_22);
		final TupleMask var_24 = new TupleMask(new int[] {}, 0);
		final TupleMask var_25 = new TupleMask(new int[] {}, 2);
		final TupleMask var_26 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_27 = buildable.buildBetaNode(var_21, var_23, var_24, var_25, var_26, false);
		final Stub<Address<? extends Supplier>> var_28 = buildable.buildInjectivityChecker(var_27, 0, new int[] {1});
		final Object var_29 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://lrbac/1.0").getEClassifier("Permission"))).getEStructuralFeature("operations");
		final Stub<Address<? extends Supplier>> var_30 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"PERMISSION", "OPERATION"}), var_29);
		final TupleMask var_31 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_32 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_33 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_34 = buildable.buildBetaNode(var_28, var_30, var_31, var_32, var_33, false);
		final Stub<Address<? extends Supplier>> var_35 = buildable.buildInjectivityChecker(var_34, 0, new int[] {2});
		final Stub<Address<? extends Supplier>> var_36 = buildable.buildInjectivityChecker(var_35, 1, new int[] {2});
		final Object var_37 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://lrbac/1.0").getEClassifier("Role"))).getEStructuralFeature("permissions");
		final Stub<Address<? extends Supplier>> var_38 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"ROLE", "PERMISSION"}), var_37);
		final TupleMask var_39 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_40 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_41 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_42 = buildable.buildBetaNode(var_36, var_38, var_39, var_40, var_41, false);
		final Stub<Address<? extends Supplier>> var_43 = buildable.buildInjectivityChecker(var_42, 0, new int[] {3});
		final Stub<Address<? extends Supplier>> var_44 = buildable.buildInjectivityChecker(var_43, 1, new int[] {3});
		final Stub<Address<? extends Supplier>> var_45 = buildable.buildInjectivityChecker(var_44, 2, new int[] {3});
		final Object var_46 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://lrbac/1.0").getEClassifier("User"))).getEStructuralFeature("roles");
		final Stub<Address<? extends Supplier>> var_47 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"USER", "ROLE"}), var_46);
		final TupleMask var_48 = new TupleMask(new int[] {3}, 4);
		final TupleMask var_49 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_50 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_51 = buildable.buildBetaNode(var_45, var_47, var_48, var_49, var_50, false);
		final Stub<Address<? extends Supplier>> var_52 = buildable.buildInjectivityChecker(var_51, 0, new int[] {4});
		final Stub<Address<? extends Supplier>> var_53 = buildable.buildInjectivityChecker(var_52, 1, new int[] {4});
		final Stub<Address<? extends Supplier>> var_54 = buildable.buildInjectivityChecker(var_53, 2, new int[] {4});
		final Stub<Address<? extends Supplier>> var_55 = buildable.buildInjectivityChecker(var_54, 3, new int[] {4});
		final TupleMask var_56 = new TupleMask(new int[] {4, 1}, 5);
		final Stub<Address<? extends Supplier>> var_57 = buildable.buildTrimmer(var_55, var_56);
		buildable.buildConnection(var_57, var_20);
		return var_20;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("lrbac.userOperation".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("USER", 0);
			posMapping.put("OPERATIONNAME", 1);

		}
		return posMapping;
	}
}
