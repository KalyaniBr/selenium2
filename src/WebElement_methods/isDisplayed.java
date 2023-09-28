package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	boolean result=driver.findElement(By.xpath("(//img[contains(@src,'//static-assets-web.flixcart.com/')])[1]")).isDisplayed();
	
	System.out.println(result);
	
if(result==true)	
{
	System.out.println("Element is Displyed");
}
else
{
	System.out.println("Element is not Displayed");
}


}
}
