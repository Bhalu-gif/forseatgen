

import org.openqa.selenium.support.PageFactory;





import org.testng.annotations.Test;






public class AttendenceTestClass extends TestBase
{
	
	
	@Test(priority=0)
	public void log2() throws InterruptedException
	{
		LoginPage12 tr1 = PageFactory.initElements(driver,LoginPage12 .class);
		tr1.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void executetest() throws InterruptedException
	{
		Attendence ok = PageFactory.initElements(driver,Attendence.class);
		ok.Createtoddals();
	}
	@Test(priority=2)
	public void Initfinish() throws InterruptedException
	{
		TestBase tr = PageFactory.initElements(driver,TestBase .class);
		tr.finish();
	}

}
