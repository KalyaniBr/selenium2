package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	WebElement Country=driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select S=new Select(Country);
	
	boolean result=S.isMultiple();
	
	System.out.println(result);
	if(result==true)
	{
		System.out.println("Multiselectable");
	}
	else
	{
		System.out.println("Sigleselectable");
	}
	
	
	
}
}
