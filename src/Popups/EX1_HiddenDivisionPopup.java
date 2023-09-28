package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX1_HiddenDivisionPopup {
public static void main(String[] args) {
	
	//WebDriver driver=new ChromeDriver();
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	// Launching the browser
	WebDriver driver=new ChromeDriver(opt);
	
	driver.get("https://www.flipkart.com/");
	
	//Enter UN
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
	
	//Enter Pwd
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("123abc");
	
	//click on login btn
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	
}
}
