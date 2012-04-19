/*******************************************************************************
 * Pattern builder for pattern policyInfo.role
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
 * Generated automatically from pattern policyInfo.role
 */
public class PatternBuilderForrole implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policyInfo.role".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policyInfo.role");
		
		final Address<? extends Receiver> var_659 = buildable.patternCollector("policyInfo.role");
		final Stub<Address<? extends Supplier>> var_660 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_661 = EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("Role");
		final Stub<Address<? extends Supplier>> var_662 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"R"}), var_661);
		final TupleMask var_663 = new TupleMask(new int[] {}, 0);
		final TupleMask var_664 = new TupleMask(new int[] {}, 1);
		final TupleMask var_665 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_666 = buildable.buildBetaNode(var_660, var_662, var_663, var_664, var_665, false);
		final TupleMask var_667 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_668 = buildable.buildTrimmer(var_666, var_667);
		buildable.buildConnection(var_668, var_659);
		return var_659;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policyInfo.role".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("R", 0);

		}
		return posMapping;
	}
}
