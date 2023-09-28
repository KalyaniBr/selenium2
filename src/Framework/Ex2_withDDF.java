package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_withDDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
FileInputStream file=new FileInputStream("C:\\Users\\jayas\\Desktop\\Notes\\Selenium.xlsx");	
	
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//EnterUN
	String username=sh.getRow(0).getCell(0).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("username");
	
	//enter password
	
	String pass=sh.getRow(0).getCell(1).getStringCellValue();

	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pass");

	
	//click on login btn
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(2000);

	boolean result=driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
	if(result==true)
	{
		System.out.println("Logo  found-->Pass");
	}
	else
	{
		System.out.println("Logo not found-->Fail");
	}
	//click on open menu option
	
	
		Thread.sleep(2000);
		
		//click on menu btn
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		//click on logout btn
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

		Thread.sleep(2000);
		
		driver.close();
		

	
}
}
