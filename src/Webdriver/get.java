package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://www.facebook.com/");
	
	   String Title =driver.getTitle();
	   System.out.println(Title);
	   System.out.println(driver.getCurrentUrl());
	//driver.manage().window().maximize();
	//driver.manage().window().minimize();
	   driver.navigate().to("https://www.facebook.com/");
	   driver.navigate().to("https://www.meesho.com/");
	   
	   driver.navigate().back();
	   driver.navigate().forward();
	   
	   
}
}
