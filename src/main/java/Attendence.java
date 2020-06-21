


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Attendence
{
			WebDriver driver;
		   public Attendence (WebDriver driver) 
		   {
			   this.driver=driver;
		   }
		
		 @FindBy(how=How.CSS,using="body > apppage > div > div > div.hidden-xs > zdoptions > div > nav > div:nth-child(1) > div:nth-child(2) > button")
		   WebElement Create;
		 
		 @FindBy(how=How.XPATH,using="//div[5]//button[@aria-haspopup=\"true\"]")
		   WebElement Attend;
		 
		 
		 
		 @FindBy(how=How.XPATH,using="/html/body/app/body/apppage/div/div/div[2]/div/zdworkarea/div/div/zddetailview/div/zddetailviewcreate/div/div/div/div/div[2]/div[3]/div/div[2]/div/div[3]/button")
		   WebElement tax;
		 
		 @FindBy(how=How.XPATH,using="//button[contains(text(),'Criminal Law (LAWD-1001-D1)')]")
		   WebElement classroom;
		 
		 @FindBy(how=How.XPATH,using="//button[@class=\"btn btn-primary\" and contains(text(),'Edit Attendance')]")
		   WebElement EditATT;
		 
		@FindBy(how=How.XPATH,using="//i[@class=\"fas fa-save\"]")
		WebElement cancle1;
		
		 @FindBy(how=How.XPATH,using="//input[@name='attDate']")
		 WebElement Editdate;
		
		 @FindBy(how=How.ID,using="ctl00_MainContent_lnkRosterView")
		 WebElement roster;
		 
		 @FindBy(how=How.XPATH,using="//*[@id=\"ctl00_MainContent_dOneClickSelectedValueContainer\"]/div")
		 WebElement modecl;
		 
		 
		 @FindBy(how=How.ID,using="ctl00_MainContent_txtAttendanceNotes")
		 WebElement described;
		 
		 @FindBy(how=How.ID,using="ctl00_MainContent_bSave")
		 WebElement Save;
		 
		 
		 
		 public void Createtoddals() throws InterruptedException 
		 {
			 System.out.println("create attendance");
			 WebDriverWait wait2 = new WebDriverWait(driver,30);
			   wait2.until(ExpectedConditions.visibilityOf(Create));
			 Create.click();
			 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			 Attend.click();
			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			 
			
			 WebDriverWait wait6 = new WebDriverWait(driver,30);
			   wait6.until(ExpectedConditions.visibilityOf(classroom));
			 classroom.click();
			 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			 tax.click();
			 WebDriverWait py= new WebDriverWait(driver,30);
			  py.until(ExpectedConditions.visibilityOf(Editdate));
			  Editdate.click();
	  
		      Thread.sleep(5000);
			 EditATT.click(); 
		
			 List <WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		     System.out.println("total iframes : "+totalframes.size());
		     Thread.sleep(3000);
			 WebElement fr=driver.findElement(By.xpath("//div[@class='maincontentcomponent_padding']//div//zddetailview//div//zdframe//div//div//iframe"));
			driver.switchTo().frame(fr);
			System.out.println("we shift in frame");
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			 JavascriptExecutor opr = (JavascriptExecutor)driver;
	    	 opr.executeScript("window.scrollBy(0,-200)");
	    	 Thread.sleep(3000);
	    	 JavascriptExecutor sy = (JavascriptExecutor)driver;
	    	 sy.executeScript("window.scrollBy(0,-200)");
			WebDriverWait to = new WebDriverWait(driver,30);
			to.until(ExpectedConditions.visibilityOf(roster));
			roster.click();
			Thread.sleep(3000);
			WebDriverWait top = new WebDriverWait(driver,30);
			top.until(ExpectedConditions.visibilityOf(modecl));
			modecl.click();
			Thread.sleep(3000);
			
			described.sendKeys("BE from University");
			Thread.sleep(3000);
			WebDriverWait ptu = new WebDriverWait(driver,30);
			ptu.until(ExpectedConditions.visibilityOf(Save));
			Save.click();
			
			
			 
			 
		 }
			   
		}


