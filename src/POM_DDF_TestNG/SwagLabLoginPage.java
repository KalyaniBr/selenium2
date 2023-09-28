package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	 //step1 Declaration
		@FindBy(xpath="//input[@id='user-name']")private WebElement UN;
		
		@FindBy(xpath="//input[@type='password']")private WebElement PWD;
		
		@FindBy(xpath="//input[@id='login-button']")private WebElement Login;
		
		//step2 Initialization
		public  SwagLabLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);  //classname.methodname(webDriverObj,thiskeyword)
		}
		
		//step3 usage
		
		public void inputSwagLabLoginPageusername(String UNValue)
		{
			UN.sendKeys(UNValue);
		}
		public void inputSwagLabLoginPagepassword(String PWDValue)
		{
			PWD.sendKeys(PWDValue);
		}
		public void clickSwagLabLoginPageLoginBtn()
		{
			Login.click();
		}
		
		
	
	
	
	
}
