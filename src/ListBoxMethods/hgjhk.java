package ListBoxMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hgjhk {
        WebDriver driver=new ChromeDriver();
	
        driver.get("file://C:/Users/jayas/Desktop/Notes/dropdown.html");
    	
    	WebElement selectCountry=driver.findElement(By.xpath("//Select[@id='1234']"));
    	
    	Select s=new Select(selectCountry);
     
 

		
    	List<WebElement>allOptions=s.getOptions();
    
	 
	
}
