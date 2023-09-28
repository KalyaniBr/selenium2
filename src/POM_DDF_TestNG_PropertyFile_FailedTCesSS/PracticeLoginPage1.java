package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeLoginPage1 {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")private WebElement Login;
	
	public PracticeLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void PracticeLoginPage1username(String UNValue)
	{
		UN.sendKeys(UNValue);
	}
	public void PracticeLoginPage1password(String PWDValue)
	{
		PWD.sendKeys(PWDValue);
	}
	public void PracticeLoginPage1loginbtn()
	{
		Login.click();
	}
}
