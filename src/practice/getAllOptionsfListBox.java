package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllOptionsfListBox {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	Select S=new Select(month);
	
	List<WebElement>AllOptions=S.getOptions();
	for(WebElement W:AllOptions)
	{
		System.out.println(W.getText());
	}
	
}
}
