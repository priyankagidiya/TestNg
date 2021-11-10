package sdfc_testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcases.pages.Contact_pages;
import testcases.pages.Create_account_pages;
import testcases.pages.Create_opportunities_pages;
import testcases.pages.Leads_pages;
import testcases.pages.Random_pages;
import testcases.pages.Usermenudropdown_pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import configs.TestConstants;
import utilities_salesforce.Apputilities;
import utilities_salesforce.Basicutilities;
import utilities_salesforce.Data_utilities;

public class Base_test {
	
	public static  ExtentTest test; 
	public static WebDriver driver;
	 
	public static Basicutilities basicutil = new Basicutilities();
	public static Apputilities apputil = new Apputilities();
	public static ExtentReports extent = new ExtentReports();
	public static Data_utilities datautil = new Data_utilities();
	public Logger logger = Logger.getLogger(getClass().getSimpleName());
	public static Usermenudropdown_pages usermenu = new Usermenudropdown_pages();
	public static Create_account_pages createacc = new Create_account_pages();
	public static Create_opportunities_pages createopp = new Create_opportunities_pages();
	public static Contact_pages contact = new Contact_pages();
	public static Leads_pages lead = new Leads_pages();
	public static Random_pages random = new Random_pages();
	
	public void getDriver(String browserName, boolean enableHeadlessMode) {
		String BrowserName = browserName.toLowerCase();
		switch (BrowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			logger.info("Chromedriver setup is complete");
			if (enableHeadlessMode) {
				driver = new ChromeDriver(enableHeadlessMode());
				logger.info("Chromedriver headless mode configured");
			} else {
				driver = new ChromeDriver();
			}
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
//			logger.warn("driver is null");
			driver = null;
		}
		return;
	}
		
		
	
    private ChromeOptions enableHeadlessMode() {
    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080", "--ignore-certificate-errors");
		return options;
		
	}



	public void InitializeReports(String name) {
		String dateformat = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date()); 
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter(TestConstants.Reportpath+name+ dateformat +".html");
		extent.attachReporter(htmlreport);
	   
	   //test.log(Status.INFO,"Report generated");
	   
	}
	
	public void initializeLogging() throws IOException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(TestConstants.Log4JpropertiesPath);
		prop.load(fis);
		PropertyConfigurator.configure(fis);
		
	}

	
}
