package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex5SwagLabHomePage {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement Logo;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement menu;
	
	public Ex5SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySwagLabHomePageLogo()
	{
		boolean result=Logo.isDisplayed();
	}
	public void clickswagLabHomePageMenuBtn()
	{
		menu.click();
	}
	
	
}
