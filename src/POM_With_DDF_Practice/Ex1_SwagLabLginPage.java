package POM_With_DDF_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1_SwagLabLginPage {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	
	@FindBy(xpath="//input[@id='login-button']")private WebElement Login;
	
	public Ex1_SwagLabLginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpEx1_SwagLabLginPageUN(String UNValue)
	{
		UN.sendKeys(UNValue);
	}
	public void inpEx1_SwagLabLginPagePWD(String PWDValue)
	{
		PWD.sendKeys(PWDValue);
	}
	public void clickEx1_SwagLabLginPageLoginBtn()
	{
		Login.click();
	}
}
