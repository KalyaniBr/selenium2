package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 //driver.close();
	 
	// driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	// driver.close();

	 
	String s= driver.getTitle();
	System.out.println(s);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	 
        driver.navigate().to("https://www.facebook.com/");
	 Thread.sleep(2000);
	driver.navigate().to("https://www.google.co.in/");
	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	
	
	
	
}
}
