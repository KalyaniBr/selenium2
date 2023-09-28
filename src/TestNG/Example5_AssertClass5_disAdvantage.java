package TestNG;

import org.testng.Assert;

public class Example5_AssertClass5_disAdvantage {

	public void TC10()
	{
		
	String actresult="hi";	
	String expresult="hello";
		
	Assert.assertEquals(actresult, expresult,"Fail1:both results are diff-");	
		
	boolean result=false;
	Assert.assertTrue(result,"Failed:exp result is false");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
