package SwagLabPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2Test {
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Ex2login A1=new Ex2login(driver);
	A1.username();
	A1.pass();
	A1.clicklogin();
	
	Thread.sleep(2000);
	
	Ex2HomePage A2=new Ex2HomePage(driver);
	A2.clickmenu();
	A2.verifylogo();
	
	Thread.sleep(2000);

	Ex2Logout A3=new Ex2Logout(driver);
	A3.clicklogout();
	
	driver.close();
	
	
	
	
}
}
