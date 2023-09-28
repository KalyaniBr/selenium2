package Handing_OfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getRatingFromFlipkartApp {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//click on close btn
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	//send input in searchbar
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 11");
	//click on search icon
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	//String rating=driver.findElement(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg col-8-12'])[1]//span[6]")).getText();
	//System.out.println(rating);
	
	
	String rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
	System.out.println(rating);
	
	
}
}
