package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;
import java.sql.Driver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLogintest2 extends BaseClass
{

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
	public void loginApp() throws IOException
	{
		login.inpSwagLabLoginUN(UtilityClass.readDataFromPF("UN"));
		login.inputSwagLabLoginPWD(UtilityClass.readDataFromPF("PWD"));
		login.clickSwagLabLoginBTn();
		
	}
	@Test
	public void verifyLogo()
	{
		TCID=111;
		boolean result=home.verifySwagLabHomePageLogo();
		Assert.assertTrue(result,"Failed:result is false");
	}
	@AfterMethod
	public void logoutApp(ITestResult s1) throws InterruptedException, IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
		
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(3000);
		menu.ClickSwagLabMenuPageLogoutBtn();
		
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
}
