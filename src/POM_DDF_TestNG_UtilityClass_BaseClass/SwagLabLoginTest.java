package POM_DDF_TestNG_UtilityClass_BaseClass;

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
import graphql.Assert;

public class SwagLabLoginTest extends BaseClass {

	
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabMenuPage menu;
	
	@BeforeClass()
	public void openBrowser()
	{
		initializeBrowser();  //extended nonstatic method of base class
	login=new SwagLabLoginPage(driver)	;
	home=new SwagLabHomePage(driver);
	menu=new SwagLabMenuPage(driver);
		
	}
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.inputSwagLabLoginPageusername(UtilityClass.getTD(0,0));
		login.inputSwagLabLoginPagepassword(UtilityClass.getTD(0,1));
		login.clickSwagLabLoginPageLoginBtn();
		Thread.sleep(2000);
	}
	@Test
	public void verifyLogo()
	{
		boolean actResult=home.getSwagLabHomePageLogo();
		Assert.assertTrue(actResult);
	}
	@AfterMethod
	public void logoutFromApp() throws InterruptedException
	{
		home.clickSwagLabHomePageMenu();
		
		Thread.sleep(2000);
		menu.clickEx2_SwagLabMenuPageLogoutBtn();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
}
