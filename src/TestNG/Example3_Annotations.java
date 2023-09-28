package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example3_Annotations {
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("--open browser--");
	}

	@BeforeMethod
	public void logintoapp()
	{
		Reporter.log("---login to app--",true);
	}
	@Test
	
	public void TC1()
	{
	Reporter.log("running verify logo1 ",true);	
	}
	
	@AfterMethod
	public void logoutfromApp()
	
	{
		Reporter.log("---logout from App---",true);
	}
	
	@AfterClass 
	public void closeBrowser()
	{
		Reporter.log("---Close browser---",true);
	}
	
	
	
	
}
