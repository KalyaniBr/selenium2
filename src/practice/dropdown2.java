package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown2 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/?");
	Thread.sleep(2000);
	
WebElement order=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(order).perform();
	
	driver.findElement(By.xpath("//span[text()='Your Prime Video']")).click();
}
}
