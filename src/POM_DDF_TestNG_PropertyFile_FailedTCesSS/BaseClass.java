package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(UtilityClass.readDataFromPF("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
}
