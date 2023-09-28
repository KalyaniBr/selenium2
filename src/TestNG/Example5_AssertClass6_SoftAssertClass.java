package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example5_AssertClass6_SoftAssertClass {

	@Test
	public void TC1()
	{
	
		SoftAssert soft=new SoftAssert();
		
		String actresult="hi";
		String expresult="hi";
		soft.assertEquals(actresult, expresult,"Fail:both results are same");
		
		boolean result =false;
		soft.assertTrue(result,"fail:expresult is true");
		
		soft.assertAll();
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
