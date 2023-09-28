package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PSH_BaseClass {

	WebDriver driver;
	public void initializeBrowser() throws IOException
	{
	    driver=new ChromeDriver();
	
	    driver.get(PSH_UtilityClass.readDataFromPropertyFile("URL2"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    
	   
	}
	
	
	
	
	
}
