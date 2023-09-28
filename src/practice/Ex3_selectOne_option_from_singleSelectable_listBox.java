package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_selectOne_option_from_singleSelectable_listBox {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	
	Select S1=new Select(year);
	
	S1.selectByValue("1997");
	
	
}
}
