package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2_Deselect {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	 
			driver.get("file:///C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	//driver.findElement(By.xpath("//select[@id='1234']"))
	Thread.sleep(2000);
	WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(country);
	
	s.selectByVisibleText("ind");
	s.selectByIndex(3);
	Thread.sleep(2000);
	
	//s.deselectByIndex(3);
	//s.deselectByVisibleText("ind");
	
	//OR  can use deselect all option to delete all options at once
	
	s.deselectAll();
	
}
}
