package distributedParallel_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void demo1() {
		Reporter.log("Test4-demo1-smoke",true);
	}
	
	@Test
	public void demo2() {
		Reporter.log("Test4-demo2-smoke",true);
	}
	@Test
	public void demo3() {
		Reporter.log("Test4-demo3-smoke",true);
	}

}
