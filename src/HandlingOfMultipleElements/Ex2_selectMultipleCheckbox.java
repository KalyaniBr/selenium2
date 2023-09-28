package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_selectMultipleCheckbox {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/multipleElements.html");
	
	List<WebElement>allcheckboxs=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement s1:allcheckboxs)
	{
		s1.click();
		Thread.sleep(1000);
	}
}
}
