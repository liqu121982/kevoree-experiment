/*******************************************************************************
 * Pattern builder for pattern policyInfo.userRoleAssignment
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
 * Generated automatically from pattern policyInfo.userRoleAssignment
 */
public class PatternBuilderForuserRoleAssignment implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policyInfo.userRoleAssignment".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policyInfo.userRoleAssignment");
		
		final Address<? extends Receiver> var_181 = buildable.patternCollector("policyInfo.userRoleAssignment");
		final Stub<Address<? extends Supplier>> var_182 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_183 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("User"))).getEStructuralFeature("assignedRoles");
		final Stub<Address<? extends Supplier>> var_184 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"USER", "ROLE"}), var_183);
		final TupleMask var_185 = new TupleMask(new int[] {}, 0);
		final TupleMask var_186 = new TupleMask(new int[] {}, 2);
		final TupleMask var_187 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_188 = buildable.buildBetaNode(var_182, var_184, var_185, var_186, var_187, false);
		final Stub<Address<? extends Supplier>> var_189 = buildable.buildInjectivityChecker(var_188, 1, new int[] {0});
		final TupleMask var_190 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_191 = buildable.buildTrimmer(var_189, var_190);
		buildable.buildConnection(var_191, var_181);
		return var_181;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policyInfo.userRoleAssignment".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("USER", 0);
			posMapping.put("ROLE", 1);

		}
		return posMapping;
	}
}
