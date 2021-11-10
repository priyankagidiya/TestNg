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
public class Random_scenerio_test extends Base_test {
	@BeforeSuite
	public void website() throws IOException {
		apputil.Setup();
		apputil.LaunchApp();
		InitializeReports(" Random_scenerio_ ");
	}
	
	@Test
	public void TC33_verifyname(Method name) {
		
		test = extent.createTest(name.getName());
		apputil.Login("A");
		createacc.Tabs("Home");
		
		 driver.findElement(By.cssSelector("#ptBody > div > div.content > span.pageType > h1 > a")).click();
		 basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC34_editname(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		
		apputil.Login("A");
		createacc.Tabs("Home");
		 driver.findElement(By.cssSelector("#ptBody > div > div.content > span.pageType > h1 > a")).click();
		usermenu.clickon_about();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC35_verifytab(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Home");
		random.Verifytab();
		apputil.Logout();
		apputil.Login("A");
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC36_blockevent(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Home");
		random.Block_event();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC37_blockevent1(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Home");
		createacc.Create_account_reports();
		basicutil.waitForElement(2000);
		
		
	}
	
	  
		 
	
	
	
	  @AfterSuite public void close() { 
		  basicutil.waitForElement(2000);  
	  driver.close(); 
	  extent.flush();
	  
	  }
	 

}
