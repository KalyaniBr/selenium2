package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_FindcolSizeInARow {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/jayas/Desktop/Notes/created%20html/S6.html");
	
  int colSize=driver.findElements(By.xpath("//table[@border='1']//tr[4]/td")).size();
  System.out.println(colSize);
  
  //for Header  col Size
  
  int colSizeH=driver.findElements(By.xpath("//table[@border='1']//tr[2]/td")).size();
  System.out.println(colSizeH);
  
  //To Print Headers
  List<WebElement>Headers=driver.findElements(By.xpath("//table[@border='1']//tr[2]/td"));
  for(WebElement s1:Headers)
  {
	 // s1.getText();
	  System.out.print(s1.getText()+" ");
  }
  
  

}
}
