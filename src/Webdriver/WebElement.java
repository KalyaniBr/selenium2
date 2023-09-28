package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kalyani");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bramhankar");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='password']")).clear();
	//driver.findElement(By.xpath("//button[@name='login']")).click();
}


	
}
}
