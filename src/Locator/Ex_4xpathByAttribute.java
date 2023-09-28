package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_4xpathByAttribute {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("9604893245");
	
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("abcd");
	
	driver.findElement(By.xpath("//div[@class=\"_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm\"]")).click();
}
}
