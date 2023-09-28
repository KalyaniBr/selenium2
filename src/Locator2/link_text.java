package Locator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_text {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();	
	
	d.get("file:///C:/Users/jayas/Desktop/Notes/link&partial_link.html");
	
	d.findElement(By.linkText("facebook")).click();
	
	
	
	
	
}
}
