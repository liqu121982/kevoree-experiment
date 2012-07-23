/*******************************************************************************
 * Pattern builder for pattern lrbac.permission
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
 * Generated automatically from pattern lrbac.permission
 */
public class PatternBuilderForpermission implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("lrbac.permission".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("lrbac.permission");
		
		final Address<? extends Receiver> var_10 = buildable.patternCollector("lrbac.permission");
		final Stub<Address<? extends Supplier>> var_11 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_12 = EPackage.Registry.INSTANCE.getEPackage("http://lrbac/1.0").getEClassifier("Permission");
		final Stub<Address<? extends Supplier>> var_13 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"P"}), var_12);
		final TupleMask var_14 = new TupleMask(new int[] {}, 0);
		final TupleMask var_15 = new TupleMask(new int[] {}, 1);
		final TupleMask var_16 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_17 = buildable.buildBetaNode(var_11, var_13, var_14, var_15, var_16, false);
		final TupleMask var_18 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_19 = buildable.buildTrimmer(var_17, var_18);
		buildable.buildConnection(var_19, var_10);
		return var_10;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("lrbac.permission".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("P", 0);

		}
		return posMapping;
	}
}
