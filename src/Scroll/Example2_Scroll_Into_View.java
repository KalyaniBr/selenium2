package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_Scroll_Into_View {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	//find Facebook webelement
	
	WebElement facebook=driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
	
	Thread.sleep(3000);

	
	//This will sroll a page till the element is found
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",facebook);
	                                              //String webElement
}
}
