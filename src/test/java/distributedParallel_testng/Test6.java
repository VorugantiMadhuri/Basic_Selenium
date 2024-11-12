package distributedParallel_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {
	
	@Test
	public void demo1() {
		Reporter.log("Test6-demo1-smoke",true);
	}
	
	@Test
	public void demo2() {
		Reporter.log("Test6-demo2-smoke",true);
	}
	@Test
	public void demo3() {
		Reporter.log("Test6-demo3-smoke",true);
	}

}
