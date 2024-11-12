package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Combinationflags {
	@Test(enabled=false,invocationCount=-1)
	public void demo() {
		Reporter.log("demo",true);
	}
	@Test(invocationCount=-1,priority=0)
	public void demo1() {
		Reporter.log("demo1",true);
	}
	@Test(invocationCount=0)
	public void demo2() {
		Reporter.log("demo2",true);
	}
}
