package HandlingOfCustomizedListbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_selectOption {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	//step1
      WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	//step2
	Actions act=new Actions (driver);
	//step3
	act.click(month).perform();
	
	Thread.sleep(2000);
	
	//step 4
	//4A:navigate to 1 option to top using "Arrow_UP" key
	
	act.sendKeys(Keys.ARROW_UP).perform();
    act.sendKeys(Keys.ARROW_UP).perform(); //here method used 2 time for arrowup 2 times
	Thread.sleep(2000);

	//4Bnavigate to 1option to bottom using "Arrow_Down" key
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
	Thread.sleep(2000);

	
	//4C:Select options using "Enter" key
	
	act.sendKeys(Keys.ENTER).perform();
	
	
	
	
}
}
