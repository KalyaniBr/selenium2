package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	//In Hidden dividsion popus no need to switch to popup,we can directly take action on popups
	
	//sent UN
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Kalyani");
	//send pwd
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Bramhankar123");
	//click on submit btn
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	
	
	
	
	
}
}
