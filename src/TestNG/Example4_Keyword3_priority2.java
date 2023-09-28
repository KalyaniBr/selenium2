package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example4_Keyword3_priority2 {

	@Test(priority=2,invocationCount=2)             //duplicate priority=2
	public void TC1()
	{
		Reporter.log("-running TC1--",true);
	}
	
	@Test       //if we dont set any priority then bydefault (priority=0)
	public void TC2()
	{
		Reporter.log("--running TC2--",true);
	}
	
	@Test(priority=1)             //duplicate priority=1
	public void TC3()
	{
		Reporter.log("--running TC2--",true);
	}
	
	@Test(priority=-2)
	public void TC4()
	{
		Reporter.log("--running TC4--",false);
	}
	
}
