/*******************************************************************************
 * Pattern builder for pattern enforcementInfo.subjectComponent
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package incQueryPatterns.patternbuilders.kevoree;

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
 * Generated automatically from pattern enforcementInfo.subjectComponent
 */
public class PatternBuilderForsubjectComponent implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("enforcementInfo.subjectComponent".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("enforcementInfo.subjectComponent");
		
		final Address<? extends Receiver> var_520 = buildable.patternCollector("enforcementInfo.subjectComponent");
		final Stub<Address<? extends Supplier>> var_521 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_522 = EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ComponentInstance");
		final Stub<Address<? extends Supplier>> var_523 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"C"}), var_522);
		final TupleMask var_524 = new TupleMask(new int[] {}, 0);
		final TupleMask var_525 = new TupleMask(new int[] {}, 1);
		final TupleMask var_526 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_527 = buildable.buildBetaNode(var_521, var_523, var_524, var_525, var_526, false);
		final Object var_528 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_529 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C", "TYPDEF"}), var_528);
		final TupleMask var_530 = new TupleMask(new int[] {0}, 1);
		final TupleMask var_531 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_532 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_533 = buildable.buildBetaNode(var_527, var_529, var_530, var_531, var_532, false);
		final Stub<Address<? extends Supplier>> var_534 = buildable.buildInjectivityChecker(var_533, 0, new int[] {1});
		final Object var_535 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_536 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEF", "TYPNAME"}), var_535);
		final TupleMask var_537 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_538 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_539 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_540 = buildable.buildBetaNode(var_534, var_536, var_537, var_538, var_539, false);
		final Stub<Address<? extends Supplier>> var_541 = buildable.buildInjectivityChecker(var_540, 0, new int[] {2});
		final Stub<Address<? extends Supplier>> var_542 = buildable.buildInjectivityChecker(var_541, 1, new int[] {2});
		final AbstractEvaluator var_543 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(2).toString(),"AddressBookClient");
			}
		};
		final Stub<Address<? extends Supplier>> var_544 = buildable.buildPredicateChecker(var_543, null, new int[] {2}, var_542);
		final TupleMask var_545 = new TupleMask(new int[] {0}, 3);
		final Stub<Address<? extends Supplier>> var_546 = buildable.buildTrimmer(var_544, var_545);
		buildable.buildConnection(var_546, var_520);
		return var_520;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("enforcementInfo.subjectComponent".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("C", 0);

		}
		return posMapping;
	}
}
