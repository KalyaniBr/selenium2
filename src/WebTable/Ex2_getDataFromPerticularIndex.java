package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_getDataFromPerticularIndex {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/S6.html");
	
	String text=driver.findElement(By.xpath("//table[@border='1']//tr[4]/td[2]")).getText();
	
	System.out.println(text);
	
	
}
}
