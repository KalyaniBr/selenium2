package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page2
public class Ex1_SwagLabHomePage {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement Logo;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement OpenMenu;
	
	public Ex1_SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySwagLabHomePageLogo()
	{
		boolean result=Logo.isDisplayed();
		if(result==true)
		{
			System.out.println("Logo is Present");
		}
		else
		{
			System.out.println("Logo is not Present");
		}
	}
   public void clickSwagLabHomePageOpenMenu()
   {
	   OpenMenu.click();
   }
			
			
			
	}
	
	
	
	
	
	
	

