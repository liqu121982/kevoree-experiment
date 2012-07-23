/*******************************************************************************
 * EMF Specific API of the enforcementInfo.binding pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package incQueryPatterns.patternmatchers.kevoree;

import java.util.Collection;

import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IMatcherFactory;
import org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.ReteEngine;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import incQueryPatterns.signatures.kevoree.BindingSignature;

/**
 * Generated domain-specific pattern matcher API of of the enforcementInfo.binding pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class BindingMatcher extends BaseGeneratedMatcher<BindingSignature> implements IncQueryMatcher<BindingSignature>{

	public final static IMatcherFactory<BindingSignature,BindingMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<BindingSignature,BindingMatcher> {
			@Override
			public BindingMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new BindingMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "enforcementInfo.binding";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param B the fixed value of pattern parameter B, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object B) {
		return getAllMatchesAsArray(new Object[] {B});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param B the fixed value of pattern parameter B, or null if not bound.
	 * @return matches represented as a BindingSignature object.
	 */
	public Collection<BindingSignature> getAllMatchesAsSignature(Object B) {
		return getAllMatchesAsSignature(new Object[] {B});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param B the fixed value of pattern parameter B, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object B) {
		return getOneMatchAsArray(new Object[] {B});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param B the fixed value of pattern parameter B, or null if not bound.
	 * @return a match represented as a BindingSignature object, or null if no match is found.
	 */
	public BindingSignature getOneMatchAsSignature(Object B) {
		return getOneMatchAsSignature(new Object[] {B});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param B the fixed value of pattern parameter B, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object B) {
		return hasMatch(new Object[] {B});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param B the fixed value of pattern parameter B, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object B) {
		return countMatches(new Object[] {B});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "enforcementInfo.binding";
	}

	private static final String[] paramNames = new String[] {"B"};
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getParameterNames()
	 */
	@Override
	public String[] getParameterNames() {
		return paramNames;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.impl.BaseGeneratedMatcher#tupleToSignature(org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple)
	 */
	@Override
	protected BindingSignature tupleToSignature(Tuple t) {
		return new BindingSignature(t.get(0));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public BindingSignature arrayToSignature(Object[] signature) {
		return new BindingSignature(signature[0]);
	}	
	
	private BindingMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "enforcementInfo.binding");
	}
		
}
