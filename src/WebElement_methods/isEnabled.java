package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	
	boolean result=driver.findElement(By.xpath("//input[contains(@title,'Search for products')]")).isEnabled();
	
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("Element is Enabled");
	}
	else
	{
		System.out.println("Element is Disabled");
	}
	
}
}
