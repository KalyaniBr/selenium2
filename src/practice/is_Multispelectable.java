package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class is_Multispelectable {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	WebElement D=driver.findElement(By.xpath("//select[@id='month']"));
	
	Select S=new Select(D);
	
	 boolean result=S.isMultiple();
	 
	 System.out.println(result);
	 if(result==true)
	 {
		 System.out.println("Multiselectable");
	 }
	 else
	 {
		 System.out.println("Single selectable");
	 }
	 
	 
	 
}
}
