/*******************************************************************************
 * Pattern builder for pattern lrbac.operation
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
 * Generated automatically from pattern lrbac.operation
 */
public class PatternBuilderForoperation implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("lrbac.operation".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("lrbac.operation");
		
		final Address<? extends Receiver> var_68 = buildable.patternCollector("lrbac.operation");
		final Stub<Address<? extends Supplier>> var_69 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_70 = EPackage.Registry.INSTANCE.getEPackage("http://lrbac/1.0").getEClassifier("Operation");
		final Stub<Address<? extends Supplier>> var_71 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"OP"}), var_70);
		final TupleMask var_72 = new TupleMask(new int[] {}, 0);
		final TupleMask var_73 = new TupleMask(new int[] {}, 1);
		final TupleMask var_74 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_75 = buildable.buildBetaNode(var_69, var_71, var_72, var_73, var_74, false);
		final TupleMask var_76 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_77 = buildable.buildTrimmer(var_75, var_76);
		buildable.buildConnection(var_77, var_68);
		return var_68;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("lrbac.operation".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("OP", 0);

		}
		return posMapping;
	}
}
