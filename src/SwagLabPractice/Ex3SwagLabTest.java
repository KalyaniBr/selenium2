package SwagLabPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3SwagLabTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Ex3SwagLabLoginpage A1=new Ex3SwagLabLoginpage(driver);
		A1.inputSwagLabLoginpageUsername();	
		A1.inputSwagLabLoginpagePassword();
		A1.clickSwagLabLoginBtn();	
	Thread.sleep(2000);
	
	Ex3SwagLabHomePage A2=new Ex3SwagLabHomePage(driver);
	A2.verifySwagLabHomePageLogo();
	A2.clickSwagLabHomePageMenuBtn();
	
	Thread.sleep(5);
	Ex3SwagLabMenuPage A3=new Ex3SwagLabMenuPage(driver);
	A3.clickSwagLabMenuPageLogoutBtn();
	
	driver.close();
	
	
}
}
