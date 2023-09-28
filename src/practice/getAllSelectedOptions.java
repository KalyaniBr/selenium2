package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(country);
	
	s.selectByVisibleText("ind");
	s.selectByIndex(1);
	s.selectByIndex(3);
	
	

		List<WebElement>allSelectedOptions=s.getAllSelectedOptions();
		for(WebElement s1:allSelectedOptions)
		{
			System.out.println(s1.getText());
		} 
	    
}
}
