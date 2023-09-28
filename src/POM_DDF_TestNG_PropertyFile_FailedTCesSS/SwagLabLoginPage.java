package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")private WebElement login;
	
	public  SwagLabLoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
	public void inpSwagLabLoginUN(String UNValue)
	{
		UN.sendKeys(UNValue);
	}
	public void inputSwagLabLoginPWD(String PWDValue)
	{
		PWD.sendKeys(PWDValue);
	}
	public void clickSwagLabLoginBTn()
	{
		login.click();
	}
	
	
}
