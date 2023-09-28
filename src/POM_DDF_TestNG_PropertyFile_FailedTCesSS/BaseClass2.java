package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {

	WebDriver driver;
	
	public void initializeBrowser()
	{
		driver=new ChromeDriver();
		
		driver.get("");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
	}
	
	
	
	
}
