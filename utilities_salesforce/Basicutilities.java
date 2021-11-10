package utilities_salesforce;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import configs.TestWaits;
import sdfc_testcases.Base_test;

public class Basicutilities extends Base_test {
	
	// To call click method.
	public void ClickOnElement(WebElement element) {
		element.click();

	}

	// To send text
	public void SendText(String text, WebElement element) {
		element.sendKeys(text);
	}

	// Is displayed method look for element is present or not.
	public boolean IsElementVisible(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Exception e) {
			System.out.println("Exception encountered" + e.getMessage());
			return false;
		}
	}

	// Is selected method used for radio box or checkbox
	public boolean IsElementSelected(WebElement element) {
		try {
			element.isSelected();
			return true;
		} catch (Exception e) {
			System.out.println("Exception encountered" + e.getMessage());
			return false;
		}
	}

	// Select element from dropdown
	public void SelectElementFromDropDown(WebElement element, String dropdownvalue) {
		Select s = new Select(element);
		s.selectByValue(dropdownvalue);
	}

	// Use to Move to elements
	public void MoveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	// To clear the text
	public void ClearText(WebElement element) {
		element.clear();
	}
     //read text from the element
	public String ReadTextFromElement(WebElement element) {
		return element.getText();
	}

	// Creating function for wait time
	public void waitForElement(int timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
     // to get screenshot
	public String getScreenCapture(String classname) {

		/*
		 * DateFormat df = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
		 * 
		 * Date date = Calendar.getInstance().getTime();
		 */
		  String dateformat = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date()); 
		  String dateformat1 = dateformat.replaceAll("/", "_").replaceAll(",", "_").replaceAll(":", "_");
		  String path = System.getProperty("user.dir") + "/target/Reports/" + classname +"-"+ dateformat1 + ".PNG";
		System.out.println(path);
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return path;
	}

	
}
