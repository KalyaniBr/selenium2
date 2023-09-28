package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PracticeLoginTest2 extends PracticeBaseClass2
{

	PracticeLoginPage2 Login;
	PracticeHomePage2 home;
	PracticeMenuPage2 menu;
	int TCID;
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initaializeBrowser();

		Login=new PracticeLoginPage2(driver);
		home =new PracticeHomePage2(driver);
		menu=new PracticeMenuPage2(driver);		
	}
	@BeforeMethod
	public void LoginToApp() throws IOException, InterruptedException
	{
		Login.PracticeLoginPage2username(PracticeUtiltityClass2.readDataFromPF("UN"));
		Login.PracticeLoginPage2password(PracticeUtiltityClass2.readDataFromPF("PWD"));
		Login.PracticeLoginPageclickLoginBtn();
		Thread.sleep(3000);
	}
	@Test
	public void verifylogo()
	{
		TCID=101;
		boolean result=home.VerifyPracticeHomePage2Logo();
		Assert.assertTrue(result,"Failed:result is false");
	}
	@Test
	public void AddToCartconvertRemeove() throws EncryptedDocumentException, IOException
	{
		TCID=102;
		home.clickPracticeHomePage2AddToCartBTn();
		String acttext=PracticeUtiltityClass2.getTD(1,0);
		String exptext=home.PracticeHomePage2RemoveBtn();
		Assert.assertEquals(acttext, exptext);
	}
	@AfterMethod
	public void LogoutApp(ITestResult s1) throws IOException, InterruptedException
	{
		if(s1.getStatus()==ITestResult.FAILURE);
		{
			PracticeUtiltityClass2.captureSS(driver,TCID);
		}
		home.PracticeHomePage2clickMenuBtn();
		Thread.sleep(3000);

		menu.PracticeMenuPage2clickLogoutBtn();
		Thread.sleep(3000);

	}
		@AfterClass
		public void CloseBrowser()
		{
			driver.close();
		}
	
}
