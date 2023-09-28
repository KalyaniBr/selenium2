package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_pathByAttribute {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("bramhankarkalyani72@gmail.com");
	
	
	
	
}
}
