package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1Home1 {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement Logo;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement menu;
	
	public Ex1Home1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifylogo()
	{
		boolean result=Logo.isDisplayed();
	}
	public void clickmenu()
	{
		menu.click();
	}

	
	
	
	
	
	
}
