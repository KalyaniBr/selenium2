package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

//result is false TC is pass 
public class Example5_AssertClass4_assertfalse {

	@Test
	public void TC1()
	{
	
		boolean actresult=true;
		
		Assert.assertFalse(actresult,"falied-actresult is true:");
	
	}
	
	
	
	
	
	
}
