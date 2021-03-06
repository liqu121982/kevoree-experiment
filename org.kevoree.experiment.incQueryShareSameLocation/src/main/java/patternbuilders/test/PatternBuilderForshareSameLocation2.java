/*******************************************************************************
 * Pattern builder for pattern test.shareSameLocation2
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.test;

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
 * Generated automatically from pattern test.shareSameLocation2
 */
public class PatternBuilderForshareSameLocation2 implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("test.shareSameLocation2".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("test.shareSameLocation2");
		
		final Address<? extends Receiver> var_30 = buildable.patternCollector("test.shareSameLocation2");
		final Stub<Address<? extends Supplier>> var_31 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_32 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("DictionaryValue"))).getEStructuralFeature("value");
		final Stub<Address<? extends Supplier>> var_33 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"LOC1", "VLOCN1"}), var_32);
		final TupleMask var_34 = new TupleMask(new int[] {}, 0);
		final TupleMask var_35 = new TupleMask(new int[] {}, 2);
		final TupleMask var_36 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_37 = buildable.buildBetaNode(var_31, var_33, var_34, var_35, var_36, false);
		final Stub<Address<? extends Supplier>> var_38 = buildable.buildInjectivityChecker(var_37, 0, new int[] {1});
		final Object var_39 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("DictionaryValue"))).getEStructuralFeature("value");
		final Stub<Address<? extends Supplier>> var_40 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"LOC2", "VLOCN1"}), var_39);
		final TupleMask var_41 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_42 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_43 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_44 = buildable.buildBetaNode(var_38, var_40, var_41, var_42, var_43, false);
		final Stub<Address<? extends Supplier>> var_45 = buildable.buildInjectivityChecker(var_44, 0, new int[] {2});
		final Stub<Address<? extends Supplier>> var_46 = buildable.buildInjectivityChecker(var_45, 2, new int[] {1});
		final Object var_47 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Dictionary"))).getEStructuralFeature("values");
		final Stub<Address<? extends Supplier>> var_48 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"DT1", "LOC1"}), var_47);
		final TupleMask var_49 = new TupleMask(new int[] {0}, 3);
		final TupleMask var_50 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_51 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_52 = buildable.buildBetaNode(var_46, var_48, var_49, var_50, var_51, false);
		final Stub<Address<? extends Supplier>> var_53 = buildable.buildInjectivityChecker(var_52, 3, new int[] {0});
		final Stub<Address<? extends Supplier>> var_54 = buildable.buildInjectivityChecker(var_53, 3, new int[] {2});
		final Stub<Address<? extends Supplier>> var_55 = buildable.buildInjectivityChecker(var_54, 3, new int[] {1});
		final Object var_56 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Dictionary"))).getEStructuralFeature("values");
		final Stub<Address<? extends Supplier>> var_57 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"DT2", "LOC2"}), var_56);
		final TupleMask var_58 = new TupleMask(new int[] {2}, 4);
		final TupleMask var_59 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_60 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_61 = buildable.buildBetaNode(var_55, var_57, var_58, var_59, var_60, false);
		final Stub<Address<? extends Supplier>> var_62 = buildable.buildInjectivityChecker(var_61, 3, new int[] {4});
		final Stub<Address<? extends Supplier>> var_63 = buildable.buildInjectivityChecker(var_62, 4, new int[] {0});
		final Stub<Address<? extends Supplier>> var_64 = buildable.buildInjectivityChecker(var_63, 4, new int[] {2});
		final Stub<Address<? extends Supplier>> var_65 = buildable.buildInjectivityChecker(var_64, 4, new int[] {1});
		final Object var_66 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("dictionary");
		final Stub<Address<? extends Supplier>> var_67 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C1", "DT1"}), var_66);
		final TupleMask var_68 = new TupleMask(new int[] {3}, 5);
		final TupleMask var_69 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_70 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_71 = buildable.buildBetaNode(var_65, var_67, var_68, var_69, var_70, false);
		final Stub<Address<? extends Supplier>> var_72 = buildable.buildInjectivityChecker(var_71, 5, new int[] {3});
		final Stub<Address<? extends Supplier>> var_73 = buildable.buildInjectivityChecker(var_72, 5, new int[] {4});
		final Stub<Address<? extends Supplier>> var_74 = buildable.buildInjectivityChecker(var_73, 5, new int[] {0});
		final Stub<Address<? extends Supplier>> var_75 = buildable.buildInjectivityChecker(var_74, 5, new int[] {2});
		final Stub<Address<? extends Supplier>> var_76 = buildable.buildInjectivityChecker(var_75, 5, new int[] {1});
		final Object var_77 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode"))).getEStructuralFeature("components");
		final Stub<Address<? extends Supplier>> var_78 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"N1", "C1"}), var_77);
		final TupleMask var_79 = new TupleMask(new int[] {5}, 6);
		final TupleMask var_80 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_81 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_82 = buildable.buildBetaNode(var_76, var_78, var_79, var_80, var_81, false);
		final Stub<Address<? extends Supplier>> var_83 = buildable.buildInjectivityChecker(var_82, 5, new int[] {6});
		final Stub<Address<? extends Supplier>> var_84 = buildable.buildInjectivityChecker(var_83, 3, new int[] {6});
		final Stub<Address<? extends Supplier>> var_85 = buildable.buildInjectivityChecker(var_84, 4, new int[] {6});
		final Stub<Address<? extends Supplier>> var_86 = buildable.buildInjectivityChecker(var_85, 0, new int[] {6});
		final Stub<Address<? extends Supplier>> var_87 = buildable.buildInjectivityChecker(var_86, 2, new int[] {6});
		final Stub<Address<? extends Supplier>> var_88 = buildable.buildInjectivityChecker(var_87, 6, new int[] {1});
		final Object var_89 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("dictionary");
		final Stub<Address<? extends Supplier>> var_90 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C2", "DT2"}), var_89);
		final TupleMask var_91 = new TupleMask(new int[] {4}, 7);
		final TupleMask var_92 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_93 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_94 = buildable.buildBetaNode(var_88, var_90, var_91, var_92, var_93, false);
		final Stub<Address<? extends Supplier>> var_95 = buildable.buildInjectivityChecker(var_94, 5, new int[] {7});
		final Stub<Address<? extends Supplier>> var_96 = buildable.buildInjectivityChecker(var_95, 7, new int[] {3});
		final Stub<Address<? extends Supplier>> var_97 = buildable.buildInjectivityChecker(var_96, 7, new int[] {4});
		final Stub<Address<? extends Supplier>> var_98 = buildable.buildInjectivityChecker(var_97, 7, new int[] {0});
		final Stub<Address<? extends Supplier>> var_99 = buildable.buildInjectivityChecker(var_98, 7, new int[] {2});
		final Stub<Address<? extends Supplier>> var_100 = buildable.buildInjectivityChecker(var_99, 7, new int[] {6});
		final Stub<Address<? extends Supplier>> var_101 = buildable.buildInjectivityChecker(var_100, 7, new int[] {1});
		final Object var_102 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode"))).getEStructuralFeature("components");
		final Stub<Address<? extends Supplier>> var_103 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"N2", "C2"}), var_102);
		final TupleMask var_104 = new TupleMask(new int[] {7}, 8);
		final TupleMask var_105 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_106 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_107 = buildable.buildBetaNode(var_101, var_103, var_104, var_105, var_106, false);
		final Stub<Address<? extends Supplier>> var_108 = buildable.buildInjectivityChecker(var_107, 5, new int[] {8});
		final Stub<Address<? extends Supplier>> var_109 = buildable.buildInjectivityChecker(var_108, 7, new int[] {8});
		final Stub<Address<? extends Supplier>> var_110 = buildable.buildInjectivityChecker(var_109, 3, new int[] {8});
		final Stub<Address<? extends Supplier>> var_111 = buildable.buildInjectivityChecker(var_110, 4, new int[] {8});
		final Stub<Address<? extends Supplier>> var_112 = buildable.buildInjectivityChecker(var_111, 0, new int[] {8});
		final Stub<Address<? extends Supplier>> var_113 = buildable.buildInjectivityChecker(var_112, 2, new int[] {8});
		final Stub<Address<? extends Supplier>> var_114 = buildable.buildInjectivityChecker(var_113, 6, new int[] {8});
		final Stub<Address<? extends Supplier>> var_115 = buildable.buildInjectivityChecker(var_114, 8, new int[] {1});
		final TupleMask var_116 = new TupleMask(new int[] {5, 7, 1}, 9);
		final Stub<Address<? extends Supplier>> var_117 = buildable.buildTrimmer(var_115, var_116);
		buildable.buildConnection(var_117, var_30);
		return var_30;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("test.shareSameLocation2".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("C1", 0);
			posMapping.put("C2", 1);
			posMapping.put("VLOCN1", 2);

		}
		return posMapping;
	}
}
