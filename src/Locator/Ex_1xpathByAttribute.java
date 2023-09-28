package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1xpathByAttribute {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
	//enter UN
     //driver.findElement(locator type);x
     //driver.findElement(By.xpath("String xpathXpression"))
     
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefg");
	// enter pass
	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz@123");
	
	//click on login button
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
