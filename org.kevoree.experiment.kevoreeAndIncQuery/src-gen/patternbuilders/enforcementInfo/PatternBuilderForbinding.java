/*******************************************************************************
 * Pattern builder for pattern enforcementInfo.binding
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
 * Generated automatically from pattern enforcementInfo.binding
 */
public class PatternBuilderForbinding implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("enforcementInfo.binding".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("enforcementInfo.binding");
		
		final Address<? extends Receiver> var_669 = buildable.patternCollector("enforcementInfo.binding");
		final Stub<Address<? extends Supplier>> var_670 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_671 = EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("MBinding");
		final Stub<Address<? extends Supplier>> var_672 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"B"}), var_671);
		final TupleMask var_673 = new TupleMask(new int[] {}, 0);
		final TupleMask var_674 = new TupleMask(new int[] {}, 1);
		final TupleMask var_675 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_676 = buildable.buildBetaNode(var_670, var_672, var_673, var_674, var_675, false);
		final TupleMask var_677 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_678 = buildable.buildTrimmer(var_676, var_677);
		buildable.buildConnection(var_678, var_669);
		return var_669;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("enforcementInfo.binding".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("B", 0);

		}
		return posMapping;
	}
}
