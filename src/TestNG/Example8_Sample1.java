package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_Sample1 {

	//disable TC execution using incluce and exclude in test suite---see testsuit Sample1
	@Test
	public  void TC1()
	{
		Reporter.log("-running TC1--",true);
	}
	
	@Test
	public  void TC2()
	{
		Reporter.log("-running TC2--",true);
	}
	
	@Test
	public  void TC3()
	{
		Reporter.log("-running TC3--",true);
	}
	
	
	
	
	
}
