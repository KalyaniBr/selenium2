package HandlingOfCustomizedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex2_Select_AugOptionUsing_HomeKey {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Actions act=new Actions(driver);
	act.click(month).perform();
	
	Thread.sleep(2000);
	//navigate to 1st option using "Home" key
	
	act.sendKeys(Keys.HOME).perform();
	//navigate to aug option using "Arrow_Down" key
	for(int i=1;i<=7;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
	
	Thread.sleep(5000);
   //Select option using "Enter"key
	act.sendKeys(Keys.ENTER).perform();
	
	driver.close();
	
	
	
	
}
}
