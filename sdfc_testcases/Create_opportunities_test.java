package sdfc_testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import utilities_salesforce.ListenersUtility;
@Listeners(ListenersUtility.class)
public class Create_opportunities_test extends Base_test{
	@BeforeSuite
	public void website() throws IOException {
		apputil.Setup();
		apputil.LaunchApp();
		InitializeReports(" Create_opportunities_");
	}
	@Test
	public void TC15_opportunitieslink(Method name) {
		test = extent.createTest(name.getName());
		apputil.Login("A");
		createacc.Tabs("Opportunities");
		driver.findElement(By.cssSelector("#fcf")).click();
		test.log(Status.INFO, "Opportunities dropdown is present");
		basicutil.waitForElement(2000);
		
		
		
	}
	@Test
	public void TC16_createnewoppt(Method name) {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Opportunities");
		createopp.Create_new_oppt();
		
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC17_opptpipeline(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Opportunities");
		 driver.findElement(By.linkText("Opportunity Pipeline")).click();
		
		 basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC18_stuckoppt(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Opportunities");
		driver.findElement(By.linkText("Stuck Opportunities")).click();
		 test.log(Status.INFO, "Stuck opportunities displayed");
		 basicutil.waitForElement(2000);


		
	}
	@Test
	public void TC19_quarterlyreport(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Opportunities");
		createopp.Quarterly_report();
		basicutil.waitForElement(2000);
		
		
	}
	
	
	
	
	  @AfterSuite public void close() { 
		  basicutil.waitForElement(2000);
	  driver.close(); 
	  extent.flush();
	  
	  }
	 
	 

}
