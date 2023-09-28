package ListBoxMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex5_isMultiple1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	
	WebElement month=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
	
	Select s1=new Select(month);
	
	boolean result =s1.isMultiple(); //isMultiple method is used for checking whether listbox
	                                  // is single option selectable or multi option selectable
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("Listbox is of Multi-selectable");
	}
	else
	{
		System.out.println("ListBox is of Single_Selectable");
	}
	
	
	
}
}
