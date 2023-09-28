package HanndlingOfAutosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	
	driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
	
	Thread.sleep(200);
	List<WebElement>allSugg=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	String ExpText="redmi note 12 pro";
	for(WebElement s1:allSugg)
	{
		String actText=s1.getText();
		if(actText.equals(ExpText))
		{
			s1.click();
			break;
		}
		
	}
	
	
	
	
}
}
