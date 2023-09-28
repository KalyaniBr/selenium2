package Popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_ChildWindow {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	//click on new tab from main page
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	//get child window id
	
	Set<String>allids=driver.getWindowHandles(); //-->return id of mainpag and child windos we only want child id
	//{mainpageID,childwindowID} -->it will give set of string convert set in list
	
	ArrayList<String>al=new ArrayList <String>(allids);  //after converting set into arrays
	//{mainpage id-->0 & childWindow id-->1}
	
	String childWindowID=al.get(1);
	
	//switch to child Window
	
	driver.switchTo().window(childWindowID); //String childWindow id
	
	//click on training link from child window
	
	driver.findElement(By.xpath("(//span[text()='Training'])")).click();
	
	
}
}
