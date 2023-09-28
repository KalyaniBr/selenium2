package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex5SwagLabLoginpage {

	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
	
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	
	@FindBy(xpath="//input[@id='login-button']")private WebElement login;
	
	
	public Ex5SwagLabLoginpage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inputSwagLabLoginPageusername()
	{
		UN.sendKeys("standard_user");
	}
	public void inputSwagLabLoginPagepassword()
	{
		PWD.sendKeys("secret_sauce");
	}
	public void clickSwagLabLoginPageLoginBtn()
	{
		login.click();
	}
	
}
