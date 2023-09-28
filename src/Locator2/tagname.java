package Locator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();

	d.get("file:///C:/Users/jayas/Desktop/Notes/tagname.html");
	
	//For FN
	d.findElement(By.tagName("input")).sendKeys("abc");
	
	//For LN
	d.findElement(By.tagName("input")).sendKeys("xyz");
	
// we dont use tagname for finding elements becs most of the time tagname for two elements
	//can be same 
	//and compiler will perform action on first element present on webpage
	
	
	//we only use xpath xpression
	
	
	
	
	
}
}
