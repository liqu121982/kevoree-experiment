/*******************************************************************************
 * Pattern builder for pattern enforcementInfo.node
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
 * Generated automatically from pattern enforcementInfo.node
 */
public class PatternBuilderFornode implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("enforcementInfo.node".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("enforcementInfo.node");
		
		final Address<? extends Receiver> var_458 = buildable.patternCollector("enforcementInfo.node");
		final Stub<Address<? extends Supplier>> var_459 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_460 = EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode");
		final Stub<Address<? extends Supplier>> var_461 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"X"}), var_460);
		final TupleMask var_462 = new TupleMask(new int[] {}, 0);
		final TupleMask var_463 = new TupleMask(new int[] {}, 1);
		final TupleMask var_464 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_465 = buildable.buildBetaNode(var_459, var_461, var_462, var_463, var_464, false);
		final TupleMask var_466 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_467 = buildable.buildTrimmer(var_465, var_466);
		buildable.buildConnection(var_467, var_458);
		return var_458;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("enforcementInfo.node".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("X", 0);

		}
		return posMapping;
	}
}
