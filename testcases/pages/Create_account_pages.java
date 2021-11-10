package testcases.pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import sdfc_testcases.Base_test;

public class Create_account_pages extends Base_test {
	
	public void Tabs(String tabname) {
		//String Tabname = tabname.toUpperCase();
		switch(tabname) {
		case "Accounts":
			driver.findElement(By.cssSelector("#Account_Tab > a")).click();
			test.log(Status.INFO, "Account tab has been selected");
			break;
		case "Opportunities":
			driver.findElement(By.cssSelector("#Opportunity_Tab > a")).click();
			test.log(Status.INFO, "Opportunities tab has been selected");
			break;
		case "Leads":
			driver.findElement(By.cssSelector("#Lead_Tab > a")).click();
			test.log(Status.INFO, "Lead tab has been selected");
			break;
		case "Contacts":
			driver.findElement(By.cssSelector("#Contact_Tab > a")).click();
			test.log(Status.INFO, "Contact tab has been selected");
			break;
		case "Home":
			driver.findElement(By.cssSelector("#home_Tab > a")).click();
			test.log(Status.INFO, "Home tab has been selected");
			break;
			
		
		}
		
	}
	public void Create_new_account() {
		test.log(Status.INFO, "New account page is displayed");
		 driver.findElement(By.name("new")).click();
		    driver.findElement(By.id("acc2")).clear();
		    driver.findElement(By.id("acc2")).sendKeys("priyanka");
		    test.log(Status.INFO, "New account has been created");
		    driver.findElement(By.name("save")).click();
		    test.log(Status.INFO, "Clicked on save button");
	}
	public void Create_new_view() {
		
		driver.findElement(By.linkText("Create New View")).click();
		test.log(Status.INFO,"Create new view page is displayed");
	    driver.findElement(By.id("fname")).clear();
	    driver.findElement(By.id("fname")).sendKeys("priyanka");
	    driver.findElement(By.id("devname")).clear();
	    driver.findElement(By.id("devname")).sendKeys("pri");
	    test.log(Status.INFO, "Create new view has been created");
	    driver.findElement(By.name("save")).click();
	    test.log(Status.INFO, "Clicked on save button");
	}
	public void Edit_view() throws InterruptedException {
		  driver.findElement(By.linkText("Edit")).click();
		  test.log(Status.INFO, "Edit page is displayed");
		    driver.findElement(By.id("fname")).clear();
		    driver.findElement(By.id("fname")).sendKeys("abhi1");
		    test.log(Status.INFO, "First name entered");
		    driver.findElement(By.id("fcol1")).click();
		    driver.findElement(By.id("fop1")).click();
		    driver.findElement(By.id("fval1")).clear();
		    driver.findElement(By.id("fval1")).sendKeys("ab");
		    driver.findElement(By.cssSelector("#colselector_select_0_left > .leftArrowIcon")).click();
		    Thread.sleep(2000);
		   // driver.findElement(By.xpath("//*[@id=\"colselector_select_1\"]/option[7]")).click();
		   // driver.findElement(By.xpath("//*[@id=\"colselector_select_0_left\"]/img")).click();
		    driver.findElement(By.xpath("//*[@id=\"colselector_select_0\"]/option[31]")).click();
		    driver.findElement(By.cssSelector("#colselector_select_0_right > img")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")).click();
		    
	}
	public void Merge_accounts() throws InterruptedException {
		 driver.findElement(By.linkText("Merge Accounts")).click();
		 test.log(Status.INFO, "Merge account page is displayed");
		  Thread.sleep(2000);
		    driver.findElement(By.id("srch")).sendKeys("priyanka");
		    driver.findElement(By.name("srchbutton")).click();
		    driver.findElement(By.id("cid0")).click();
		   driver.findElement(By.id("cid1")).click();
		   test.log(Status.INFO, "Two account has been merged");
		    Thread.sleep(2000);
		    driver.findElement(By.name("goNext")).click();
		    driver.findElement(By.name("save")).click();
		    test.log(Status.INFO, "Clicked on save button");
		    driver.switchTo().alert().accept();
		    driver.get("https://tekarch45-dev-ed.my.salesforce.com/001?fcf=00B5f00000Ao6re");
		  
	}
	public void Create_account_reports() throws InterruptedException {
		test.log(Status.INFO, "Create account reports page is displayed");
		 driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("ext-gen148")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#ext-gen265 > div:nth-child(3)")).click();
		  // driver.findElement(By.linkText("Created Date")).click();
		    driver.findElement(By.id("ext-gen152")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.id("ext-gen281")).click();
		    driver.findElement(By.id("ext-gen154")).click();
		    Thread.sleep(4000);
		    //driver.findElement(By.id("ext-gen299")).click();
		    Thread.sleep(2000);
		  driver.findElement(By.cssSelector("#ext-gen49")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("  #saveReportDlg_reportNameField")).clear();
		  driver.findElement(By.cssSelector("  #saveReportDlg_reportNameField")).sendKeys("pri");
		  driver.findElement(By.cssSelector("  #saveReportDlg_DeveloperName")).clear();
		  driver.findElement(By.cssSelector("  #saveReportDlg_DeveloperName")).sendKeys("pri");
		  driver.findElement(By.cssSelector(" #ext-gen319")).click();
		  test.log(Status.INFO, "Clicked on save button");
		 
	}
	

}
