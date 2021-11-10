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
public class Contacts_test extends Base_test {
	@BeforeSuite
	public void website() throws IOException {
		apputil.Setup();
		apputil.LaunchApp();
		InitializeReports(" Contacts_ ");
	}
	
	@Test
	public void TC25_createnewcontact(Method name) throws InterruptedException {
		
		test = extent.createTest(name.getName());
		apputil.Login("A");
		createacc.Tabs("Contacts");
		contact.Create_new_contact();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC26_createnewview(Method name) {
		test = extent.createTest(name.getName());
		
		//apputil.Login("A");
		createacc.Tabs("Contacts");
		contact.Create_newview("A");
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC27_recentlycreated(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Contacts");
		driver.findElement(By.id("hotlist_mode")).click();
		 driver.findElement(By.cssSelector("#hotlist_mode > option:nth-child(1)")).click();
		 basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC28_mycontacts(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Contacts");
		driver.findElement(By.id("fcf")).click();
		  driver.findElement(By.cssSelector("#fcf > option:nth-child(4)")).click();
		  basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC29_viewcontact(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Contacts");
		 driver.findElement(By.cssSelector("#bodyCell > div.bRelatedList > div.hotListElement > div > div.pbBody > table > tbody > tr.dataRow.even.first > th > a")).click();
		 basicutil.waitForElement(2000);
		
		
	}
	
	@Test
	public void TC30_errormessage_newview(Method name) {
		test = extent.createTest(name.getName());
		
		//apputil.Login("A");
		createacc.Tabs("Contacts");
		contact.Create_newview("");
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC31_cancelbutton(Method name) {
		test = extent.createTest(name.getName());
		
		//apputil.Login("A");
		createacc.Tabs("Contacts");
		contact.Cancel_button();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC32_save_newbutton(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		
		//apputil.Login("A");
		createacc.Tabs("Contacts");
		contact.Save_newbutton();
		basicutil.waitForElement(2000);
		
		
	}
	
	  
		 
	
	
	
	  @AfterSuite public void close() { 
		  basicutil.waitForElement(2000);  
	  driver.close(); 
	  extent.flush();
	  
	  }
	 

}
