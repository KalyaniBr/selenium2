package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex2login {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	
	@FindBy(xpath="//input[@id='login-button']")private WebElement login;
	
	
	public Ex2login(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username()
	{
		UN.sendKeys("standard_user");
	}
	public void pass()
	{
		PWD.sendKeys("secret_sauce");
	}
	public void clicklogin()
	{
		login.click();
		
	}
	
}
