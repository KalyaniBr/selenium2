package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest2 {

	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabMenuPage menu;
	WebDriver driver;
	Sheet sh;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx ");
		 sh=WorkbookFactory.create(file).getSheet("DDF");
		
		 driver=new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		login=new SwagLabLoginPage(driver);
		 home=new SwagLabHomePage(driver);
		 menu=new SwagLabMenuPage(driver);
	}
	@BeforeMethod
	public void loginApp()
	{
		
		login.inputSwagLabLoginPageusername(sh.getRow(0).getCell(0).getStringCellValue());
		login.inputSwagLabLoginPageusername(sh.getRow(0).getCell(1).getStringCellValue());
		login.clickSwagLabLoginPageLoginBtn();
		
	}
	@Test
	public boolean verifyLogo()
	{
		boolean result=home.getSwagLabHomePageLogo();
		return result;
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		home.clickSwagLabHomePageMenu();
		Thread.sleep(2000);
		
		menu.clickEx2_SwagLabMenuPageLogoutBtn();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	
}
