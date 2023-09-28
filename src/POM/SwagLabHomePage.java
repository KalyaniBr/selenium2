package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {

	//step 1:declaration
	
	@FindBy(xpath=("//div[@class='app_logo']"))private WebElement LOGO;
	
	@FindBy(xpath=("//button[@id='react-burger-menu-btn']"))private WebElement openMenu;
	
	//step 2 Initalization
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//step3:usage
	public void VerifyLOGO()
	{
		boolean result=LOGO.isDisplayed();
		if(result==true) 
		{
			System.out.println("Logo found-->Pass");
		}
		else
		{
			System.out.println("Logo not found-->Fail");
		}
		
	}
	public void clickOnOpenMenu()
	{
		openMenu.click();
	}

	
	
	
	
}
