/*******************************************************************************
 * Pattern signature of the test.shareSameLocation2 pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.test;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the test.shareSameLocation2 pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class ShareSameLocation2Signature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public ShareSameLocation2Signature(Object C1, Object C2, Object VLOCN1) {
		this.fC1 = C1;
		this.fC2 = C2;
		this.fVLOCN1 = VLOCN1;	
	}

	//private attributes
	private Object fC1;
	private Object fC2;
	private Object fVLOCN1;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("C1".equals(parameterName)) return fC1;
		if ("C2".equals(parameterName)) return fC2;
		if ("VLOCN1".equals(parameterName)) return fVLOCN1;
		return null;
	}	
	
	public Object getValueOfC1(){
		 return fC1;
	}
	public Object getValueOfC2(){
		 return fC2;
	}
	public Object getValueOfVLOCN1(){
		 return fVLOCN1;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("C1".equals(parameterName)) {
			fC1 = newValue;
			return true;
		}
		if ("C2".equals(parameterName)) {
			fC2 = newValue;
			return true;
		}
		if ("VLOCN1".equals(parameterName)) {
			fVLOCN1 = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfC1(Object C1){
		 this.fC1=C1;
	}
	public void setValueOfC2(Object C2){
		 this.fC2=C2;
	}
	public void setValueOfVLOCN1(Object VLOCN1){
		 this.fVLOCN1=VLOCN1;
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
		if (!ShareSameLocation2Signature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		ShareSameLocation2Signature other = (ShareSameLocation2Signature) obj;
		if (fC1 == null) {if (other.fC1 != null) return false;}
		else if (!fC1.equals(other.fC1)) return false;
		if (fC2 == null) {if (other.fC2 != null) return false;}
		else if (!fC2.equals(other.fC2)) return false;
		if (fVLOCN1 == null) {if (other.fVLOCN1 != null) return false;}
		else if (!fVLOCN1.equals(other.fVLOCN1)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fC1 == null) ? 0 : fC1.hashCode());
		result = prime * result + ((fC2 == null) ? 0 : fC2.hashCode());
		result = prime * result + ((fVLOCN1 == null) ? 0 : fVLOCN1.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"C1\"=" + prettyPrintValue(fC1));
		result.append(", \"C2\"=" + prettyPrintValue(fC2));
		result.append(", \"VLOCN1\"=" + prettyPrintValue(fVLOCN1));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fC1, fC2, fVLOCN1};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "test.shareSameLocation2";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"C1", "C2", "VLOCN1"};
	
	
}
