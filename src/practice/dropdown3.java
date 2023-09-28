package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown3 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.meesho.com/");
	
	WebElement Women =driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(Women).perform();
	
	driver.findElement(By.xpath("//p[text()='Cotton Silk Sarees']")).click();
	
	
}
}
