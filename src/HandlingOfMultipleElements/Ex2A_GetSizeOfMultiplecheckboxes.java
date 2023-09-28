package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2A_GetSizeOfMultiplecheckboxes {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/multipleElements.html");
//	
//	List<WebElement>allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
//	
//	int size=allcheckboxes.size();
//	System.out.println(size);
	
	int size=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	System.out.println(size);
	
	
}
}
