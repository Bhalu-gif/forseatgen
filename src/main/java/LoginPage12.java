
import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPage12 extends TestBase
{
	@FindBy(how=How.CSS,using="body.zdbody div.homediv div.row:nth-child(4) div.container div.col-xs-12.col-sm-6:nth-child(1) div.col-xs-12 > a.btn.btn-primary.btn-block:nth-child(3)")
	   WebElement office;
	   
 @FindBy(how=How.XPATH,using="//input[@type=\"email\"]")
 WebElement emailnam;
 
 @FindBy(how=How.ID,using="idSIButton9")
 WebElement emailNext;
 
 @FindBy(how=How.ID,using="i0118")
 WebElement password13;
	  
 
 
 @FindBy(how=How.ID,using="idSubmit_ProofUp_Redirect")
 WebElement Next;
 
 @FindBy(how=How.ID,using="CancelLinkButton")
 WebElement Cancle;
 
 @FindBy(how=How.ID,using="idSIButton9")
 WebElement Yes;
public LoginPage12() 
{
	   PageFactory.initElements(driver,this);
}

public void login(String ur,String pass) throws InterruptedException 
{
	   Thread.sleep(3000);
	   JavascriptExecutor op= (JavascriptExecutor)driver;
	    op.executeScript("window.scrollBy(0,200)");
	   WebDriverWait wait1= new WebDriverWait(driver,30);
	   wait1.until(ExpectedConditions.visibilityOf(office));
	   office.click();
	   Thread.sleep(3000);

	   WebDriverWait wai1= new WebDriverWait(driver,30);
	   wai1.until(ExpectedConditions.visibilityOf(emailnam));
	   emailnam.sendKeys(ur);
	   emailNext.click();
	   
	   WebDriverWait w1= new WebDriverWait(driver,30);
	   w1.until(ExpectedConditions.visibilityOf(password13));
	   password13.sendKeys(pass);
	   
	   Thread.sleep(5000);
		  for(int i=0; i<=2;i++)
		  {
			  try{
			     driver.findElement(By.cssSelector("#idSIButton9")).click();
			     break;
			  }
			  catch(Exception e){
			     System.out.println(e.getMessage());
			  }
			}


	   Thread.sleep(1000);
	   Next.click();
	   Thread.sleep(1000);
	   Cancle.click();
	   Thread.sleep(1000);
	   Yes.click();
	   Thread.sleep(3000);
    WebElement  seleI = driver.findElement(By.xpath("//span[contains(text(),'Instance #1515')]"));
   
    WebDriverWait wait21= new WebDriverWait(driver,30);
	   wait21.until(ExpectedConditions.visibilityOf( seleI));
    seleI.click();
}

}
