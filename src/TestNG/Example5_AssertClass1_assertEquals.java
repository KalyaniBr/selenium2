package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Example5_AssertClass1_assertEquals {

// for assertEquals--actresult and expresult should be same otherwise tc will fali
	
	
	@Test
	public void TC1()
	{
		Reporter.log("running TC1",true) ;
//	(actresult=expresult)=pass TC //OR Fail
	
	String actResult="hi";
	String expResult="hi";
	
	Assert.assertEquals(actResult,expResult,"Failed:both results are diff-");
	
	}
}
