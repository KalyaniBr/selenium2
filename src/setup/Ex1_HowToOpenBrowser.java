package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex1_HowToOpenBrowser {
	
public static void main(String[] args) 
{
	
	//step1;set path of chromedriver.exe file
	
	//para1:name of the browser(small letters)
	
	//para2:path of the browser file
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\jayas\\Desktop\\chromedriver_win32\\chromedriver.exe");
	
	//diffclassname.methodname();
	
	//Create an object ofChromeDriverclass with reference/datatype of super interference(webDriver)
	
	 
	 WebDriver driver=new ChromeDriver();
	 
		driver.get("https://www.flipkart.com");


		driver.close();
	 
	 
}
}
