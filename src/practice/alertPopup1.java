package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup1 {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("rty");
   
    driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	//switch to alert popup
	
   Alert alt =driver.switchTo().alert();   //switchTo()alert()-->is method of Alert interface
    
   //getText of popup
   String text= alt.getText();
   System.out.println(text);
   //click on ok
   alt.accept();
    //click on second ok
   alt.accept();
    //click on dismiss btn
    
  // alt.dismiss();
    
}
}
