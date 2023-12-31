package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
public static void main(String[] args) throws InterruptedException {
	
WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(2000);
	WebElement more=driver.findElement(By.xpath(""));
	
	Actions act=new Actions(driver);
	
	act.moveToElement( more).perform();
	act.doubleClick().perform();
	act.build().perform();
	act.contextClick().perform();
	act.click().perform();
	
}
}
