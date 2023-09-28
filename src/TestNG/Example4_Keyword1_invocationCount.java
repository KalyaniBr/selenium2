package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_Keyword1_invocationCount {

	@Test(invocationCount=3)
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(invocationCount=5)
	public void TC2()
	{
		Reporter.log("-running TC2--",true);
	}
	
	@Test(invocationCount=2)
	public void TC3()
	{
		Reporter.log("--running TC3---",true);
	}
	
}
