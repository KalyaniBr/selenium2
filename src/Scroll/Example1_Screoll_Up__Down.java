package Scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_Screoll_Up__Down {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	
	//down-->2nd parameter +ve value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	
	Thread.sleep(3000);
	//up-->2nd parameter -ve
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -300)");
	
//	Thread.sleep(3000);
//
//	 //right-->1st parameter +ve  value
//	
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(3000, 0)");
//	
//	Thread.sleep(3000);
//
//	//left-->1 st parameter -ve value
//	
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(-3000, 0)");
}
}
