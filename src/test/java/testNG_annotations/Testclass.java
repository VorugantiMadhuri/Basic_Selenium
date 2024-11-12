package testNG_annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testclass extends BaseClass{
@Test
	public void test() {
		Reporter.log("Testing the method");
	}
}
