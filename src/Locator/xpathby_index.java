package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_index {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.amazon.in/");
		
		dr.findElement(By.xpath("//a[@class=\"nav-a  \"][1]")).click();
		
		dr.findElement(By.xpath("//a[contains(@class,'nav-a ')][1]")).click();
		//syntax--//tagname[contains(@attributename,'attributevalue')][index]
		
	}
	
	
}
