package testNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test
	public void registrationTest() {
		Reporter.log("register to app",true);
//		Assert.fail();
	}
	@Test(dependsOnMethods="registrationTest")
	public void loginTest() {
		Reporter.log("Login to App",true);
	}
	@Test(dependsOnMethods="registrationTest")
	public void updateProfileTest() {
		Reporter.log("Update Profile",true);
	}
}
