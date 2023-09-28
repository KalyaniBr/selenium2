package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {

	//step1 declaration
	@FindBy(xpath=("//div[@class='app_logo']"))private WebElement LOGO;
	
	@FindBy(xpath=("//button[@id='react-burger-menu-btn']"))private WebElement openMenu;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
	
	@FindBy(xpath="//button[text()='Remove']")private WebElement Remove;
	
	//step 2 Initalization
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
	
	//step3 usage
	
	public boolean getSwagLabHomePageLogo()
	{
		boolean result=LOGO.isDisplayed();
		return result;
	}
	
	public void clickSwagLabHomePageMenu()
	{
		openMenu.click();
	}
	public void clickSwagLabHomePageAddToCart()
	{
		AddToCart.click();
	}
	public void verifySwagLabHomePageRemoveBtn(String expText)
	
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
}
