package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver ();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kalyani");
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz@123");
	
	//sendKeys is used to give input in webElement
	
}
	
	
	
	
}
