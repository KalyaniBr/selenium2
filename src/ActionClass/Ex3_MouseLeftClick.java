package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_MouseLeftClick {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement selenium=driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));
	
	Actions act=new Actions(driver);
	
	//act.moveToElement(selenium).perform();
	//act.click().perform();
	      //Or
	//act.moveToElement(selenium).click().build().perform();
	  //oR
	act.click(selenium).perform();
}
}
