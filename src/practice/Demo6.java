package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	WebElement selectCountry=driver.findElement(By.xpath("//select[@id=\"1234\"]"));
	
	Select s=new Select(selectCountry);
	
	s.selectByIndex(1);
	//s.SelectByValue("");
	s.selectByVisibleText("ind");
	
	Thread.sleep(2000);
	
	List<WebElement>AllSelectedOptions=s.getAllSelectedOptions();
	
	for(WebElement S:AllSelectedOptions)
	{
		System.out.println(S.getText());
	}
}
}
