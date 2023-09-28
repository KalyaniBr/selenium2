package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5_MouseDropAndDrag {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	WebElement srcEle=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
	WebElement destEle=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	Actions act=new Actions (driver);
	
	act.dragAndDrop(srcEle,destEle).perform();
	
	//OR
	//act.moveToElement(srcEle).clickAndHold().moveToElement(destEle).build().perform();
	
	
	
	
}
}
