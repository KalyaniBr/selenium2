package Handing_OfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_getRewiewFromFlipkartApp {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmo note 11");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String review=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
		System.out.println(review);
		
	}
		
}
