package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class LoginTest_Practice extends Base_practice
{
	
	login_practice login;
	Home_practice home;
	Menu_practice menu;
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
	InitializeBrowser();	
	
	   login=new login_practice(driver);
	   home=new Home_practice(driver);
	menu=new Menu_practice(driver);
	}
	@BeforeMethod
	public void LoginToApp() throws IOException, InterruptedException
	{
		login.Username(Utility_Practice.gteTDfromPF("UN"));
	    login.Password(Utility_Practice.gteTDfromPF("PWD"));
	    login.clickloginbtn();
	    Thread.sleep(3000);
}
	
	@Test
	public void verifylogo()
	{
		TCID=1;
		boolean result=home.verifylogo();
		Assert.assertTrue(result);
	}
	
	
}
