package POM_With_DDF_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwagLabLoginTest {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");		
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	Ex1_SwagLabLginPage login=new Ex1_SwagLabLginPage(driver);
	String UNValue=sh.getRow(0).getCell(0).getStringCellValue();
	   login.inpEx1_SwagLabLginPageUN(UNValue);
	   
		String PWDValue=sh.getRow(0).getCell(1).getStringCellValue();
	   login.inpEx1_SwagLabLginPagePWD(PWDValue);
	   
	   login.clickEx1_SwagLabLginPageLoginBtn();
	   
	Thread.sleep(2000);
	
	   Ex1_SwagLabHomePage home=new Ex1_SwagLabHomePage(driver);
		home.verifyEx1_SwagLabHomePageLogo();
	   home.clickEx1_SwagLabHomePageOpenMenu();
	   
		Thread.sleep(2000);

	   Ex1_SwagLabMenuPage menu=new Ex1_SwagLabMenuPage(driver);	   
	  menu.ckickEx1_SwagLabMenuPageLogout();
	  
	  driver.close();
	
}
}
