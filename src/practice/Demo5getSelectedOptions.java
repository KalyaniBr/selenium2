package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5getSelectedOptions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
	
	Select s=new Select(month);
	String text=s.getFirstSelectedOption().getText();
	System.out.println(text);
	
	
}
}
