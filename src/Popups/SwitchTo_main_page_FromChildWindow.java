package Popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_main_page_FromChildWindow {

public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//click on new tab from main page
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click(); 
	
	// get childWindowID
	 Set<String> allids =driver.getWindowHandles();   //-->This will give id of mainpage &childWindow
	//convert set to arrylist
	ArrayList<String> al=new ArrayList<String>(allids);
	//(mainpage id(0) &ChildWindowId(1))
	
	//switch to childWindow
	driver.switchTo().window(al.get(1)); //String childWindowID
	
	//click on Triaining link from ChildWindow
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	
	//switch to main page
	   driver.switchTo().window(al.get(0));	//String mainpage id
	   
	Thread.sleep(2000)  ; 
	
	//click on new window from main page
	   
	driver.findElement(By.xpath("//input[@name='New Window']")).click();   
	   
}
}
