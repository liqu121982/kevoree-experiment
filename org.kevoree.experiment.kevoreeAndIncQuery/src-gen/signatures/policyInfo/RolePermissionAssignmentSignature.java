/*******************************************************************************
 * Pattern signature of the policyInfo.RolePermissionAssignment pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.policyInfo;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the policyInfo.RolePermissionAssignment pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class RolePermissionAssignmentSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public RolePermissionAssignmentSignature(Object ROLE, Object PERM) {
		this.fROLE = ROLE;
		this.fPERM = PERM;	
	}

	//private attributes
	private Object fROLE;
	private Object fPERM;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("ROLE".equals(parameterName)) return fROLE;
		if ("PERM".equals(parameterName)) return fPERM;
		return null;
	}	
	
	public Object getValueOfROLE(){
		 return fROLE;
	}
	public Object getValueOfPERM(){
		 return fPERM;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("ROLE".equals(parameterName)) {
			fROLE = newValue;
			return true;
		}
		if ("PERM".equals(parameterName)) {
			fPERM = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfROLE(Object ROLE){
		 this.fROLE=ROLE;
	}
	public void setValueOfPERM(Object PERM){
		 this.fPERM=PERM;
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
		if (!RolePermissionAssignmentSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		RolePermissionAssignmentSignature other = (RolePermissionAssignmentSignature) obj;
		if (fROLE == null) {if (other.fROLE != null) return false;}
		else if (!fROLE.equals(other.fROLE)) return false;
		if (fPERM == null) {if (other.fPERM != null) return false;}
		else if (!fPERM.equals(other.fPERM)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fROLE == null) ? 0 : fROLE.hashCode());
		result = prime * result + ((fPERM == null) ? 0 : fPERM.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"ROLE\"=" + prettyPrintValue(fROLE));
		result.append(", \"PERM\"=" + prettyPrintValue(fPERM));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fROLE, fPERM};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "policyInfo.RolePermissionAssignment";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"ROLE", "PERM"};
	
	
}
