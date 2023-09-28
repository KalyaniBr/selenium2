package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_Keyword5_dependsOnMethods1 {


	@Test
	public void login()
	{
		Reporter.log("--runnig login test case--",true);
	}
	//(here if login tc is failed then logout will not be executed it will skip)
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		Reporter.log("-logout test case--",true);
	}
	
//---------------------------------------------------	
	
	
	
	
	
}
