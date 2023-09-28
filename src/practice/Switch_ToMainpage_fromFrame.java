package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_ToMainpage_fromFrame {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//switch to frame
	driver.switchTo().frame("iframeResult");
	 
	//click on "click me"
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
	//switch to main page
	
	driver.switchTo().parentFrame();
	
	//click on menu
	
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
}
}
