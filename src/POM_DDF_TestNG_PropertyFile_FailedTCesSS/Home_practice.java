package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_practice {

	@FindBy(xpath="")private WebElement AddToCart;
	
	@FindBy (xpath="")private WebElement Remove;
	
	@FindBy(xpath="")private WebElement Logo;
	
	@FindBy(xpath="")private WebElement Menu;
	
	public Home_practice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifylogo() {
		boolean result=Logo.isDisplayed();
		return result;
	}
	
	public void clickAddToCart() {
		AddToCart.click();
	}
	
	public String verifyRemove() {
		String text=Remove.getText();
		return text;
	}
	
	public void clickMenu() {
		Menu.click();
	}
}
