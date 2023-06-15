package workingWithTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExecutionCondition {
	
	@Test (dependsOnMethods = "register")
	public void createAccount() {
		Reporter.log("From Create Account", true);
	}
	
	@Test (dependsOnMethods = {"register","createAccount"})
	public void modifyAccount() {
//		int i = 1/0; // Throws Exception so dependent method will not be executed
		Reporter.log("From Modify Account", true);
	}
	
	@Test 
	public void register() {
		Reporter.log("From Register", true);
	}
	
	@Test (dependsOnMethods = "createAccount")
	public void transferAmount() {
		Reporter.log("From Transfer Amount", true);
	}
	
	@Test (dependsOnMethods = {"createAccount","modifyAccount"})
	public void deleteAccount() {
		Reporter.log("From Delete Account", true);
	}

}
