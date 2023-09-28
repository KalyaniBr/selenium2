package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Ex1_SwagLabLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	//Fetch data from excel sheet
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Ex1_SwagLabLoginPage login=new Ex1_SwagLabLoginPage(driver);
	
	String UNValue =sh.getRow(0).getCell(0).getStringCellValue();
   login.inputSwagLabLoginPageusername(UNValue);
	String PWDValue=sh.getRow(0).getCell(1).getStringCellValue();
	login.inputSwagLabLoginPagepassword(PWDValue);	
	login.clickSwagLabLoginPageLoginBtn();
	
	Thread.sleep(5000);
	
	Ex1_SwagLabHomePage A1=new Ex1_SwagLabHomePage(driver);
			A1.verifySwagLabHomePageLogo();
	   A1.clickSwagLabHomePageOpenMenu();
	   
		Thread.sleep(5000);

	   Ex1_SwagLabMenuPage A3=new Ex1_SwagLabMenuPage(driver);
	   A3.clickEx1_SwagLabMenuPageLogoutBtn();
	
	   driver.close();
	
	
	
	
}
}
