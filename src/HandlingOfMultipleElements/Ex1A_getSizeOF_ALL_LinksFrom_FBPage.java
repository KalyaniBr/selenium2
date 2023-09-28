package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1A_getSizeOF_ALL_LinksFrom_FBPage {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
//  List<WebElement>allLinks =driver.findElements(By.xpath("//a"));
//	int size=allLinks.size();
//	System.out.println(size);
//	
	//OR
	
	int size =driver.findElements(By.xpath("//a")).size();
	
	System.out.println(size);
	
	
	
	
	
	
}
}
