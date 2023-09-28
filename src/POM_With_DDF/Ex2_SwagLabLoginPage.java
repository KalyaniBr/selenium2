package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex2_SwagLabLoginPage {

	//step 1 Declaration
	
		@FindBy(xpath="//input[@id='user-name']")private WebElement UN;  
		//private WebElement UN=driver.findElement(By.xpath("");
		
		@FindBy(xpath="//input[@type='password']")private WebElement PWD;
		//private WebElement PWD=driver.findElement(By.xpath("");

		@FindBy(xpath="//input[@id='login-button']")private WebElement login;
		//private WebElement  Login=driver.findElement(By.xpath("");

		//step 2 intialization
	 public Ex2_SwagLabLoginPage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this); 
		//className.methodName(webDriverObject,thisKeyword); 
		 
	 }
		//step3:usage
		//Enter UN
	public	void inputSwagLabLoginPageusername(String UNValue)
	{
		UN.sendKeys( UNValue);
	}
	public void inputSwagLabLoginPagepassword(String PWDValue)
	{
		PWD.sendKeys(PWDValue);
	}

	public void clickSwagLabLoginPageLoginBtn()
	{
		login.click();
	}
		
}
