package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PSH_RegistrationTestClass extends PSH_BaseClass
{

	
	PSH_RegistrationPage Registration;
	PSH_HomePage Home;
	PSH_StorePage Storage;
        int TCID;
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
		initializeBrowser();
		Registration= new PSH_RegistrationPage(driver);
		Home=new PSH_HomePage(driver);
		Storage=new PSH_StorePage(driver);
	}
	@BeforeMethod
	public void OpenRegistration() throws EncryptedDocumentException, IOException, InterruptedException
	
	{
	//	Home.clickPSH_HomePageProfile();
	//	Home.PSH_HomePage_searchproduct(PSH_UtilityClass.getTD(1,0));
	//	Home.clickPSH_HomePagestore();
	//	Thread.sleep(5000);
	}
	@Test
	public void  VerifyLogo()
	{
		 TCID = 101;
		boolean result=Home.verifyPSH_HomePageLogo();
		Assert.assertTrue(result,"Failed:result is False");
		
	}
	@Test
	public void CheckStoreage() throws IOException, InterruptedException
	{
		 TCID=102;
		Home.clickPSH_HomePagestore();
		Thread.sleep(3000);
		Storage.EnterCityName(PSH_UtilityClass.readDataFromPropertyFile("City1"));
		Storage.clickFindStoreBtn();
		Thread.sleep(2000);
            
	}
	@AfterMethod
	public void CaptureSSOFFailTCs(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			PSH_UtilityClass.CaptureSSOfFailTC(driver, TCID);
		}
	}
	public void CloseBrowser() 
	{
		driver.close();
	}
	
}
