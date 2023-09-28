package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_Keyword5_dependsOnMethods2 {

	@Test
	public void login1()
	{
		Reporter.log("--TC for login1--",true);
	}
	
	@Test
	public void login2()
	{
		Reporter.log("--Tc for login2---",true);
	}
	
	//here logout TC is depend on 2 login1 & login2 TC
	
	@Test(dependsOnMethods= {"login1","login2"})
	public void logout()
	{
		Reporter.log("--running logout test case",true);
	}
	
	
	
}
