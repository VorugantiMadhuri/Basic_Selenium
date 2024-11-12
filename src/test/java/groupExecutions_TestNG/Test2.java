package groupExecutions_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test(groups="smoke")
	public void demo1() {
		Reporter.log("Test2-demo1-smoke",true);
	}
	
	@Test(groups="sanity")
	public void demo2() {
		Reporter.log("Test2-demo1-smoke",true);
	}
	
	@Test(groups={"smoke","sanity"})
	public void demo3() {
		Reporter.log("Test2-demo1-smoke",true);
	}
}