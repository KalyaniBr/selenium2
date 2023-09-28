package ListBoxMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex6_isMultiple2 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
			
	driver.get("file:///C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	   WebElement country =driver.findElement(By.xpath("//select[@id=\"1234\"]"));
	
	     Select s1=new Select(country);
	
	      boolean result = s1.isMultiple();
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println(" listbox is Multiselectable");
	}
	else
	{
		System.out.println("Listbox is SingleSelectable");
	}
	
	
	
	
}
}
