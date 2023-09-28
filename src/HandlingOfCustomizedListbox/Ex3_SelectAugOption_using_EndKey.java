package HandlingOfCustomizedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_SelectAugOption_using_EndKey {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Actions act=new Actions(driver);
	act.click(month).perform();
	
	Thread.sleep(2000);
	//navigate to last option using "END" key
	act.sendKeys(Keys.END).perform();
	
	
	//navigate to Aug option using "Arrow_Up" key
	for(int i=1;i<=4;i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
	}
	
	Thread.sleep(2000);
	//Select option using "Enter" key
	act.sendKeys(Keys.ENTER).perform();
}
}
