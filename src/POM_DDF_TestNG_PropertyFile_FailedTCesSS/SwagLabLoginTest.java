package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_TestNG_UtilityClass_BaseClass.Ex2_SwagLabLoginPage;
import SwagLabPractice.Ex3SwagLabLoginpage;

public class SwagLabLoginTest extends BaseClass {

    SwagLabLoginPage login;
    SwagLabHomePage home;
	SwagLabMenuPage menu;
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initializeBrowser();
		login=new SwagLabLoginPage(driver);
		home=new SwagLabHomePage(driver);
		menu=new SwagLabMenuPage(driver);
	}
	@BeforeMethod
	
	public void LoginToApp() throws IOException
	{
		login.inpSwagLabLoginUN(UtilityClass.readDataFromPF("UN"));
		login.inputSwagLabLoginPWD(UtilityClass.readDataFromPF("PWD"));
		login.clickSwagLabLoginBTn();
	}
	@Test
	public void verifyLogo() throws InterruptedException
	{
		TCID=101;
		boolean result= false  ;   //home.verifySwagLabHomePageLogo();  //false to capture Screenshot
		Assert.assertTrue(result,"Failed:result is false");
	}
	@AfterMethod
	
	public void logoutApp(ITestResult s1) throws InterruptedException, IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver,TCID);
		}
		
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		menu.ClickSwagLabMenuPageLogoutBtn();
	}
 	@AfterClass
 	
 	public void closeBrowser()
 	{
 		driver.close();
 	}
	
	
}
