package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_SwagLabLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	

	WebDriver driver=new ChromeDriver();
	//Fetch data from excel sheet
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Ex2_SwagLabLoginPage login=new Ex2_SwagLabLoginPage(driver);
	
   login.inputSwagLabLoginPageusername(sh.getRow(0).getCell(0).getStringCellValue());
   
	login.inputSwagLabLoginPagepassword(sh.getRow(0).getCell(1).getStringCellValue());	
	login.clickSwagLabLoginPageLoginBtn();
	
	Thread.sleep(5000);
	
	Ex2_SwagLabHomePage home=new Ex2_SwagLabHomePage(driver);
			home.verifySwagLabHomePageLogo();
	   home.clickSwagLabHomePageOpenMenu();
	   home.clickEx2_SwagLabHomePageAddToCart();
	   home.VerifyEx2_SwagLabHomePageRemoveBtn(sh.getRow(0).getCell(2).getStringCellValue());
	   
		Thread.sleep(5000);

	   Ex2_SwagLabMenuPage logout=new Ex2_SwagLabMenuPage(driver);
	   logout.clickEx2_SwagLabMenuPageLogoutBtn();
	
	   driver.manage().window().minimize();
	   driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
