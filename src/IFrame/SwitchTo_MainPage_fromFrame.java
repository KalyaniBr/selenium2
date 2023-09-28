package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_MainPage_fromFrame {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//switch to frame
	
	driver.switchTo().frame("iframeResult");  //iframe Name
	
	//click on "click me" btn from iframe
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	

	//switch to main page
	
	driver.switchTo().parentFrame();  //use to back child to immidate parent
	//driver.switchTo().defaultContent();    //any child to home
	//click to open menu btn from main page
	
	driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	
	
	
}
}
