package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_Keyword2_enabled {

	@Test()
	public void TC1()
	{
		Reporter.log("--Running TC1--",true);
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("--running TC2--",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("--running TC3--",true);
	}
	
	
}
