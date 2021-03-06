/*******************************************************************************
 * Pattern builder for pattern lrbac.object
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
 * Generated automatically from pattern lrbac.object
 */
public class PatternBuilderForobject implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("lrbac.object".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("lrbac.object");
		
		final Address<? extends Receiver> var_0 = buildable.patternCollector("lrbac.object");
		final Stub<Address<? extends Supplier>> var_1 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_2 = EPackage.Registry.INSTANCE.getEPackage("http://lrbac/1.0").getEClassifier("Object");
		final Stub<Address<? extends Supplier>> var_3 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"OB"}), var_2);
		final TupleMask var_4 = new TupleMask(new int[] {}, 0);
		final TupleMask var_5 = new TupleMask(new int[] {}, 1);
		final TupleMask var_6 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_7 = buildable.buildBetaNode(var_1, var_3, var_4, var_5, var_6, false);
		final TupleMask var_8 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_9 = buildable.buildTrimmer(var_7, var_8);
		buildable.buildConnection(var_9, var_0);
		return var_0;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("lrbac.object".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("OB", 0);

		}
		return posMapping;
	}
}
