package utilities_salesforce;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.Status;

import sdfc_testcases.Base_test;

public class Apputilities extends Base_test {
	
	 public void Setup() {
		 getDriver("chrome",false);
			
			logger.info("chrome driver setup");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			 
		
	 }
	public void LaunchApp() throws IOException {
		
		driver.get("https://login.salesforce.com/");
		logger.info("Salesforce login page");
	    driver.manage().window().maximize();
		
	}
	public void Login(String choice) {
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 if(choice=="A") {
		   WebElement username = driver.findElement(By.id("username"));
		  basicutil.SendText(datautil.ReadAccounts("username"), username);
		  test.log(Status.INFO,"Username entered");
		 
		  WebElement password = driver.findElement(By.id("password"));
		  basicutil.SendText(datautil.ReadAccounts("password"), password);
		  test.log(Status.INFO,"Password entered");
		  }else{
			  WebElement username = driver.findElement(By.id("username"));
			  basicutil.SendText(datautil.ReadAccounts("username"), username);
			  test.log(Status.INFO,"Username entered");
			  
			  WebElement passworderror = driver.findElement(By.id("password"));
			  basicutil.SendText(datautil.ReadAccounts("password_error"), passworderror); 
			  test.log(Status.INFO, "Wrong password entered");
		  }
		  WebElement login =  driver.findElement(By.name("Login"));
		  basicutil.ClickOnElement(login);
		  test.log(Status.INFO, "Login successful");

}
	public void Forgotpassword(String choice) {
		
		 
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 if(choice=="A") {		
		driver.findElement(By.xpath("//*[@id=\"forgot_password_link\"]")).click();
		test.log(Status.INFO, "Click on forgot password link");
		 WebElement un = driver.findElement(By.id("un"));
		basicutil.SendText(datautil.ReadAccounts("username"), un);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		test.log(Status.INFO, "Clicked on continue button");
		 }else {
				
				  driver.findElement(By.cssSelector("#forgotPassForm > a")).click();
				  test.log(Status.INFO, "Back to login page");
				 
					/*
					 * WebElement username1 = driver.findElement(By.id("username"));
					 * basicutil.SendText(datautil.ReadAccounts("username1"), username1);
					 */
			 WebElement password1 = driver.findElement(By.id("password"));
			 basicutil.SendText(datautil.ReadAccounts("password1"), password1);
			 test.log(Status.INFO, "Entered wrong password to validate");
			 WebElement login =  driver.findElement(By.name("Login"));
			  basicutil.ClickOnElement(login);
			  test.log(Status.INFO, "login button clicked");



		 }
	}
	

	
	  public void Logout() {
	  driver.findElement(By.xpath("//*[@id=\"userNavButton\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
	  test.log(Status.INFO, "Logout successful"); }
	 

	
	
	
}
