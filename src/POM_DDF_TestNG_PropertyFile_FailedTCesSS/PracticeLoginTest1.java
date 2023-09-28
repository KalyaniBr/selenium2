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

public class PracticeLoginTest1 extends PracticeBaseClass1
{

	PracticeLoginPage1 login;
	PracticeHomepage1 home;
	PracticeMenupage1 Menu;
	int TCID;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		initializeBrowser();
	login=new PracticeLoginPage1(driver);
	home= new PracticeHomepage1(driver);
	Menu=new PracticeMenupage1(driver);	
		
	}
	@BeforeMethod
	public void LoginToAPP() throws IOException, InterruptedException
	{
		login.PracticeLoginPage1username(PracticeUtilityClass1.readDataFromPF("UN"));
		login.PracticeLoginPage1password(PracticeUtilityClass1.readDataFromPF("PWD"));
		login.PracticeLoginPage1loginbtn();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void VerifyLogo()
	{
		TCID=101;
	      boolean result=home.VerifyPracticeHomepage1Logo();
	      Assert.assertTrue(result,"Failed:result is false");
	}
	@Test(priority=2)
	public void AddTOCartBtnConvertToRemove() throws EncryptedDocumentException, IOException
	{
		TCID=102;
	 home.PracticeHomepage1AddToCart();
	  String expText=UtilityClass.getTD(0, 2);
	       String actText =home.PracticeHomepage1RemeoveBtn();
	       Assert.assertEquals(actText,expText,"Failed102:both results are diff");
	}
	@AfterMethod
	public void Logout(  ITestResult s1) throws IOException, InterruptedException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
		home.PracticeHomepage1OpenMenu();
		Thread.sleep(2000);
		Menu.PracticeMenupage1LogoutBtn();
		Thread.sleep(2000);
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
	
	
}
