package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeHomePage2 {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement Logo;
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")private WebElement Menu;
	@FindBy(xpath="//button[text()='Remove']")private WebElement Remove;
	
	public PracticeHomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyPracticeHomePage2Logo()
	{
		boolean result=Logo.isDisplayed();
		return result;
	}
	public void clickPracticeHomePage2AddToCartBTn()
	{
		AddToCart.click();
	}
	public String PracticeHomePage2RemoveBtn()
	{
		String result=Remove.getText();
		return result;
	}
	public void PracticeHomePage2clickMenuBtn()
	{
		Menu.click();
	}
	
	
}
