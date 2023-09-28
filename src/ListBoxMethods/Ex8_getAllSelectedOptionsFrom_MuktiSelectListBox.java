package ListBoxMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex8_getAllSelectedOptionsFrom_MuktiSelectListBox {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\jayas\\Desktop\\Notes\\created html\\dropdowm html");
	
	WebElement selectCountry=driver.findElement(By.xpath("//select[@id='1234']"));
	
	Select s=new Select(selectCountry);
	
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(3);
	
	List<WebElement>allSelectedOptions=s.getAllSelectedOptions();
	for(WebElement s1:allSelectedOptions)
	{
		System.out.println(s1.getText());
	}
	
}
}
