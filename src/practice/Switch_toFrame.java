package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_toFrame {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	//switc to frame
	
	driver.switchTo().frame("iframeResult");  //using frame id
	//driver.switchTo().frame("iframeResult");  //using frame name
//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	//driver.switchTo().Frame(); //int FrameIndex
	
	//click on "click me" btn
	
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
}
}
