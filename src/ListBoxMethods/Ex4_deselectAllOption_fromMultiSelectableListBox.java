package ListBoxMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_deselectAllOption_fromMultiSelectableListBox {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	WebElement selectCountry=driver.findElement(By.xpath("//select[@id=\"1234\"]"));
	
	Select s=new Select(selectCountry);
	
	s.selectByIndex(2);
	s.selectByVisibleText("ind");
	//s.selectByValue("");
	
	Thread.sleep(2000);
	s.deselectAll();
	
	
	
	
}
}
