package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_clear {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kalyani");

	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).clear();
 WebElement Pass=driver.findElement(By.xpath("//input[@id='pass']"));

	Pass.sendKeys("Bramhankar");
	Thread.sleep(10000);
	Pass.clear();
	Thread.sleep(3000);
	Pass.sendKeys("abc@123");
	
}
}
