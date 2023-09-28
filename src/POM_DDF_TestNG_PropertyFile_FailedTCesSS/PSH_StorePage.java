package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PSH_StorePage {

	@FindBy(xpath="//input[@type='text']")private WebElement EnterCity;
	
	@FindBy(xpath="//button[text()='Reset']")private WebElement Reset;
	@FindBy(xpath="//button[text()='Find stores ']")private WebElement FindStore;
	

	public PSH_StorePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void EnterCityName (String CityName)
	{
		EnterCity.sendKeys(CityName);
		
	}
	
	public void PSH_StorePageClickReset()
	{
		Reset.click();
	}
	public void clickFindStoreBtn()
	{
		FindStore.click();
	}
}
