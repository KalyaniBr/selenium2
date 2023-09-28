package POM_With_DDF_Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKeywords {
   @BeforeClass
  public void openBrowser()
  {
	Reporter.log("--openBroser--",true);
   }
	
	@BeforeMethod
	public void openURL()
	{
		Reporter.log("--openapplication--",true);
		
	}
	
	@Test(invocationCount=2,priority=2)
	public void login1()
	{
		Reporter.log("--running login1 test case--",true);
	}
	
	@Test(priority=1,invocationCount=3)
	public void login2()
	{
		Reporter.log("--running login2 test case---",true);
	}
	
	@Test(enabled=false)
	public void TC3()
	{
		Reporter.log("--running TC1---",true);
	}
	
	
	@Test(priority=3,invocationCount=5,dependsOnMethods= {"login1","login2"})
	public void logout()
	{
		Reporter.log("--running logout test case--",true);
	}
	
	@AfterMethod
	public void closeApp()
	{
		Reporter.log("--closeApp------",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("--closeBrowser---",true);
	}
	
	
	
	
}
