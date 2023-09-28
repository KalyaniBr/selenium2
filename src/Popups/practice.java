package Popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
public static void main(String[] args) {
	
	
	ChromeDriver driver =new ChromeDriver();
	
	driver .findElement(By.xpath(""));
	Set<String>ids=driver.getWindowHandles();
	ArrayList <String> alt=new ArrayList<String>(ids);
         String id=alt.get(0);
         
         driver.switchTo().window(id);
}
}
