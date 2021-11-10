package sdfc_testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities_salesforce.ListenersUtility;
@Listeners(ListenersUtility.class)
public class Sdfc_Login_test extends Base_test {
	
	@BeforeSuite
	public void website() throws IOException {
		apputil.Setup();
		apputil.LaunchApp();
		InitializeReports("Sdfc_login_");
	}

	@Test

	public void TC01_loginerror(Method name) {
		test = extent.createTest(name.getName());
		apputil.Login("");
		basicutil.waitForElement(2000);
		
		
		
	}

	@Test
	public void TC02_login(Method name) {

		test = extent.createTest(name.getName());
		apputil.Login("A");
		basicutil.waitForElement(2000);
		
		usermenu.usermenudropdown(0);
		usermenu.usermenudropdown(5);
		
		
		

	}

	
	  @Test
	  
	  public void TC03_rememberme(Method name) {
		  test = extent.createTest(name.getName());
		  driver.findElement(By.xpath("//*[@id=\"rememberUn\"]")).click();
		 
		  apputil.Login("A");
		  usermenu.usermenudropdown(0);
		  usermenu.usermenudropdown(5);
		  basicutil.waitForElement(2000);
			
	  
	  }
	  @Test
	  public void TC04A_forgotpassword(Method name) {
		  test = extent.createTest(name.getName());
			apputil.Forgotpassword("A");
			basicutil.waitForElement(2000);
			
	  }
	  @Test
	 public void TC04B_forgotpassword(Method name) {
		  test = extent.createTest(name.getName());
		  
			apputil.Forgotpassword("");
			basicutil.waitForElement(2000);
		
	 }
		
		  
	
	  @AfterSuite public void close() { 
	basicutil.waitForElement(2000);	 
	 driver.close(); 
	extent.flush();
	  
	  }
	 

}
