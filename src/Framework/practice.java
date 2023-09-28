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

public class practice {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\\\Users\\\\jayas\\\\Desktop\\\\Notes\\\\Selenium.xlsx");
	
	Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	String username=sh.getRow(0).getCell(0).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("username");
	
	String password=sh.getRow(0).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
	
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	Thread.sleep(3000);
	driver.close();
	
	
	
}
}
