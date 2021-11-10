package testcases.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.aventstack.extentreports.Status;

import sdfc_testcases.Base_test;

public class Usermenudropdown_pages extends Base_test{
	
	
	
	public void usermenudropdown(int index) {
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		switch(index) {
		case 0:
			driver.findElement(By.xpath("//*[@id=\"userNavButton\"]")).click();
			test.log(Status.INFO,"usermenu selected");
			
			break;
		case 1:
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]")).click();
			test.log(Status.INFO,"My profile selected");
			break;
		case 2:
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]")).click();
			test.log(Status.INFO,"My settings selected");
			break;
		case 3:
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]")).click();
			test.log(Status.INFO,"Developer console selected");
			break;
		case 4:
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[4]")).click();
			test.log(Status.INFO,"Switch to lightening experience selected");
			break;
		case 5:
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
			test.log(Status.INFO,"Logout selected");
			break;
		default:
			driver = null;
		}
		
	}
	
	public void clickon_about() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//to update last name.
	 		Thread.sleep(2000);	  
	 		WebElement chatterTab = driver.findElement(By.cssSelector("#chatterTab > div.leftContent > div.contactInfo.profileSection > div.vfButtonBar > h3 > div > div > a"));
	 		Actions action = new Actions(driver);
	 		action.click(chatterTab).build().perform();
	 		Thread.sleep(2000);
	 		driver.switchTo().frame(2); 
	 		driver.findElement(By.linkText("About")).click();
	 		driver.findElement(By.id("lastName")).clear();
	 		driver.findElement(By.id("lastName")).sendKeys("Jain");
	 		driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")).click();
	 		test.log(Status.INFO, "Last Name updated");
	}
	public void message_post() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"publishereditablearea\"]")).click();
		Actions action = new Actions(driver);
		  action.sendKeys("Welcome").build().perform();
		  driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]")).click();
		  Thread.sleep(5000);
		  test.log(Status.INFO, "Message posted on wall");
		
	}
	public void File_upload() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#publisherAttachContentPost > .publisherattachtext")).click();
		   driver.findElement(By.id("chatterUploadFileAction")).click();
		  Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"chatterFileRow\"]/td/div/div[1]")).click();
		   Thread.sleep(2000);
		   Actions action = new Actions(driver);
		   action.sendKeys("C:\\Users\\Abhis\\Documents\\Priyanka Java\\Read.txt").build().perform();
		   driver.findElement(By.id("publishersharebutton")).click();			 
		   Thread.sleep(2000);
		   test.log(Status.INFO, "File Uploaded");
	}
	public void Photo_upload() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"photoSection\"]/span[2]")).click();
		   driver.findElement(By.xpath("//*[@id=\"uploadLink\"]")).click();
		   Thread.sleep(2000);
		   driver.switchTo().frame(2);
		   driver.findElement(By.cssSelector("#j_id0\\:uploadFileForm")).click();
		   driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]")).sendKeys("C:\\Users\\Abhis\\Pictures\\Screenshots\\img.png");
		   driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.id("j_id0:j_id7:save")).click();
		   test.log(Status.INFO, "Profile Photo uploaded");
	}
	public void personallink_loginhistory() throws InterruptedException {
		
		 driver.findElement(By.xpath("//*[@id=\"PersonalInfo\"]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"LoginHistory_font\"]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")).click();
		
	}
	public void display_layoutlink() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"DisplayAndLayout_font\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"CustomizeTabs_font\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"PersonalCollaboration_font\"]")).click();
		  Thread.sleep(2000);
		 driver.findElement(By.id("p4")).click();
		 driver.findElement(By.xpath("//*[@id=\"p4\"]/option[9]")).click();
		 driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[76]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img")).click();
		
	}
	public void email_link() throws InterruptedException {
		
		 driver.findElement(By.xpath("//*[@id=\"EmailSetup_font\"]")).click();
		 driver.findElement(By.cssSelector("#EmailSettings_font")).click();
		 driver.findElement(By.id("sender_name")).clear();
		 driver.findElement(By.id("sender_name")).sendKeys("Priyanka");
		 driver.findElement(By.id("sender_email")).clear();
		 driver.findElement(By.id("sender_email")).sendKeys("priyanka.gidiya@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("#auto_bcc1")).click();
		 driver.findElement(By.cssSelector("#bottomButtonRow > input.btn.primary")).click();
		
		
	}
	public void calender_remainders() {
		
		 driver.findElement(By.id("CalendarAndReminders_font")).click();
		 driver.findElement(By.id("Reminders_font")).click();
		 driver.findElement(By.cssSelector("#testbtn")).click();
		 
	}
	public void Developer_console() {

		
		  Set<String> windowids = driver.getWindowHandles(); 
		  
	      Iterator<String> iter = windowids.iterator();
		  String mainWindow =iter.next(); 
		  String childwindow = iter.next();
		  driver.switchTo().window(childwindow); driver.close();
		  driver.switchTo().window(mainWindow);
		 
	}


}
