package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PSH_HomePage {

	@FindBy(xpath="//img[@class='ml-3 transition-header']")private WebElement Logo;
	@FindBy (xpath="//input[@type='search']")private WebElement search;
	@FindBy (xpath="//div[text()='Stores']")private WebElement Store;
	@FindBy (xpath="(//img[@height='30px'])[4]")private WebElement addtoWishlist;
	@FindBy(xpath="(//img[@width='30px'])[2]")private WebElement profile;
	
	public PSH_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyPSH_HomePageLogo()
	{
		boolean result=Logo.isDisplayed();
		return result;
	}
	public void PSH_HomePage_searchproduct(String Product) 
	{
		search.sendKeys(Product);
	}
	public void PSH_HomePageAddtowishlist() 
	{
		addtoWishlist.click();
	}
	public void clickPSH_HomePageProfile() 
	{
		profile.click();
	}
	public void clickPSH_HomePagestore()
	{
		Store.click();
	}
	
	
	
	
	
	
}
