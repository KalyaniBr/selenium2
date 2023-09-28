package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_TestNG.SwagLabHomePage;
import POM_DDF_TestNG.SwagLabLoginPage;
import POM_DDF_TestNG.SwagLabMenuPage;

public class SwagLabLoginTest2 extends BaseClass2
{

	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabMenuPage menu;
	
	@BeforeClass
	public void openBrowaser()
	{
		initializeBrowser();
		login= new SwagLabLoginPage(driver);
		home=new SwagLabHomePage(driver);
		menu=new SwagLabMenuPage(driver);
	}
	@BeforeMethod
	public void loginApp() throws EncryptedDocumentException, IOException
	{
		login.inputSwagLabLoginPageusername(UtilityClass2.getTD(0, 0));
		login.inputSwagLabLoginPagepassword(UtilityClass2.getTD(0, 1));
		login.clickSwagLabLoginPageLoginBtn();
	}
	@Test 
	public void verifyLogo()
	{
		home.getSwagLabHomePageLogo();
	}
	@AfterMethod
	public void logoutApp()
	{
		home.clickSwagLabHomePageMenu();
		menu.clickEx2_SwagLabMenuPageLogoutBtn();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
