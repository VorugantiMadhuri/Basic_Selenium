package listeners_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners_testng.ListenerImplementation.class)

public class Testclass extends BaseClass{
	
@Test

	public void test1() {
		Reporter.log("Testing the method");
		Assert.fail();
	}
@Test(dependsOnMethods="test1")
public void test() {
	Reporter.log("Testing the method");
	Assert.fail();
}
}
