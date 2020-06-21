

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase 
{
  public static WebDriver driver;
 public  static  Properties prop;
 public static String currentDirectory = System.getProperty("user.dir");
    public  TestBase() 
    {
    try 
    {
    	prop = new Properties();
    	FileInputStream IP = new FileInputStream(currentDirectory+"\\config.properties");
    	prop.load(IP);
    }
    catch(FileNotFoundException e) 
    {
    	e.printStackTrace();
    }
    catch(IOException e)
    {
    	e.printStackTrace();
    }
    }
    @BeforeSuite()
    public static void Initiallization() throws InterruptedException 
    {
         String browser =	prop.getProperty("Browser");
         if(browser.equals("chrome"))  
         {
        	 
             System.setProperty("webdriver.chrome.driver",currentDirectory+"\\Driver\\chromedriver.exe");
         
         	  driver = new ChromeDriver();
         	  
         	System.out.println("Chrome browser is opened successfully");
         	
         }
         
         JavascriptExecutor js= (JavascriptExecutor)driver;
 	    js.executeScript("window.scrollBy(0,100)");
 	     Thread.sleep(3000);
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         driver.get(prop.getProperty("url"));
         
         
    }
    @AfterSuite()
    public void finish()
   {
    	driver.quit();
    }
}
