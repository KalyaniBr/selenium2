package ListBoxMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_selectOption_fromSingleSelectableListbox {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(2000);
	
	//step 1
	
	WebElement month= driver.findElement(By.xpath("//select[@title='Month']"));
	
	//step 2//select[@id="month"]
	Select s=new Select(month);
	
	//step 3
	s.selectByVisibleText("Jun"); //String text
	//s.selectByValue("12");             //String value
	//s.selectByIndex(5);
	
	
	
}
}
