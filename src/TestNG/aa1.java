package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class aa1 {

	@Test(groups="SignUp")
	public void TC1()
	{
		Reporter.log("--running TC1--",true);
	}
	
	@Test(groups="logout")
	public void TC2()
	{
		Reporter.log("--running TC2--",true);
	}
	@Test(groups="logout")
	public void TC3()
	{
		Reporter.log("--running TC1--",true);
	}
	@Test(groups="SignUp")
	public void TC4()
	{
		Reporter.log("--running TC4--",true);
	}

	
	
	
}
