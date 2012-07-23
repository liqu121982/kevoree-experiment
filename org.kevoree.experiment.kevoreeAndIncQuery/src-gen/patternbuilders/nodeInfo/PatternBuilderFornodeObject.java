/*******************************************************************************
 * Pattern builder for pattern nodeInfo.nodeObject
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.nodeInfo;

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
 * Generated automatically from pattern nodeInfo.nodeObject
 */
public class PatternBuilderFornodeObject implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("nodeInfo.nodeObject".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("nodeInfo.nodeObject");
		
		final Address<? extends Receiver> var_141 = buildable.patternCollector("nodeInfo.nodeObject");
		final Stub<Address<? extends Supplier>> var_142 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_143 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("NamedElement"))).getEStructuralFeature("name");
		final Stub<Address<? extends Supplier>> var_144 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"TYPDEF", "TYPNAME"}), var_143);
		final TupleMask var_145 = new TupleMask(new int[] {}, 0);
		final TupleMask var_146 = new TupleMask(new int[] {}, 2);
		final TupleMask var_147 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_148 = buildable.buildBetaNode(var_142, var_144, var_145, var_146, var_147, false);
		final Stub<Address<? extends Supplier>> var_149 = buildable.buildInjectivityChecker(var_148, 0, new int[] {1});
		final AbstractEvaluator var_150 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(1).toString(),"AddressBook");
			}
		};
		final Stub<Address<? extends Supplier>> var_151 = buildable.buildPredicateChecker(var_150, null, new int[] {1}, var_149);
		final Object var_152 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("Instance"))).getEStructuralFeature("typeDefinition");
		final Stub<Address<? extends Supplier>> var_153 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"C", "TYPDEF"}), var_152);
		final TupleMask var_154 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_155 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_156 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_157 = buildable.buildBetaNode(var_151, var_153, var_154, var_155, var_156, false);
		final Stub<Address<? extends Supplier>> var_158 = buildable.buildInjectivityChecker(var_157, 2, new int[] {0});
		final Stub<Address<? extends Supplier>> var_159 = buildable.buildInjectivityChecker(var_158, 2, new int[] {1});
		final Object var_160 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://kevoree/1.0").getEClassifier("ContainerNode"))).getEStructuralFeature("components");
		final Stub<Address<? extends Supplier>> var_161 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"N", "C"}), var_160);
		final TupleMask var_162 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_163 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_164 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_165 = buildable.buildBetaNode(var_159, var_161, var_162, var_163, var_164, false);
		final Stub<Address<? extends Supplier>> var_166 = buildable.buildInjectivityChecker(var_165, 2, new int[] {3});
		final Stub<Address<? extends Supplier>> var_167 = buildable.buildInjectivityChecker(var_166, 3, new int[] {0});
		final Stub<Address<? extends Supplier>> var_168 = buildable.buildInjectivityChecker(var_167, 3, new int[] {1});
		final TupleMask var_169 = new TupleMask(new int[] {3}, 4);
		final Stub<Address<? extends Supplier>> var_170 = buildable.buildTrimmer(var_168, var_169);
		buildable.buildConnection(var_170, var_141);
		return var_141;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("nodeInfo.nodeObject".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("N", 0);

		}
		return posMapping;
	}
}