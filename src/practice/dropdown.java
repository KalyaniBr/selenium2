package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	
	//step1
	WebElement more=driver.findElement(By.xpath("//div[@class='exehdJ']"));
	//step2
	Actions act=new Actions(driver);
	
	act.moveToElement(more).perform();
	
	//click on Notification prefrence
	
  driver.findElement(By.xpath("//div[text()='Notification Preferences']")).click();	
	
	
	
}
}
