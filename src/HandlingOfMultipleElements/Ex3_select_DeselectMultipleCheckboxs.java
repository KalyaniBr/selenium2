package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_select_DeselectMultipleCheckboxs {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/multipleElements.html");
	
	List<WebElement>allcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement select :allcheckboxes)
	{
		select.click();
		Thread.sleep(200);
	}
	
	for(int i=allcheckboxes.size()-1;i>=0;i--)
	{
		allcheckboxes.get(i).click();
		Thread.sleep(500);
	}
}
}
