/*******************************************************************************
 * Pattern builder for pattern enforcementInfo.authorization
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
 * Generated automatically from pattern enforcementInfo.authorization
 */
public class PatternBuilderForauthorization implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("enforcementInfo.authorization".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("enforcementInfo.authorization");
		
		final Address<? extends Receiver> var_387 = buildable.patternCollector("enforcementInfo.authorization");
		final Stub<Address<? extends Supplier>> var_388 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_389 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_390 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEFOBJ", "TYPNAMEOBJ"}), var_389);
		final TupleMask var_391 = new TupleMask(new int[] {}, 0);
		final TupleMask var_392 = new TupleMask(new int[] {}, 2);
		final TupleMask var_393 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_394 = buildable.buildBetaNode(var_388, var_390, var_391, var_392, var_393, false);
		final Stub<Address<? extends Supplier>> var_395 = buildable.buildInjectivityChecker(var_394, 0, new int[] {1});
		final AbstractEvaluator var_396 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(1).toString(),"AddressBook");
			}
		};
		final Stub<Address<? extends Supplier>> var_397 = buildable.buildPredicateChecker(var_396, null, new int[] {1}, var_395);
		final Object var_398 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_399 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OBJECT", "TYPDEFOBJ"}), var_398);
		final TupleMask var_400 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_401 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_402 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_403 = buildable.buildBetaNode(var_397, var_399, var_400, var_401, var_402, false);
		final Stub<Address<? extends Supplier>> var_404 = buildable.buildInjectivityChecker(var_403, 2, new int[] {0});
		final Stub<Address<? extends Supplier>> var_405 = buildable.buildInjectivityChecker(var_404, 2, new int[] {1});
		final Object var_406 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ComponentInstance"))).getEStructuralFeature("provided");
		final Stub<Address<? extends Supplier>> var_407 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OBJECT", "PORTOBJ"}), var_406);
		final TupleMask var_408 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_409 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_410 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_411 = buildable.buildBetaNode(var_405, var_407, var_408, var_409, var_410, false);
		final Stub<Address<? extends Supplier>> var_412 = buildable.buildInjectivityChecker(var_411, 2, new int[] {3});
		final Stub<Address<? extends Supplier>> var_413 = buildable.buildInjectivityChecker(var_412, 3, new int[] {0});
		final Stub<Address<? extends Supplier>> var_414 = buildable.buildInjectivityChecker(var_413, 3, new int[] {1});
		final Object var_415 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("MBinding"))).getEStructuralFeature("port");
		final Stub<Address<? extends Supplier>> var_416 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"BINDINGCHAOBJ", "PORTOBJ"}), var_415);
		final TupleMask var_417 = new TupleMask(new int[] {3}, 4);
		final TupleMask var_418 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_419 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_420 = buildable.buildBetaNode(var_414, var_416, var_417, var_418, var_419, false);
		final Stub<Address<? extends Supplier>> var_421 = buildable.buildInjectivityChecker(var_420, 4, new int[] {2});
		final Stub<Address<? extends Supplier>> var_422 = buildable.buildInjectivityChecker(var_421, 4, new int[] {3});
		final Stub<Address<? extends Supplier>> var_423 = buildable.buildInjectivityChecker(var_422, 4, new int[] {0});
		final Stub<Address<? extends Supplier>> var_424 = buildable.buildInjectivityChecker(var_423, 4, new int[] {1});
		final Object var_425 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("MBinding"))).getEStructuralFeature("hub");
		final Stub<Address<? extends Supplier>> var_426 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"BINDINGCHAOBJ", "CHANNEL"}), var_425);
		final TupleMask var_427 = new TupleMask(new int[] {4}, 5);
		final TupleMask var_428 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_429 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_430 = buildable.buildBetaNode(var_424, var_426, var_427, var_428, var_429, false);
		final Stub<Address<? extends Supplier>> var_431 = buildable.buildInjectivityChecker(var_430, 4, new int[] {5});
		final Stub<Address<? extends Supplier>> var_432 = buildable.buildInjectivityChecker(var_431, 5, new int[] {2});
		final Stub<Address<? extends Supplier>> var_433 = buildable.buildInjectivityChecker(var_432, 5, new int[] {3});
		final Stub<Address<? extends Supplier>> var_434 = buildable.buildInjectivityChecker(var_433, 5, new int[] {0});
		final Stub<Address<? extends Supplier>> var_435 = buildable.buildInjectivityChecker(var_434, 5, new int[] {1});
		final Object var_436 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("MBinding"))).getEStructuralFeature("hub");
		final Stub<Address<? extends Supplier>> var_437 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"BINDINGSUBCHA", "CHANNEL"}), var_436);
		final TupleMask var_438 = new TupleMask(new int[] {5}, 6);
		final TupleMask var_439 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_440 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_441 = buildable.buildBetaNode(var_435, var_437, var_438, var_439, var_440, false);
		final Stub<Address<? extends Supplier>> var_442 = buildable.buildInjectivityChecker(var_441, 4, new int[] {6});
		final Stub<Address<? extends Supplier>> var_443 = buildable.buildInjectivityChecker(var_442, 6, new int[] {5});
		final Stub<Address<? extends Supplier>> var_444 = buildable.buildInjectivityChecker(var_443, 6, new int[] {2});
		final Stub<Address<? extends Supplier>> var_445 = buildable.buildInjectivityChecker(var_444, 6, new int[] {3});
		final Stub<Address<? extends Supplier>> var_446 = buildable.buildInjectivityChecker(var_445, 6, new int[] {0});
		final Stub<Address<? extends Supplier>> var_447 = buildable.buildInjectivityChecker(var_446, 6, new int[] {1});
		final Object var_448 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("MBinding"))).getEStructuralFeature("port");
		final Stub<Address<? extends Supplier>> var_449 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"BINDINGSUBCHA", "PORTSUB"}), var_448);
		final TupleMask var_450 = new TupleMask(new int[] {6}, 7);
		final TupleMask var_451 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_452 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_453 = buildable.buildBetaNode(var_447, var_449, var_450, var_451, var_452, false);
		final Stub<Address<? extends Supplier>> var_454 = buildable.buildInjectivityChecker(var_453, 4, new int[] {7});
		final Stub<Address<? extends Supplier>> var_455 = buildable.buildInjectivityChecker(var_454, 6, new int[] {7});
		final Stub<Address<? extends Supplier>> var_456 = buildable.buildInjectivityChecker(var_455, 5, new int[] {7});
		final Stub<Address<? extends Supplier>> var_457 = buildable.buildInjectivityChecker(var_456, 2, new int[] {7});
		final Stub<Address<? extends Supplier>> var_458 = buildable.buildInjectivityChecker(var_457, 3, new int[] {7});
		final Stub<Address<? extends Supplier>> var_459 = buildable.buildInjectivityChecker(var_458, 7, new int[] {0});
		final Stub<Address<? extends Supplier>> var_460 = buildable.buildInjectivityChecker(var_459, 7, new int[] {1});
		final Object var_461 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ComponentInstance"))).getEStructuralFeature("required");
		final Stub<Address<? extends Supplier>> var_462 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"SUBJECT", "PORTSUB"}), var_461);
		final TupleMask var_463 = new TupleMask(new int[] {7}, 8);
		final TupleMask var_464 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_465 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_466 = buildable.buildBetaNode(var_460, var_462, var_463, var_464, var_465, false);
		final Stub<Address<? extends Supplier>> var_467 = buildable.buildInjectivityChecker(var_466, 4, new int[] {8});
		final Stub<Address<? extends Supplier>> var_468 = buildable.buildInjectivityChecker(var_467, 6, new int[] {8});
		final Stub<Address<? extends Supplier>> var_469 = buildable.buildInjectivityChecker(var_468, 5, new int[] {8});
		final Stub<Address<? extends Supplier>> var_470 = buildable.buildInjectivityChecker(var_469, 2, new int[] {8});
		final Stub<Address<? extends Supplier>> var_471 = buildable.buildInjectivityChecker(var_470, 3, new int[] {8});
		final Stub<Address<? extends Supplier>> var_472 = buildable.buildInjectivityChecker(var_471, 7, new int[] {8});
		final Stub<Address<? extends Supplier>> var_473 = buildable.buildInjectivityChecker(var_472, 8, new int[] {0});
		final Stub<Address<? extends Supplier>> var_474 = buildable.buildInjectivityChecker(var_473, 8, new int[] {1});
		final Object var_475 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_476 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"SUBJECT", "TYPDEFSUB"}), var_475);
		final TupleMask var_477 = new TupleMask(new int[] {8}, 9);
		final TupleMask var_478 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_479 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_480 = buildable.buildBetaNode(var_474, var_476, var_477, var_478, var_479, false);
		final Stub<Address<? extends Supplier>> var_481 = buildable.buildInjectivityChecker(var_480, 4, new int[] {9});
		final Stub<Address<? extends Supplier>> var_482 = buildable.buildInjectivityChecker(var_481, 6, new int[] {9});
		final Stub<Address<? extends Supplier>> var_483 = buildable.buildInjectivityChecker(var_482, 5, new int[] {9});
		final Stub<Address<? extends Supplier>> var_484 = buildable.buildInjectivityChecker(var_483, 2, new int[] {9});
		final Stub<Address<? extends Supplier>> var_485 = buildable.buildInjectivityChecker(var_484, 3, new int[] {9});
		final Stub<Address<? extends Supplier>> var_486 = buildable.buildInjectivityChecker(var_485, 7, new int[] {9});
		final Stub<Address<? extends Supplier>> var_487 = buildable.buildInjectivityChecker(var_486, 8, new int[] {9});
		final Stub<Address<? extends Supplier>> var_488 = buildable.buildInjectivityChecker(var_487, 0, new int[] {9});
		final Stub<Address<? extends Supplier>> var_489 = buildable.buildInjectivityChecker(var_488, 9, new int[] {1});
		final Object var_490 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_491 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEFSUB", "TYPNAMESUB"}), var_490);
		final TupleMask var_492 = new TupleMask(new int[] {9}, 10);
		final TupleMask var_493 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_494 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_495 = buildable.buildBetaNode(var_489, var_491, var_492, var_493, var_494, false);
		final Stub<Address<? extends Supplier>> var_496 = buildable.buildInjectivityChecker(var_495, 4, new int[] {10});
		final Stub<Address<? extends Supplier>> var_497 = buildable.buildInjectivityChecker(var_496, 6, new int[] {10});
		final Stub<Address<? extends Supplier>> var_498 = buildable.buildInjectivityChecker(var_497, 5, new int[] {10});
		final Stub<Address<? extends Supplier>> var_499 = buildable.buildInjectivityChecker(var_498, 2, new int[] {10});
		final Stub<Address<? extends Supplier>> var_500 = buildable.buildInjectivityChecker(var_499, 3, new int[] {10});
		final Stub<Address<? extends Supplier>> var_501 = buildable.buildInjectivityChecker(var_500, 7, new int[] {10});
		final Stub<Address<? extends Supplier>> var_502 = buildable.buildInjectivityChecker(var_501, 8, new int[] {10});
		final Stub<Address<? extends Supplier>> var_503 = buildable.buildInjectivityChecker(var_502, 0, new int[] {10});
		final Stub<Address<? extends Supplier>> var_504 = buildable.buildInjectivityChecker(var_503, 9, new int[] {10});
		final Stub<Address<? extends Supplier>> var_505 = buildable.buildInjectivityChecker(var_504, 1, new int[] {10});
		final AbstractEvaluator var_506 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(10).toString(),"AddressBookClient");
			}
		};
		final Stub<Address<? extends Supplier>> var_507 = buildable.buildPredicateChecker(var_506, null, new int[] {10}, var_505);
		final TupleMask var_508 = new TupleMask(new int[] {8, 5, 2, 7, 3, 6, 4}, 11);
		final Stub<Address<? extends Supplier>> var_509 = buildable.buildTrimmer(var_507, var_508);
		buildable.buildConnection(var_509, var_387);
		return var_387;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("enforcementInfo.authorization".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("SUBJECT", 0);
			posMapping.put("CHANNEL", 1);
			posMapping.put("OBJECT", 2);
			posMapping.put("PORTSUB", 3);
			posMapping.put("PORTOBJ", 4);
			posMapping.put("BINDINGSUBCHA", 5);
			posMapping.put("BINDINGCHAOBJ", 6);

		}
		return posMapping;
	}
}
