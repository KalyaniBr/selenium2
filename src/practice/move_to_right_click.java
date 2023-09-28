package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_to_right_click {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement rightClick =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	
	Actions act=new Actions(driver);
	
	
	//act.moveToElement(rightClick).click().build().perform();
	//act.click(rightClick).perform();
	act.click(rightClick).perform();
}
}
