package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Example12_MultiBrowserTesting {

	
	@Parameters("browserName")
	@Test
	public void name(String browserName)
	{
		WebDriver driver=null;
		
	if(browserName.equals("chrome"))	
	{
		
	driver=new ChromeDriver();	
		
	}
	else if(browserName.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	else if(browserName.equals("firefox"))	
	{
		driver=new FirefoxDriver();
	}
		
		driver.get("https://www.google.co.in/");
		
	//	driver.manage().window().maximize();
		
		driver.close();
		
		
		
		
		
		
		
	}
	
}
