package testcases.pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import sdfc_testcases.Base_test;

public class Contact_pages extends Base_test{
	public void Create_new_contact() throws InterruptedException {
		
		driver.findElement(By.name("new")).click();
		  driver.findElement(By.id("name_lastcon2")).clear();
		  driver.findElement(By.id("name_lastcon2")).sendKeys("jain");
		  test.log(Status.INFO, "last name updated");
		  Thread.sleep(2000);
		  driver.findElement(By.id("con4")).clear();
		  driver.findElement(By.id("con4")).sendKeys("Abhi1");
		  test.log(Status.INFO, "Account name updated");
		  driver.findElement(By.cssSelector("#topButtonRow > input:nth-child(1)")).click();
		  test.log(Status.INFO, "clicked on save button");
	}
	public void Create_newview(String choice) {
		
		 driver.findElement(By.linkText("Create New View")).click();
		    driver.findElement(By.id("fname")).clear();
		    driver.findElement(By.id("fname")).sendKeys("priyanka");
		    test.log(Status.INFO, " Name updated");
		    if(choice=="A") {
		    driver.findElement(By.id("devname")).clear();
		    driver.findElement(By.id("devname")).sendKeys("jain");
		    test.log(Status.INFO, "View name updated");
		    }else {
		    	driver.findElement(By.id("devname")).clear();
			    driver.findElement(By.id("devname")).sendKeys("eefgh");
			    test.log(Status.INFO, "error message displayed");
		    }
		    	
		    driver.findElement(By.name("save")).click();
		    test.log(Status.INFO, "clicked on save button");
	}
	
	public void Cancel_button() {
		 driver.findElement(By.linkText("Create New View")).click();
		  driver.findElement(By.id("fname")).clear();
		    driver.findElement(By.id("fname")).sendKeys("ABCD");
		    driver.findElement(By.id("devname")).clear();
		    driver.findElement(By.id("devname")).sendKeys("EFGH");
		    driver.findElement(By.name("cancel")).click();
	}
	public void Save_newbutton() throws InterruptedException {
		 driver.findElement(By.name("new")).click();
		  driver.findElement(By.id("name_lastcon2")).clear();
		  driver.findElement(By.id("name_lastcon2")).sendKeys("Indian");
		  Thread.sleep(2000);
		  driver.findElement(By.id("con4")).clear();
		  driver.findElement(By.id("con4")).sendKeys("Global-Media");
		  driver.findElement(By.cssSelector("#topButtonRow > input:nth-child(2)")).click();
	}

}
