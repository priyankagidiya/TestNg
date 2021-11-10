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
public class Leads_test extends Base_test {
	@BeforeSuite
	public void website() throws IOException {
		apputil.Setup();
		apputil.LaunchApp();
		InitializeReports(" Leads_ ");
	}
	
	@Test
	public void TC20_clickleads(Method name) {
		
		test = extent.createTest(name.getName());
		apputil.Login("A");
		createacc.Tabs("Leads");
		test.log(Status.INFO, "clicked on lead tab");
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC21_viewdropdown(Method name) {
		test = extent.createTest(name.getName());
		
		//apputil.Login("A");
		createacc.Tabs("Leads");
		driver.findElement(By.id("fcf")).click();
		test.log(Status.INFO, "dropdown visible");
		
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC22_todaysleads(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Leads");
		lead.Todays_leads();
		basicutil.waitForElement(2000);
		test.log(Status.INFO, "todays lead page is displayed");
		
	}
	@Test
	public void TC23_todaysleads1(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Leads");
		driver.findElement(By.id("fcf")).click();
		test.log(Status.INFO, "dropdown visible");
		basicutil.waitForElement(2000);
		test.log(Status.INFO, "validated todays lead");
		
	}
	@Test
	public void TC24_newleads(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Leads");
		lead.New_leads();
		basicutil.waitForElement(2000);
		test.log(Status.INFO, "New lead is created");
		
	}
	
	  
		 
	
	
	
	  @AfterSuite public void close() { 
		  basicutil.waitForElement(2000);  
	  driver.close(); 
	  extent.flush();
	  
	  }
	 

}
