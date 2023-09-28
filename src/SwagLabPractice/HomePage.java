package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement Logo;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement Menu;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifylogo()
	{
		boolean result=Logo.isDisplayed();
	}
	
	public void clickmenu ()
	{
		Menu.click();
	}
	
	
}
