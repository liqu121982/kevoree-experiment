/*******************************************************************************
 * Pattern signature of the enforcementInfo.authorization pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.enforcementInfo;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the enforcementInfo.authorization pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class AuthorizationSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public AuthorizationSignature(Object SUBJECT, Object CHANNEL, Object OBJECT, Object PORTSUB, Object PORTOBJ, Object BINDINGSUBCHA, Object BINDINGCHAOBJ) {
		this.fSUBJECT = SUBJECT;
		this.fCHANNEL = CHANNEL;
		this.fOBJECT = OBJECT;
		this.fPORTSUB = PORTSUB;
		this.fPORTOBJ = PORTOBJ;
		this.fBINDINGSUBCHA = BINDINGSUBCHA;
		this.fBINDINGCHAOBJ = BINDINGCHAOBJ;	
	}

	//private attributes
	private Object fSUBJECT;
	private Object fCHANNEL;
	private Object fOBJECT;
	private Object fPORTSUB;
	private Object fPORTOBJ;
	private Object fBINDINGSUBCHA;
	private Object fBINDINGCHAOBJ;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("SUBJECT".equals(parameterName)) return fSUBJECT;
		if ("CHANNEL".equals(parameterName)) return fCHANNEL;
		if ("OBJECT".equals(parameterName)) return fOBJECT;
		if ("PORTSUB".equals(parameterName)) return fPORTSUB;
		if ("PORTOBJ".equals(parameterName)) return fPORTOBJ;
		if ("BINDINGSUBCHA".equals(parameterName)) return fBINDINGSUBCHA;
		if ("BINDINGCHAOBJ".equals(parameterName)) return fBINDINGCHAOBJ;
		return null;
	}	
	
	public Object getValueOfSUBJECT(){
		 return fSUBJECT;
	}
	public Object getValueOfCHANNEL(){
		 return fCHANNEL;
	}
	public Object getValueOfOBJECT(){
		 return fOBJECT;
	}
	public Object getValueOfPORTSUB(){
		 return fPORTSUB;
	}
	public Object getValueOfPORTOBJ(){
		 return fPORTOBJ;
	}
	public Object getValueOfBINDINGSUBCHA(){
		 return fBINDINGSUBCHA;
	}
	public Object getValueOfBINDINGCHAOBJ(){
		 return fBINDINGCHAOBJ;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("SUBJECT".equals(parameterName)) {
			fSUBJECT = newValue;
			return true;
		}
		if ("CHANNEL".equals(parameterName)) {
			fCHANNEL = newValue;
			return true;
		}
		if ("OBJECT".equals(parameterName)) {
			fOBJECT = newValue;
			return true;
		}
		if ("PORTSUB".equals(parameterName)) {
			fPORTSUB = newValue;
			return true;
		}
		if ("PORTOBJ".equals(parameterName)) {
			fPORTOBJ = newValue;
			return true;
		}
		if ("BINDINGSUBCHA".equals(parameterName)) {
			fBINDINGSUBCHA = newValue;
			return true;
		}
		if ("BINDINGCHAOBJ".equals(parameterName)) {
			fBINDINGCHAOBJ = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfSUBJECT(Object SUBJECT){
		 this.fSUBJECT=SUBJECT;
	}
	public void setValueOfCHANNEL(Object CHANNEL){
		 this.fCHANNEL=CHANNEL;
	}
	public void setValueOfOBJECT(Object OBJECT){
		 this.fOBJECT=OBJECT;
	}
	public void setValueOfPORTSUB(Object PORTSUB){
		 this.fPORTSUB=PORTSUB;
	}
	public void setValueOfPORTOBJ(Object PORTOBJ){
		 this.fPORTOBJ=PORTOBJ;
	}
	public void setValueOfBINDINGSUBCHA(Object BINDINGSUBCHA){
		 this.fBINDINGSUBCHA=BINDINGSUBCHA;
	}
	public void setValueOfBINDINGCHAOBJ(Object BINDINGCHAOBJ){
		 this.fBINDINGCHAOBJ=BINDINGCHAOBJ;
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
		if (!AuthorizationSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		AuthorizationSignature other = (AuthorizationSignature) obj;
		if (fSUBJECT == null) {if (other.fSUBJECT != null) return false;}
		else if (!fSUBJECT.equals(other.fSUBJECT)) return false;
		if (fCHANNEL == null) {if (other.fCHANNEL != null) return false;}
		else if (!fCHANNEL.equals(other.fCHANNEL)) return false;
		if (fOBJECT == null) {if (other.fOBJECT != null) return false;}
		else if (!fOBJECT.equals(other.fOBJECT)) return false;
		if (fPORTSUB == null) {if (other.fPORTSUB != null) return false;}
		else if (!fPORTSUB.equals(other.fPORTSUB)) return false;
		if (fPORTOBJ == null) {if (other.fPORTOBJ != null) return false;}
		else if (!fPORTOBJ.equals(other.fPORTOBJ)) return false;
		if (fBINDINGSUBCHA == null) {if (other.fBINDINGSUBCHA != null) return false;}
		else if (!fBINDINGSUBCHA.equals(other.fBINDINGSUBCHA)) return false;
		if (fBINDINGCHAOBJ == null) {if (other.fBINDINGCHAOBJ != null) return false;}
		else if (!fBINDINGCHAOBJ.equals(other.fBINDINGCHAOBJ)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fSUBJECT == null) ? 0 : fSUBJECT.hashCode());
		result = prime * result + ((fCHANNEL == null) ? 0 : fCHANNEL.hashCode());
		result = prime * result + ((fOBJECT == null) ? 0 : fOBJECT.hashCode());
		result = prime * result + ((fPORTSUB == null) ? 0 : fPORTSUB.hashCode());
		result = prime * result + ((fPORTOBJ == null) ? 0 : fPORTOBJ.hashCode());
		result = prime * result + ((fBINDINGSUBCHA == null) ? 0 : fBINDINGSUBCHA.hashCode());
		result = prime * result + ((fBINDINGCHAOBJ == null) ? 0 : fBINDINGCHAOBJ.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"SUBJECT\"=" + prettyPrintValue(fSUBJECT));
		result.append(", \"CHANNEL\"=" + prettyPrintValue(fCHANNEL));
		result.append(", \"OBJECT\"=" + prettyPrintValue(fOBJECT));
		result.append(", \"PORTSUB\"=" + prettyPrintValue(fPORTSUB));
		result.append(", \"PORTOBJ\"=" + prettyPrintValue(fPORTOBJ));
		result.append(", \"BINDINGSUBCHA\"=" + prettyPrintValue(fBINDINGSUBCHA));
		result.append(", \"BINDINGCHAOBJ\"=" + prettyPrintValue(fBINDINGCHAOBJ));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fSUBJECT, fCHANNEL, fOBJECT, fPORTSUB, fPORTOBJ, fBINDINGSUBCHA, fBINDINGCHAOBJ};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "enforcementInfo.authorization";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"SUBJECT", "CHANNEL", "OBJECT", "PORTSUB", "PORTOBJ", "BINDINGSUBCHA", "BINDINGCHAOBJ"};
	
	
}
