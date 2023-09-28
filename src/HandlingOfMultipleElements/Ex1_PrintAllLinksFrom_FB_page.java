package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_PrintAllLinksFrom_FB_page {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();	
		
	driver.get("https://www.facebook.com/");
		
  List<WebElement> allLinks=driver.findElements(By.xpath("//a"));  //links atarts with a
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
		
		
	}
	
	
	
	
	
	
	
}
