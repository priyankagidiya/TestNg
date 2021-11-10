package sdfc_testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities_salesforce.ListenersUtility;
@Listeners(ListenersUtility.class)
public class Create_account_test extends Base_test {
	@BeforeSuite
	public void website() throws IOException {
		apputil.Setup();
		apputil.LaunchApp();
		InitializeReports(" Create_account_ ");
	}
	
	@Test
	public void TC10_createaccount(Method name) {
		
		test = extent.createTest(name.getName());
		apputil.Login("A");
		createacc.Tabs("Accounts");
		
		createacc.Create_new_account();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC11_createnewview(Method name) {
		test = extent.createTest(name.getName());
		
		//apputil.Login("A");
		createacc.Tabs("Accounts");
		createacc.Create_new_view();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC12_editview(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Accounts");
		createacc.Edit_view();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC13_mergeaccounts(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Accounts");
		createacc.Merge_accounts();
		basicutil.waitForElement(2000);
		
		
	}
	@Test
	public void TC14_createaccountreport(Method name) throws InterruptedException {
		test = extent.createTest(name.getName());
		//apputil.Login("A");
		createacc.Tabs("Accounts");
		createacc.Create_account_reports();
		basicutil.waitForElement(2000);
		
		
	}
	
	  
		 
	
	
	
	  @AfterSuite public void close() { 
		  
	  driver.close(); 
	  extent.flush();
	  
	  }
	 
	 
}
