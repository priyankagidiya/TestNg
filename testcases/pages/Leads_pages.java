package testcases.pages;

import org.openqa.selenium.By;

import sdfc_testcases.Base_test;

public class Leads_pages extends Base_test {
	
public void Todays_leads() throws InterruptedException {
	driver.findElement(By.id("fcf")).click();
	driver.findElement(By.cssSelector(" #fcf > option:nth-child(4)")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"userNavButton\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("oct21.priyanka@tekarch.com");
	driver.findElement(By.id("password")).sendKeys("priyanka1985");

	driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	driver.findElement(By.cssSelector("#Lead_Tab > a")).click();
	driver.findElement(By.name("go")).click(); 
		
		
	}
	public void New_leads() throws InterruptedException {
		driver.findElement(By.name("new")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("name_lastlea2")).clear();
		  driver.findElement(By.id("name_lastlea2")).sendKeys("Abcd");
		  driver.findElement(By.id("lea3")).clear();
		  driver.findElement(By.id("lea3")).sendKeys("Abcd");
		  driver.findElement(By.cssSelector(" #topButtonRow > input:nth-child(1)")).click();
	}

}
