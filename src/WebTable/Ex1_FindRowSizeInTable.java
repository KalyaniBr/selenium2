package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_FindRowSizeInTable {

public static void main(String[] args) {
	
 WebDriver driver=new ChromeDriver();
 
 driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/S6.html");
	
 List<WebElement>allRows=driver.findElements(By.xpath("//table[@border='1']//tr"));
     int rowsize=allRows.size();
	System.out.println(rowsize);
}	
		
}
