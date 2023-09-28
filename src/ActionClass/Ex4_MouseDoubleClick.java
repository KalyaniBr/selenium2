package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4_MouseDoubleClick {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement tarEle=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me ')]"));
	
	Actions act=new Actions(driver);
	
	//act.moveToElement(tarEle).perform();
	//act.doubleClick().perform();
	//OR
	
	//act.moveToElement(tarEle).doubleClick().build().perform();
	//OR
	
	act.doubleClick(tarEle).perform();
}
}
