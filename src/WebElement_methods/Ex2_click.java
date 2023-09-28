package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_click {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
   WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
	
//	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
}
}
