/*******************************************************************************
 * Pattern builder for pattern policyInfo.PermissionOperationAssignment
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.policyInfo;

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
 * Generated automatically from pattern policyInfo.PermissionOperationAssignment
 */
public class PatternBuilderForPermissionOperationAssignment implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policyInfo.PermissionOperationAssignment".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policyInfo.PermissionOperationAssignment");
		
		final Address<? extends Receiver> var_618 = buildable.patternCollector("policyInfo.PermissionOperationAssignment");
		final Stub<Address<? extends Supplier>> var_619 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_620 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("Permission"))).getEStructuralFeature("operations");
		final Stub<Address<? extends Supplier>> var_621 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"PERM", "OPE"}), var_620);
		final TupleMask var_622 = new TupleMask(new int[] {}, 0);
		final TupleMask var_623 = new TupleMask(new int[] {}, 2);
		final TupleMask var_624 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_625 = buildable.buildBetaNode(var_619, var_621, var_622, var_623, var_624, false);
		final Stub<Address<? extends Supplier>> var_626 = buildable.buildInjectivityChecker(var_625, 1, new int[] {0});
		final TupleMask var_627 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_628 = buildable.buildTrimmer(var_626, var_627);
		buildable.buildConnection(var_628, var_618);
		return var_618;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policyInfo.PermissionOperationAssignment".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("PERM", 0);
			posMapping.put("OPE", 1);

		}
		return posMapping;
	}
}
