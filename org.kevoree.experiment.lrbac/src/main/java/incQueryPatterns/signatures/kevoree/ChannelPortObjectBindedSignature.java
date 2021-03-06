/*******************************************************************************
 * Pattern signature of the enforcementInfo.channelPortObjectBinded pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package incQueryPatterns.signatures.kevoree;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the enforcementInfo.channelPortObjectBinded pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class ChannelPortObjectBindedSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public ChannelPortObjectBindedSignature(Object OBJECT, Object CHANNEL, Object PORT, Object BINDING) {
		this.fOBJECT = OBJECT;
		this.fCHANNEL = CHANNEL;
		this.fPORT = PORT;
		this.fBINDING = BINDING;	
	}

	//private attributes
	private Object fOBJECT;
	private Object fCHANNEL;
	private Object fPORT;
	private Object fBINDING;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("OBJECT".equals(parameterName)) return fOBJECT;
		if ("CHANNEL".equals(parameterName)) return fCHANNEL;
		if ("PORT".equals(parameterName)) return fPORT;
		if ("BINDING".equals(parameterName)) return fBINDING;
		return null;
	}	
	
	public Object getValueOfOBJECT(){
		 return fOBJECT;
	}
	public Object getValueOfCHANNEL(){
		 return fCHANNEL;
	}
	public Object getValueOfPORT(){
		 return fPORT;
	}
	public Object getValueOfBINDING(){
		 return fBINDING;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("OBJECT".equals(parameterName)) {
			fOBJECT = newValue;
			return true;
		}
		if ("CHANNEL".equals(parameterName)) {
			fCHANNEL = newValue;
			return true;
		}
		if ("PORT".equals(parameterName)) {
			fPORT = newValue;
			return true;
		}
		if ("BINDING".equals(parameterName)) {
			fBINDING = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfOBJECT(Object OBJECT){
		 this.fOBJECT=OBJECT;
	}
	public void setValueOfCHANNEL(Object CHANNEL){
		 this.fCHANNEL=CHANNEL;
	}
	public void setValueOfPORT(Object PORT){
		 this.fPORT=PORT;
	}
	public void setValueOfBINDING(Object BINDING){
		 this.fBINDING=BINDING;
	}

	// overridden prettyPrint(), hashCode(), equals() with Tuple-semantics
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (! (obj instanceof IPatternSignature))
			return false;
		IPatternSignature otherSig = (IPatternSignature) obj;
		if (!patternName().equals(otherSig.patternName()))
			return false;
		if (!ChannelPortObjectBindedSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		ChannelPortObjectBindedSignature other = (ChannelPortObjectBindedSignature) obj;
		if (fOBJECT == null) {if (other.fOBJECT != null) return false;}
		else if (!fOBJECT.equals(other.fOBJECT)) return false;
		if (fCHANNEL == null) {if (other.fCHANNEL != null) return false;}
		else if (!fCHANNEL.equals(other.fCHANNEL)) return false;
		if (fPORT == null) {if (other.fPORT != null) return false;}
		else if (!fPORT.equals(other.fPORT)) return false;
		if (fBINDING == null) {if (other.fBINDING != null) return false;}
		else if (!fBINDING.equals(other.fBINDING)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fOBJECT == null) ? 0 : fOBJECT.hashCode());
		result = prime * result + ((fCHANNEL == null) ? 0 : fCHANNEL.hashCode());
		result = prime * result + ((fPORT == null) ? 0 : fPORT.hashCode());
		result = prime * result + ((fBINDING == null) ? 0 : fBINDING.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"OBJECT\"=" + prettyPrintValue(fOBJECT));
		result.append(", \"CHANNEL\"=" + prettyPrintValue(fCHANNEL));
		result.append(", \"PORT\"=" + prettyPrintValue(fPORT));
		result.append(", \"BINDING\"=" + prettyPrintValue(fBINDING));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fOBJECT, fCHANNEL, fPORT, fBINDING};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "enforcementInfo.channelPortObjectBinded";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"OBJECT", "CHANNEL", "PORT", "BINDING"};
	
	
}
