package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeLoginPage2 {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")private WebElement  Login;
	
	
	 public PracticeLoginPage2(WebDriver driver )
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	 public void PracticeLoginPage2username(String UNValue)
	 {
		 UN.sendKeys(UNValue);
	 }
	public void PracticeLoginPage2password(String PWDValue)
	{
		PWD.sendKeys(PWDValue);
	}
	public void PracticeLoginPageclickLoginBtn()
	{
		Login.click();
	}
	
	
	
	
}
