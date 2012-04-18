package transformations;

import org.eclipse.viatra2.emf.incquery.runtime.exception.IncQueryRuntimeException;
import org.eclipse.viatra2.emf.incquery.runtime.extensibility.BuilderRegistry;

import patternbuilders.policyInfo.PatternBuilderForobject;
import patternbuilders.policyInfo.PatternBuilderForpermission;
import patternbuilders.policyInfo.PatternBuilderForrole;
import patternbuilders.policyInfo.PatternBuilderForsession;
import patternbuilders.policyInfo.PatternBuilderForuser;
import patternbuilders.policyInfo.PatternBuilderForuserOperation;
import patternbuilders.policyInfo.PatternBuilderForuserRule;
import patternmatchers.policyInfo.ObjectMatcher;
import patternmatchers.policyInfo.PermissionMatcher;
import patternmatchers.policyInfo.RoleMatcher;
import patternmatchers.policyInfo.SessionMatcher;
import patternmatchers.policyInfo.UserMatcher;
import patternmatchers.policyInfo.UserOperationMatcher;
import patternmatchers.policyInfo.UserRuleMatcher;
import rbac.Operation;
import rbac.Permission;
import rbac.Policy;
import rbac.Resource;
import rbac.Role;
import rbac.Session;
import rbac.User;
import signatures.policyInfo.ObjectSignature;
import signatures.policyInfo.PermissionSignature;
import signatures.policyInfo.RoleSignature;
import signatures.policyInfo.SessionSignature;
import signatures.policyInfo.UserOperationSignature;
import signatures.policyInfo.UserRuleSignature;
import signatures.policyInfo.UserSignature;

public class Policy2PolicyScript {

	private Policy policy;
	
	private UserMatcher userMatcher;
	private RoleMatcher roleMatcher;
	private PermissionMatcher permissionMatcher;
	private ObjectMatcher objectMatcher;
	private SessionMatcher sessionMatcher;
	private UserOperationMatcher userOperationMatcher;
	private UserRuleMatcher userRuleMatcher;

	public Policy2PolicyScript(Policy p) {
		policy = p;
		BuilderRegistry.getContributedStatelessPatternBuilders().put(UserMatcher.FACTORY.getPatternName(),new PatternBuilderForuser());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(RoleMatcher.FACTORY.getPatternName(),new PatternBuilderForrole());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(PermissionMatcher.FACTORY.getPatternName(),new PatternBuilderForpermission());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(ObjectMatcher.FACTORY.getPatternName(),new PatternBuilderForobject());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(SessionMatcher.FACTORY.getPatternName(),new PatternBuilderForsession());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(UserOperationMatcher.FACTORY.getPatternName(),	new PatternBuilderForuserOperation());
		BuilderRegistry.getContributedStatelessPatternBuilders().put(UserRuleMatcher.FACTORY.getPatternName(),new PatternBuilderForuserRule());
		try {
			userMatcher = UserMatcher.FACTORY.getMatcher(policy);
			roleMatcher = RoleMatcher.FACTORY.getMatcher(policy);
			permissionMatcher = PermissionMatcher.FACTORY.getMatcher(policy);
			objectMatcher = ObjectMatcher.FACTORY.getMatcher(policy);
			sessionMatcher = SessionMatcher.FACTORY.getMatcher(policy);
			userOperationMatcher = UserOperationMatcher.FACTORY.getMatcher(policy);
			userRuleMatcher = UserRuleMatcher.FACTORY.getMatcher(policy);
		} catch (IncQueryRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
	//user	
	public String addSubjects(){
		String script = "";
		for(UserSignature sig : userMatcher.getAllMatchesAsSignature()){
			String userName = ((User)sig.getValueOfU()).getName();
			script = script + "\n" + "addUser(" + userName+");";	
		}
		return script;
	}
	
	//role		
	public String addRoles(){
		String script = "";
		for(RoleSignature sig : roleMatcher.getAllMatchesAsSignature()){
			String roleName = ((Role)sig.getValueOfR()).getName();
			script = script + "\n" + "addRole(" + roleName+");";	
		}
		return script;
	}
	
	//permission
	public String addPermissions(){
		String script = "";
		for(PermissionSignature sig : permissionMatcher.getAllMatchesAsSignature()){
			String permissionName = ((Permission)sig.getValueOfP()).getName();
			script = script + "\n" + "addPermission(" + permissionName+");";	
		}
		return script;
	}
	
	//session
	public String addSessions(){
		String script = "";
		for(SessionSignature sig : sessionMatcher.getAllMatchesAsSignature()){
			String sessionName = ((Session)sig.getValueOfS()).getName();
			script = script + "\n" + "addSession(" + sessionName+");";	
		}
		return script;
	}

	//object
	public String addObjects(){
		String script = "";
		for(ObjectSignature sig : objectMatcher.getAllMatchesAsSignature()){
			String objectName = ((Resource)sig.getValueOfOB()).getName();
			script = script + "\n" + "addObject(" + objectName+");";
		}
		return script;
	}
	
	//usersOperations
	public String addUserOperations(){
		String script = "";
		for (UserOperationSignature sig : userOperationMatcher.getAllMatchesAsSignature()){
			System.out.println("sig : "+sig.getValueOfUSER()+" : "+sig.getValueOfOPERATIONNAME());
		}
		for (UserOperationSignature sig : userOperationMatcher.getAllMatchesAsSignature()){
			String userName = ((User)sig.getValueOfUSER()).getName();
			String operationName = sig.getValueOfOPERATIONNAME().toString();
		}
		return script;
	}
	
	//userRules
	public String addUserRules(){
		String script = "";
		int cpt=0;
		for(UserRuleSignature sig : userRuleMatcher.getAllMatchesAsSignature()){
			String userName = ((User)sig.getValueOfUSER()).getName();
			String objectName = ((Resource)sig.getValueOfOBJECT()).getName();
			String operationName = ((Operation)sig.getValueOfOPERATION()).getName();
			script = script + "\n" + "rule"+cpt+" "+ userName+"."+operationName+"."+objectName;
			cpt = cpt+1;
		}
		return script;
	}
	
	
	public String transfo(){
		String script ="PolicyScript{\n";
		script = script + addSubjects() +"\n";
		script = script + addRoles()+"\n";
		script = script + addPermissions()+"\n";
		script = script + addObjects()+"\n";
		script = script + addSessions()+"\n";
		//script = script + addUserRules()+"\n";		
		script = script+"\n }";
		return script;
	}

}
