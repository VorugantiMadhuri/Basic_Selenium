package listeners_testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void suiteConfig() {
		Reporter.log("BeforeSuite",true);
	}
	@BeforeTest
	public void BeforeTest() {
		Reporter.log("@BeforeTest",true);
	}
	@BeforeClass
	public void BeforeClass() {
		Reporter.log("@BeforeClass",true);
	}
	@BeforeMethod
	public void BeforeMethod() {
		Reporter.log("@BeforeMethod",true);
	}
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("@AfterMethod",true);
	}
	@AfterClass
	public void AfterClass() {
		Reporter.log("@AfterClass",true);
	}
	
	@AfterTest
	public void AfterTest() {
		Reporter.log("@AfterTest",true);
	}
	
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("@AfterSuite",true);
	}

}
