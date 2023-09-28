package WebElement_methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_isEnabled {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Kalyani\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	
	System.out.println(result);
	
	if(result==true)
	{
		System.out.println("Element is enabled");
	}
	else
	{
		System.out.println("Elements is disabled");
	}
	
}
}
