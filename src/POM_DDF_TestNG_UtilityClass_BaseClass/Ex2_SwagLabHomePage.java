package POM_DDF_TestNG_UtilityClass_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex2_SwagLabHomePage {

	//step 1:declaration
	
		@FindBy(xpath=("//div[@class='app_logo']"))private WebElement LOGO;
		
		@FindBy(xpath=("//button[@id='react-burger-menu-btn']"))private WebElement openMenu;
		
		@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
		
		@FindBy(xpath="//button[text()='Remove']")private WebElement Remove;
		//step 2 Initalization
		
		public Ex2_SwagLabHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//step3:usage
		public void verifySwagLabHomePageLogo()
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
		
    public void clickEx2_SwagLabHomePageAddToCart()
    {
    	AddToCart.click();
    }
	public void VerifyEx2_SwagLabHomePageRemoveBtn(String expText)
	{
		String actText=Remove.getText();
		if(actText.equals(expText))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
			
	public void clickSwagLabHomePageOpenMenu()
	{
		openMenu.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
