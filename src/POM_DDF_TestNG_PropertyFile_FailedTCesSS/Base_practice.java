package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_practice {

	 WebDriver driver;
	
	public  void InitializeBrowser() throws IOException {
		
		driver=new ChromeDriver();
		
		driver.get(Utility_Practice.gteTDfromPF("URL"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	
	
	
	
	
	
}
