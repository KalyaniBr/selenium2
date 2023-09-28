package POM_DDF_TestNG_UtilityClass_BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;  //declare
	
	public void initializeBrowser()
	{
	driver =new ChromeDriver();	//initialize
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
	}
	
	
	
}
