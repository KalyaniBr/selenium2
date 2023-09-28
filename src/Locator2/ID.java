package Locator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();	
	
	d.get("file:///C:/Users/jayas/Desktop/Notes/ID.html");
	
	//for FN
	d.findElement(By.id("123")).sendKeys("abc");
	
	//for LN
	d.findElement(By.id("345")).sendKeys("xyz");
	
	//sometimes ID of two elements can be same and we can not use index as well
	//so we will not use this to find elements
	
	
}
	
	
}
