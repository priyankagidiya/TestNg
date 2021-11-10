package testcases.pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import sdfc_testcases.Base_test;

public class Create_opportunities_pages extends Base_test{
	public void Create_new_oppt() {
		
		 driver.findElement(By.name("new")).click();
		  driver.findElement(By.cssSelector("#opp3")).sendKeys("project");
		  test.log(Status.INFO, "Opportunity Name entered");
		  driver.findElement(By.cssSelector("#opp4")).sendKeys("project1");
		  test.log(Status.INFO, "Account Name entered");
		  driver.findElement(By.cssSelector("#opp9")).sendKeys("12/31/2021");
		  driver.findElement(By.cssSelector("#opp12")).sendKeys("80");
		  driver.findElement(By.cssSelector("#opp17")).sendKeys("Testing");
		  driver.findElement(By.cssSelector("#opp6")).click();
		  driver.findElement(By.cssSelector("#opp6 > option:nth-child(2)")).click();
		  driver.findElement(By.cssSelector("#opp11")).click();
		  driver.findElement(By.cssSelector("#opp11 > option:nth-child(10)")).click();
		  test.log(Status.INFO, "Opportunity page is displayed with details");
	}
	
	public void Quarterly_report() {
		 driver.findElement(By.id("quarter_q")).click();
		 test.log(Status.INFO, "Quarterly summary link is displayed");
		  driver.findElement(By.cssSelector("#quarter_q > option:nth-child(2)")).click();
		  driver.findElement(By.id("open")).click();
		  driver.findElement(By.cssSelector("#open > option:nth-child(4)")).click();
		  test.log(Status.INFO, "Quartely report displayed");
	}

}
