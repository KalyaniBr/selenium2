package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_Keyword4_timeout{

	@Test(timeOut=3000) 
	public void TC1() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("running TC1--",true);
	}
	
	@Test
	public void TC2() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("-running TC2--",true);
	}
	
	
	
	
	
	
	
}
