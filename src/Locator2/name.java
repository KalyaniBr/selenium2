package Locator2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d =new ChromeDriver();

	d.get("file:///C:/Users/jayas/Desktop/Notes/name.html");
	
	d.findElement(By.name("xyz123")).sendKeys("Kalyani");
	
	d.findElement(By.name("xyz123")).sendKeys("Bramhankar");
	
	// here both inpus are filled in same FN element becs both elements contains same
	//name so, for the elements name can be same sometimes so it is not good  always to 
	// use By.name for finding elements
}
}
