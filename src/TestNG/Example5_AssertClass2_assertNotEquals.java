package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_AssertClass2_assertNotEquals {

	//assertNotEqulas is used when actResult and expResult want diff if both are same then tc will fail
	
@Test
public void TC1()
{
	Reporter.log("-running TC1--",true);

	//actResult=!expResult=pass TC
	String actResult="hi";
	String expResult="hi";
	
	Assert.assertNotEquals(actResult,expResult,"Failed:both result are same");
	
}
	
	
	
}
