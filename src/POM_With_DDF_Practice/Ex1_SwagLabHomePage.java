package POM_With_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1_SwagLabHomePage {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement Logo;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement OpenMenu;
	
	public Ex1_SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyEx1_SwagLabHomePageLogo()
	{
		boolean result=Logo.isDisplayed();
		if(result==true)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Lodo is not present");
		}
	}
	
	public void clickEx1_SwagLabHomePageOpenMenu()
	{
		OpenMenu.click();
	}
	
	
}
