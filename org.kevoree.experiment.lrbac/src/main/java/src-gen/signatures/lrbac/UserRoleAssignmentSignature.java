/*******************************************************************************
 * Pattern signature of the lrbac.userRoleAssignment pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package signatures.lrbac;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra2.emf.incquery.runtime.api.IPatternSignature;
import org.eclipse.viatra2.emf.incquery.runtime.api.impl.BasePatternSignature;

/**
 * Pattern-specific signature object of the lrbac.userRoleAssignment pattern.
 * Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable e.g. to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 */
@SuppressWarnings("unused")
public final class UserRoleAssignmentSignature extends BasePatternSignature implements IPatternSignature {

	// constructor
	public UserRoleAssignmentSignature(Object USER, Object ROLE) {
		this.fUSER = USER;
		this.fROLE = ROLE;	
	}

	//private attributes
	private Object fUSER;
	private Object fROLE;
	
	// getter methods
	/** Returns the value of the parameter with the given name, or null if name is invalid. */
	@Override
	public Object get(String parameterName) {
		if ("USER".equals(parameterName)) return fUSER;
		if ("ROLE".equals(parameterName)) return fROLE;
		return null;
	}	
	
	public Object getValueOfUSER(){
		 return fUSER;
	}
	public Object getValueOfROLE(){
		 return fROLE;
	}	
	
	// setter methods
	/** 
	 * Sets the parameter with the given name to the given value. 
	 * @returns true if successful, false if parameter name is invalid. May also fail and return false if the value type is incompatible. 
	 */
	@Override
	public boolean set(String parameterName, Object newValue) {
		if ("USER".equals(parameterName)) {
			fUSER = newValue;
			return true;
		}
		if ("ROLE".equals(parameterName)) {
			fROLE = newValue;
			return true;
		}
		return false;
	}
	
	public void setValueOfUSER(Object USER){
		 this.fUSER=USER;
	}
	public void setValueOfROLE(Object ROLE){
		 this.fROLE=ROLE;
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
		if (!UserRoleAssignmentSignature.class.equals(obj.getClass()))
			return Arrays.deepEquals(toArray(), otherSig.toArray());
		UserRoleAssignmentSignature other = (UserRoleAssignmentSignature) obj;
		if (fUSER == null) {if (other.fUSER != null) return false;}
		else if (!fUSER.equals(other.fUSER)) return false;
		if (fROLE == null) {if (other.fROLE != null) return false;}
		else if (!fROLE.equals(other.fROLE)) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fUSER == null) ? 0 : fUSER.hashCode());
		result = prime * result + ((fROLE == null) ? 0 : fROLE.hashCode());
		return result;
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		result.append("\"USER\"=" + prettyPrintValue(fUSER));
		result.append(", \"ROLE\"=" + prettyPrintValue(fROLE));
		return result.toString();
	}

	// conversion and reflection
	/** Converts the signature to an array representation, with each pattern parameter at their respective position */
	@Override
	public Object[] toArray() {
		return new Object[] {fUSER, fROLE};
	}
	
	/** Identifies the name of the pattern for which this is a signature. */
	@Override
	public String patternName() {
		return "lrbac.userRoleAssignment";
	}
	
	/** Returns the list of symbolic parameter names. */
	@Override
	public String[] parameterNames() {
		return parameterNames;
	}
	private static String[] parameterNames = {"USER", "ROLE"};
	
	
}
