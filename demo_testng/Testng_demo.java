package demo_testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Testng_demo {
	@Test()
	public void login() {
		SoftAssert sa = new SoftAssert();
		//HardAssert ha = new HardAssert();
	}

}
