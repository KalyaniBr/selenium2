package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Deme2 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("");
	
	driver.findElement(By.xpath("")).click();
	WebElement listbox=driver.findElement(By.xpath(""));
	       Select s=new Select(listbox);
	  s.selectByIndex(0);
	  s.selectByValue(null);
	 s.selectByVisibleText("");
	boolean result=s.isMultiple();
	
	System.out.println(result);
	if(result==true)
	{
		System.out.println("Multiple ");
	}
	else
	{
		System.out.println("Single");
	}
	
	s.deselectAll();
	s.deselectByIndex(0);
	s.deselectByValue(null);
	s.deselectByVisibleText(null);
	String f=s.getFirstSelectedOption().getText();
	
	System.out.println(f);
	List<WebElement>ll=s.getAllSelectedOptions();
	int b=s.getOptions().size();
	System.out.println(b);
}
}
