package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities_salesforce.Apputilities;
import utilities_salesforce.ListenersUtility;
@Listeners(ListenersUtility.class)
public class DataDriven {
	WebDriver driver;
	
	Apputilities ap = new Apputilities();
	
	@BeforeSuite
	public void setup(){
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Abhis\\Desktop\\Pri java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//bu.initializeReport();
	}
	@BeforeTest
	public void launchApp() {
			driver.get("https://login.salesforce.com/");
			driver.manage().window().maximize();
		}
		
	
	

	@Test(dataProvider = "gettestData")
	public void Login(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		  driver.findElement(By.id("password")).sendKeys(password); 
		  driver.findElement(By.name("Login")).click();
		
	}
	@DataProvider
	public Object[][] gettestData(){
		Object[][] data = {{"oct21@gmail.com","test"},{"priyanka@gmail.com","test"}};
		return data;
	}
	
	
	
	
	
	
	  @AfterTest
	  public void teardown() {
		  driver.close(); 
		  }
	 
	
	// @AfterSuite public void teardown1() { extent.flush(); }
	 
	

}
