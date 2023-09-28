package Locator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();	
	
	d.get("file:///C:/Users/jayas/Desktop/Notes/Classname.html");
	
	
	//for FN
	d.findElement(By.className("abc123")).sendKeys("opqrst");
	
	//for LN
	d.findElement(By.className("abc123")).sendKeys("gdhdh");
	
	//here className for both the elements are same so input will be sent to first element 
	//present on webpage in this way className can be same for two diff elements so we
	//will not use this type to find element
	
	
	
	
	
}
}
