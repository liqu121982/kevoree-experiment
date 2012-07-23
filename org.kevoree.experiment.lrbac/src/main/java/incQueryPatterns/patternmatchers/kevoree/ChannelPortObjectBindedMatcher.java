/*******************************************************************************
 * EMF Specific API of the enforcementInfo.channelPortObjectBinded pattern
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

import incQueryPatterns.signatures.kevoree.ChannelPortObjectBindedSignature;

/**
 * Generated domain-specific pattern matcher API of of the enforcementInfo.channelPortObjectBinded pattern.
 * Please instantiate using the static field FACTORY.
 */
@SuppressWarnings("unused")
public class ChannelPortObjectBindedMatcher extends BaseGeneratedMatcher<ChannelPortObjectBindedSignature> implements IncQueryMatcher<ChannelPortObjectBindedSignature>{

	public final static IMatcherFactory<ChannelPortObjectBindedSignature,ChannelPortObjectBindedMatcher> FACTORY = new Factory();
	public static class Factory extends BaseMatcherFactory<ChannelPortObjectBindedSignature,ChannelPortObjectBindedMatcher> {
			@Override
			public ChannelPortObjectBindedMatcher instantiate(ReteEngine<String> reteEngine) throws IncQueryRuntimeException {
				return new ChannelPortObjectBindedMatcher(reteEngine);
			}
			@Override
			public String getPatternName() {
				return "enforcementInfo.channelPortObjectBinded";
			}
		} 
			
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @param CHANNEL the fixed value of pattern parameter CHANNEL, or null if not bound.
	 * @param PORT the fixed value of pattern parameter PORT, or null if not bound.
	 * @param BINDING the fixed value of pattern parameter BINDING, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object OBJECT, Object CHANNEL, Object PORT, Object BINDING) {
		return getAllMatchesAsArray(new Object[] {OBJECT, CHANNEL, PORT, BINDING});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @param CHANNEL the fixed value of pattern parameter CHANNEL, or null if not bound.
	 * @param PORT the fixed value of pattern parameter PORT, or null if not bound.
	 * @param BINDING the fixed value of pattern parameter BINDING, or null if not bound.
	 * @return matches represented as a ChannelPortObjectBindedSignature object.
	 */
	public Collection<ChannelPortObjectBindedSignature> getAllMatchesAsSignature(Object OBJECT, Object CHANNEL, Object PORT, Object BINDING) {
		return getAllMatchesAsSignature(new Object[] {OBJECT, CHANNEL, PORT, BINDING});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @param CHANNEL the fixed value of pattern parameter CHANNEL, or null if not bound.
	 * @param PORT the fixed value of pattern parameter PORT, or null if not bound.
	 * @param BINDING the fixed value of pattern parameter BINDING, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object OBJECT, Object CHANNEL, Object PORT, Object BINDING) {
		return getOneMatchAsArray(new Object[] {OBJECT, CHANNEL, PORT, BINDING});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @param CHANNEL the fixed value of pattern parameter CHANNEL, or null if not bound.
	 * @param PORT the fixed value of pattern parameter PORT, or null if not bound.
	 * @param BINDING the fixed value of pattern parameter BINDING, or null if not bound.
	 * @return a match represented as a ChannelPortObjectBindedSignature object, or null if no match is found.
	 */
	public ChannelPortObjectBindedSignature getOneMatchAsSignature(Object OBJECT, Object CHANNEL, Object PORT, Object BINDING) {
		return getOneMatchAsSignature(new Object[] {OBJECT, CHANNEL, PORT, BINDING});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @param CHANNEL the fixed value of pattern parameter CHANNEL, or null if not bound.
	 * @param PORT the fixed value of pattern parameter PORT, or null if not bound.
	 * @param BINDING the fixed value of pattern parameter BINDING, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object OBJECT, Object CHANNEL, Object PORT, Object BINDING) {
		return hasMatch(new Object[] {OBJECT, CHANNEL, PORT, BINDING});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param OBJECT the fixed value of pattern parameter OBJECT, or null if not bound.
	 * @param CHANNEL the fixed value of pattern parameter CHANNEL, or null if not bound.
	 * @param PORT the fixed value of pattern parameter PORT, or null if not bound.
	 * @param BINDING the fixed value of pattern parameter BINDING, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object OBJECT, Object CHANNEL, Object PORT, Object BINDING) {
		return countMatches(new Object[] {OBJECT, CHANNEL, PORT, BINDING});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "enforcementInfo.channelPortObjectBinded";
	}

	private static final String[] paramNames = new String[] {"OBJECT", "CHANNEL", "PORT", "BINDING"};
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
	protected ChannelPortObjectBindedSignature tupleToSignature(Tuple t) {
		return new ChannelPortObjectBindedSignature(t.get(0), t.get(1), t.get(2), t.get(3));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.emf.incquery.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public ChannelPortObjectBindedSignature arrayToSignature(Object[] signature) {
		return new ChannelPortObjectBindedSignature(signature[0], signature[1], signature[2], signature[3]);
	}	
	
	private ChannelPortObjectBindedMatcher(ReteEngine<String> engine) throws IncQueryRuntimeException {
		super(engine, "enforcementInfo.channelPortObjectBinded");
	}
		
}