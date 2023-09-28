package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
	
			LoginPage s1=new LoginPage(driver);
	s1.username();
	s1.pass();
	s1.loginclick();
	
	Thread.sleep(2000);
	
	HomePage s2=new HomePage(driver);
	s2.verifylogo();
	s2.clickmenu(); 
	
	Thread.sleep(2000);

	Logout s3=new Logout(driver);
	s3.clickonlogout();
	
	driver.close();
	
	
	
}
}
