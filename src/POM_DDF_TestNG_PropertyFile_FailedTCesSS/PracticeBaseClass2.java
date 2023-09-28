package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBaseClass2 {

	WebDriver driver;
	public void initaializeBrowser() throws IOException
	{
		driver= new ChromeDriver();
		
		driver.get(PracticeUtiltityClass2.readDataFromPF("URL"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
}
