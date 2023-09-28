package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Is_Selected {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role=\"button\"])[1]")).click();
	
	boolean result = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]")).isSelected();
	System.out.println(result);
	
	
 if(result==true)
	 
 {
	 System.out.println("Selected");
 }
 else
 {
	 System.out.println("Not Selected");
 }
 
 
 
}
}
