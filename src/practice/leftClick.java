package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leftClick 
{
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	
	WebElement Grocery = driver.findElement(By.xpath("//img[@loading='lazy']"));
	
	Actions act=new Actions (driver);
	
	act.click(Grocery).perform();
	
}


}
