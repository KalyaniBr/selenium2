package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://www.amazon.in/");
	
	//driver.close();
	//driver.quit();
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String s=driver.getTitle();
	System.out.println(s);
	
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	
	
	
}
}
