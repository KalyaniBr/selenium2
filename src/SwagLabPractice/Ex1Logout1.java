package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1Logout1 {

	@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logout;
	
	public Ex1Logout1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicklogout()
	{
		logout.click();
	}
	
	
	
}
