package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_one_option {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	WebElement S=driver.findElement(By.xpath("//select[@id='month']"));
	
	Select S1=new Select(S);
	
	S1.selectByVisibleText("Jun");
	
	Thread.sleep(2000);
	
	
	
	
	
	
}
}
