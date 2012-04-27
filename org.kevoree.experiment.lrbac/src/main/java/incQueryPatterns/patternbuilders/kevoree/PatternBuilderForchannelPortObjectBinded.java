/*******************************************************************************
 * Pattern builder for pattern enforcementInfo.channelPortObjectBinded
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
 * Generated automatically from pattern enforcementInfo.channelPortObjectBinded
 */
public class PatternBuilderForchannelPortObjectBinded implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("enforcementInfo.channelPortObjectBinded".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("enforcementInfo.channelPortObjectBinded");
		
		final Address<? extends Receiver> var_61 = buildable.patternCollector("enforcementInfo.channelPortObjectBinded");
		final Stub<Address<? extends Supplier>> var_62 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_63 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_64 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEF", "TYPNAME"}), var_63);
		final TupleMask var_65 = new TupleMask(new int[] {}, 0);
		final TupleMask var_66 = new TupleMask(new int[] {}, 2);
		final TupleMask var_67 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_68 = buildable.buildBetaNode(var_62, var_64, var_65, var_66, var_67, false);
		final Stub<Address<? extends Supplier>> var_69 = buildable.buildInjectivityChecker(var_68, 0, new int[] {1});
		final AbstractEvaluator var_70 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(1).toString(),"AddressBook");
			}
		};
		final Stub<Address<? extends Supplier>> var_71 = buildable.buildPredicateChecker(var_70, null, new int[] {1}, var_69);
		final Object var_72 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_73 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OBJECT", "TYPDEF"}), var_72);
		final TupleMask var_74 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_75 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_76 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_77 = buildable.buildBetaNode(var_71, var_73, var_74, var_75, var_76, false);
		final Stub<Address<? extends Supplier>> var_78 = buildable.buildInjectivityChecker(var_77, 2, new int[] {0});
		final Stub<Address<? extends Supplier>> var_79 = buildable.buildInjectivityChecker(var_78, 2, new int[] {1});
		final Object var_80 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ComponentInstance"))).getEStructuralFeature("provided");
		final Stub<Address<? extends Supplier>> var_81 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OBJECT", "PORT"}), var_80);
		final TupleMask var_82 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_83 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_84 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_85 = buildable.buildBetaNode(var_79, var_81, var_82, var_83, var_84, false);
		final Stub<Address<? extends Supplier>> var_86 = buildable.buildInjectivityChecker(var_85, 2, new int[] {3});
		final Stub<Address<? extends Supplier>> var_87 = buildable.buildInjectivityChecker(var_86, 3, new int[] {0});
		final Stub<Address<? extends Supplier>> var_88 = buildable.buildInjectivityChecker(var_87, 3, new int[] {1});
		final Object var_89 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("MBinding"))).getEStructuralFeature("port");
		final Stub<Address<? extends Supplier>> var_90 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"BINDING", "PORT"}), var_89);
		final TupleMask var_91 = new TupleMask(new int[] {3}, 4);
		final TupleMask var_92 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_93 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_94 = buildable.buildBetaNode(var_88, var_90, var_91, var_92, var_93, false);
		final Stub<Address<? extends Supplier>> var_95 = buildable.buildInjectivityChecker(var_94, 4, new int[] {2});
		final Stub<Address<? extends Supplier>> var_96 = buildable.buildInjectivityChecker(var_95, 4, new int[] {3});
		final Stub<Address<? extends Supplier>> var_97 = buildable.buildInjectivityChecker(var_96, 4, new int[] {0});
		final Stub<Address<? extends Supplier>> var_98 = buildable.buildInjectivityChecker(var_97, 4, new int[] {1});
		final Object var_99 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("MBinding"))).getEStructuralFeature("hub");
		final Stub<Address<? extends Supplier>> var_100 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"BINDING", "CHANNEL"}), var_99);
		final TupleMask var_101 = new TupleMask(new int[] {4}, 5);
		final TupleMask var_102 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_103 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_104 = buildable.buildBetaNode(var_98, var_100, var_101, var_102, var_103, false);
		final Stub<Address<? extends Supplier>> var_105 = buildable.buildInjectivityChecker(var_104, 4, new int[] {5});
		final Stub<Address<? extends Supplier>> var_106 = buildable.buildInjectivityChecker(var_105, 5, new int[] {2});
		final Stub<Address<? extends Supplier>> var_107 = buildable.buildInjectivityChecker(var_106, 5, new int[] {3});
		final Stub<Address<? extends Supplier>> var_108 = buildable.buildInjectivityChecker(var_107, 5, new int[] {0});
		final Stub<Address<? extends Supplier>> var_109 = buildable.buildInjectivityChecker(var_108, 5, new int[] {1});
		final TupleMask var_110 = new TupleMask(new int[] {2, 5, 3, 4}, 6);
		final Stub<Address<? extends Supplier>> var_111 = buildable.buildTrimmer(var_109, var_110);
		buildable.buildConnection(var_111, var_61);
		return var_61;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("enforcementInfo.channelPortObjectBinded".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("OBJECT", 0);
			posMapping.put("CHANNEL", 1);
			posMapping.put("PORT", 2);
			posMapping.put("BINDING", 3);

		}
		return posMapping;
	}
}
