package SwagLabPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5SwagLabTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
			
    Ex5SwagLabLoginpage A1=new Ex5SwagLabLoginpage(driver);
	A1.inputSwagLabLoginPageusername();
	A1.inputSwagLabLoginPagepassword();
	A1.clickSwagLabLoginPageLoginBtn();
	
	Thread.sleep(2000);
	
	Ex5SwagLabHomePage A2=new Ex5SwagLabHomePage(driver);
	A2.verifySwagLabHomePageLogo();
	A2.clickswagLabHomePageMenuBtn();
	
	Thread.sleep(2000);

	Ex5SwagLabMenuPage A3=new Ex5SwagLabMenuPage(driver);
	A3.clickSwagLabMenuPageLogoutBtn();
	
	driver.close();
	
	
	
	
}
}
