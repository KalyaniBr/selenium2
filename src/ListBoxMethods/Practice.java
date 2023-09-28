package ListBoxMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Webdriver.WebElement;

public class Practice {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	  driver .get("https://www.facebook.com/");
	
	  
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();;
	
	iist=driver.findElement(By.xpath("//select[@title='Month']"));
month= driver.findElement(By.xpath("//select[@title='Month']"));

	  Select s=new Select(list)
	
	
	
	
}
}
