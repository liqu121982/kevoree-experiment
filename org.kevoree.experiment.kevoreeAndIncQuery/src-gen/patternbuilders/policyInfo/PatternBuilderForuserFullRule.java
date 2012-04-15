/*******************************************************************************
 * Pattern builder for pattern policyInfo.userFullRule
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.emf.incquery.codegen.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.policyInfo;

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
 * Generated automatically from pattern policyInfo.userFullRule
 */
public class PatternBuilderForuserFullRule implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("policyInfo.userFullRule".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("policyInfo.userFullRule");
		
		final Address<? extends Receiver> var_133 = buildable.patternCollector("policyInfo.userFullRule");
		final Stub<Address<? extends Supplier>> var_134 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_135 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("Role"))).getEStructuralFeature("permissions");
		final Stub<Address<? extends Supplier>> var_136 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"ROLE", "PERMISSION"}), var_135);
		final TupleMask var_137 = new TupleMask(new int[] {}, 0);
		final TupleMask var_138 = new TupleMask(new int[] {}, 2);
		final TupleMask var_139 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_140 = buildable.buildBetaNode(var_134, var_136, var_137, var_138, var_139, false);
		final Stub<Address<? extends Supplier>> var_141 = buildable.buildInjectivityChecker(var_140, 1, new int[] {0});
		final Object var_142 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("Permission"))).getEStructuralFeature("operations");
		final Stub<Address<? extends Supplier>> var_143 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"PERMISSION", "OPERATION"}), var_142);
		final TupleMask var_144 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_145 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_146 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_147 = buildable.buildBetaNode(var_141, var_143, var_144, var_145, var_146, false);
		final Stub<Address<? extends Supplier>> var_148 = buildable.buildInjectivityChecker(var_147, 2, new int[] {1});
		final Stub<Address<? extends Supplier>> var_149 = buildable.buildInjectivityChecker(var_148, 2, new int[] {0});
		final Object var_150 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("Operation"))).getEStructuralFeature("resources");
		final Stub<Address<? extends Supplier>> var_151 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"OPERATION", "OBJECT"}), var_150);
		final TupleMask var_152 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_153 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_154 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_155 = buildable.buildBetaNode(var_149, var_151, var_152, var_153, var_154, false);
		final Stub<Address<? extends Supplier>> var_156 = buildable.buildInjectivityChecker(var_155, 3, new int[] {2});
		final Stub<Address<? extends Supplier>> var_157 = buildable.buildInjectivityChecker(var_156, 3, new int[] {1});
		final Stub<Address<? extends Supplier>> var_158 = buildable.buildInjectivityChecker(var_157, 3, new int[] {0});
		final Object var_159 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("rbac.rbac").getEClassifier("User"))).getEStructuralFeature("assignedRoles");
		final Stub<Address<? extends Supplier>> var_160 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"USER", "ROLE"}), var_159);
		final TupleMask var_161 = new TupleMask(new int[] {0}, 4);
		final TupleMask var_162 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_163 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_164 = buildable.buildBetaNode(var_158, var_160, var_161, var_162, var_163, false);
		final Stub<Address<? extends Supplier>> var_165 = buildable.buildInjectivityChecker(var_164, 3, new int[] {4});
		final Stub<Address<? extends Supplier>> var_166 = buildable.buildInjectivityChecker(var_165, 2, new int[] {4});
		final Stub<Address<? extends Supplier>> var_167 = buildable.buildInjectivityChecker(var_166, 1, new int[] {4});
		final Stub<Address<? extends Supplier>> var_168 = buildable.buildInjectivityChecker(var_167, 0, new int[] {4});
		final TupleMask var_169 = new TupleMask(new int[] {4, 0, 1, 2, 3}, 5);
		final Stub<Address<? extends Supplier>> var_170 = buildable.buildTrimmer(var_168, var_169);
		buildable.buildConnection(var_170, var_133);
		return var_133;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("policyInfo.userFullRule".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("USER", 0);
			posMapping.put("ROLE", 1);
			posMapping.put("PERMISSION", 2);
			posMapping.put("OPERATION", 3);
			posMapping.put("OBJECT", 4);

		}
		return posMapping;
	}
}
