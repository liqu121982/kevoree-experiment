/*******************************************************************************
 * Pattern builder for pattern policy.session
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.policy;

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
 * Generated automatically from pattern policy.session
 */
public class PatternBuilderForsession implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policy.session".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policy.session");
		
		final Address<? extends Receiver> var_175 = buildable.patternCollector("policy.session");
		final Stub<Address<? extends Supplier>> var_176 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_177 = EPackage.Registry.INSTANCE.getEPackage("http://policy/1.0").getEClassifier("Session");
		final Stub<Address<? extends Supplier>> var_178 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"S"}), var_177);
		final TupleMask var_179 = new TupleMask(new int[] {}, 0);
		final TupleMask var_180 = new TupleMask(new int[] {}, 1);
		final TupleMask var_181 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_182 = buildable.buildBetaNode(var_176, var_178, var_179, var_180, var_181, false);
		final TupleMask var_183 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_184 = buildable.buildTrimmer(var_182, var_183);
		buildable.buildConnection(var_184, var_175);
		return var_175;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policy.session".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("S", 0);

		}
		return posMapping;
	}
}
