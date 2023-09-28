package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//a[text()='Logout']")private WebElement logout; 
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogout()
	{
		logout.click();
	}
	
	
}
