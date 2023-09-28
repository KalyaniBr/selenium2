package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeHomepage1 {
  @FindBy(xpath="//div[@class='app_logo']") private WebElement Logo;
  @FindBy (xpath="(//button[text()='Add to cart'])[1]")private WebElement AddToCart;
  @FindBy (xpath="//button[text()='Remove']")private WebElement Remove;
  @FindBy (xpath="//button[@id='react-burger-menu-btn']")private WebElement OpenMenu;
  
  public PracticeHomepage1(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  
  }
 public boolean  VerifyPracticeHomepage1Logo()
 {
	boolean result= Logo.isDisplayed();
	return result;
 }
 
 public void PracticeHomepage1AddToCart()
 {
	 AddToCart.click();
	 
 }
 public String PracticeHomepage1RemeoveBtn()
 {
	String actText= Remove.getText();
	return actText;

}

  
	public void PracticeHomepage1OpenMenu()
	{
		OpenMenu.click();
	}
	 
}
  

