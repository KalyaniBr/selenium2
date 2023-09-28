package ListBoxMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_selectOption_fromMultiSelectableListbox {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/jayas/Desktop/Notes/dropdown.html");
	
	//step 1
	WebElement selectCountry =driver.findElement(By.xpath("//select[@id=\"1234\"]"));
	
	//step2
	
	Select s=new Select(selectCountry);
	
	//step 3
	
	s.selectByVisibleText("ind");
	//s.selectByValue("");
	s.selectByIndex(2);
}
}
