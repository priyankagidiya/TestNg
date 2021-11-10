package testcases.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import sdfc_testcases.Base_test;

public class Random_pages extends Base_test {
	public void Verifytab() throws InterruptedException {
		 driver.findElement(By.cssSelector(".allTabsArrow")).click();
		  Thread.sleep(2000);
		    driver.findElement(By.name("customize")).click();
		  //driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input")).click();
		  driver.findElement(By.cssSelector("#duel_select_1 > option:nth-child(3)")).click();
		  driver.findElement(By.cssSelector("#duel_select_0_left > img")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.name("save")).click();
	}
	public void Block_event() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a")).click();
		  Thread.sleep(2000);
		    driver.findElement(By.linkText("8:00 PM")).click();
		  
		  Thread.sleep(2000);
		
		  driver.findElement(By.cssSelector(".comboboxIcon")).click();
			  Set<String> wind = driver.getWindowHandles(); 
			  Iterator<String> windowH = wind.iterator();
			  String parentW = windowH.next();
			  String childW = windowH.next();
			  driver.switchTo().window(childW);
			
		    driver.findElement(By.cssSelector(".listItem4 > a")).click();
		  driver.findElement(By.id("EndDateTime_time")).click();
		   // driver.findElement(By.id("timePickerItem_42")).click();
		    driver.findElement(By.name("save")).click();
	}

}
