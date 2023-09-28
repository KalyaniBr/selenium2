package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeBaseClass1 {

	WebDriver driver;
	
	public void initializeBrowser() throws EncryptedDocumentException, IOException 
	{
		
		 driver=new ChromeDriver();
		
		driver.get(PracticeUtilityClass1.readDataFromPF("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
}
