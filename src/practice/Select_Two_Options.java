package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Two_Options {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	WebElement SC=driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(SC);
	
	s.selectByVisibleText("ind");
	s.selectByIndex(2);
}
}
