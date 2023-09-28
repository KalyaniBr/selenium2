package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_WithoutDDF {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//enter UN
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	
	//enter password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	
	//click on login btn
	
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	Thread.sleep(2000);
	 boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
	
	if(result==true)
	{
		System.out.println("Logo found-->Pass");
	}
	else
	{
		System.out.println("Logo not found-->Fail");
	}
	
	//click on open menu option
	
	
	Thread.sleep(2000);
	
	//click on menu btn
	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	
	//click on logout btn
	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

	Thread.sleep(2000);
	
	driver.close();
	
}
}
