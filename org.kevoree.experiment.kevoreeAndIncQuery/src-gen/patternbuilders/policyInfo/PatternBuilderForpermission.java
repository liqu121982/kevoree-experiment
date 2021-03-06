/*******************************************************************************
 * Pattern builder for pattern policyInfo.permission
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
 * Generated automatically from pattern policyInfo.permission
 */
public class PatternBuilderForpermission implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policyInfo.permission".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policyInfo.permission");
		
		final Address<? extends Receiver> var_547 = buildable.patternCollector("policyInfo.permission");
		final Stub<Address<? extends Supplier>> var_548 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_549 = EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("Permission");
		final Stub<Address<? extends Supplier>> var_550 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"P"}), var_549);
		final TupleMask var_551 = new TupleMask(new int[] {}, 0);
		final TupleMask var_552 = new TupleMask(new int[] {}, 1);
		final TupleMask var_553 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_554 = buildable.buildBetaNode(var_548, var_550, var_551, var_552, var_553, false);
		final TupleMask var_555 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_556 = buildable.buildTrimmer(var_554, var_555);
		buildable.buildConnection(var_556, var_547);
		return var_547;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policyInfo.permission".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("P", 0);

		}
		return posMapping;
	}
}
