package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Ex2_AlertPopup {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
	//enter customers id
	
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc123");
	
	Thread.sleep(3000);
	//enter submit btn	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	//switch to alt popup
	
	Alert alt=driver.switchTo().alert();
	
	//get text from alert popup
	Thread.sleep(3000);
	String text=alt.getText();  //getText is method of Alert interface
	
	System.out.println(text);
	
	//click cancle btn from popup
	
	//alt.dismiss();                  dismiss is method of alert interface
	
	//click ok btn from popup
	alt.accept();            //accept is method of Alert interface
	
	//click ok btn from 2nd alert
	
	alt.accept();
	
	
}
}
