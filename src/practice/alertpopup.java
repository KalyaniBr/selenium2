package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	//enter id
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("sdf");
	
	//enter pwd
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
    //switch to popup
	
	Alert alt=driver.switchTo().alert();
	
	//click ok btn on popup
	
	//alt.accept();
	//alt.accept();
	
	//getText from popup
	
	alt.getText();
	
	alt.dismiss();
	
	
	
}
}
