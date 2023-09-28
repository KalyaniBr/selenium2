package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MBT {

	@Parameters("browserName")
	@Test
	public void name(String browserName) throws InterruptedException
	{
		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver=new EdgeDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	
	
	
	
	
	
}
