package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example2_EmailableReport {

 @Test

	public void TC1()         //test case Or test method
	{
	 Reporter.log("--running TC1--",true);
	}
	
 @Test
 public void TC2()         //test case or Testmethod
 {
	 Reporter.log("--running TC2---",true);
 }
	
 @Test
 public void TC3()
 {
	 Reporter.log("---running TC3---",true);
 }
	
	
	
	
	
}
