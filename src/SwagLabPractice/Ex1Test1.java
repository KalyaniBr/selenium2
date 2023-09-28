package SwagLabPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1Test1 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Ex1Login1 O2=new Ex1Login1(driver);
	O2.username();
	O2.pass();
	O2.loginbtn();
	Thread.sleep(2000);
	
	Ex1Home1 O1=new Ex1Home1(driver);
	O1.clickmenu();
	O1.verifylogo();
	Thread.sleep(2000);

	Ex1Logout1 O3=new Ex1Logout1(driver);
	O3.clicklogout();
	
	driver.close();
}
}
