package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLoginTest {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize(); 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	SwagLabLoginPage login=new SwagLabLoginPage(driver);
	login.enterUN();
	login.enterPWD();
	login.clickOnLoginbtn();
	
	Thread.sleep(3000);
	SwagLabHomePage Home=new SwagLabHomePage(driver);
     Home.VerifyLOGO();
	Home.clickOnOpenMenu();
	
	Thread.sleep(3000);

		SwagLabMenuPage Menu=new SwagLabMenuPage(driver);
          Menu.clickonmenu();
		
      	Thread.sleep(3000);
     
	driver.close();	
		
}
}
