package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/multipleElements.html");
	
	List<WebElement>allCheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement s1:allCheckbox)
	{
	 s1.click();
	 Thread.sleep(200);
	}
	
	int size=allCheckbox.size();
	System.out.println(size);
	
	for(int i=allCheckbox.size()-1;i>=0;i--)
	{
		allCheckbox.get(i).click();
		Thread.sleep(200);
	}
	
	
	
	
}
}
