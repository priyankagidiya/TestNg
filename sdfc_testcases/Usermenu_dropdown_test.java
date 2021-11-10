package sdfc_testcases;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities_salesforce.ListenersUtility;
@Listeners(ListenersUtility.class)
public class Usermenu_dropdown_test extends Base_test {
	@BeforeSuite
	public void website() throws IOException {
		apputil.Setup();
		apputil.LaunchApp();
		InitializeReports(" Usermenu_dropdown_ ");
	}
	
	
	  @Test public void TC05_usermenu(Method name) {
		  test = extent.createTest(name.getName());
	  apputil.Login("A");
	  usermenu.usermenudropdown(0);
	  basicutil.waitForElement(2000);
	  
	  usermenu.usermenudropdown(5);
	 
	  
	  }
	   @Test public void TC06_myprofile(Method name) throws InterruptedException {
		  test = extent.createTest(name.getName()); apputil.Login("A");
	  usermenu.usermenudropdown(0); usermenu.usermenudropdown(1);
	  usermenu.clickon_about(); System.out.println("last name updated");
	  usermenu.message_post(); 
	  usermenu.File_upload();
	  basicutil.waitForElement(2000);
	  usermenu.Photo_upload();
	  
	  System.out.println("photo uploaded"); 
	  
	  }
	  @Test
			public void TC07_mysettings(Method name) throws InterruptedException {
		  test = extent.createTest(name.getName());
				//apputil.Login("A");
				usermenu.usermenudropdown(0);
				usermenu.usermenudropdown(2);
				usermenu.personallink_loginhistory();
				System.out.println("login history downloaded");
				usermenu.display_layoutlink();
				usermenu.email_link();
				usermenu.calender_remainders();
				System.out.println("calender updated");
				
				
				
			}
      @Test
	  public void TC08_developerconsole(Method name) {
		  test = extent.createTest(name.getName());
	 // apputil.Login("A");
	  usermenu.usermenudropdown(0);
	   usermenu.usermenudropdown(3);
	  basicutil.waitForElement(2000);
	  
	  usermenu.Developer_console();
	  System.out.println("Developer console window appeared");
	  
	  
	  }
      @Test
	  public void TC09_logout(Method name) {
       test = extent.createTest(name.getName());
	  //apputil.Login("A");
       usermenu.usermenudropdown(0);
	  usermenu.usermenudropdown(5);
	  basicutil.waitForElement(2000);
	  
	  
	  }
	
	 
	
	@AfterSuite
	public void close() {
		basicutil.waitForElement(2000);
		driver.close();
		extent.flush();
	}

}
