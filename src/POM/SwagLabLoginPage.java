package POM;

//POM Class1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	
	//step 1 Declaration
	
	@FindBy(xpath="//input[@id='user-name']")private WebElement UN;  
	//private WebElement UN=driver.findElement(By.xpath("");
	
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	//private WebElement PWD=driver.findElement(By.xpath("");

	@FindBy(xpath="//input[@id='login-button']")private WebElement login;
	//private WebElement  Login=driver.findElement(By.xpath("");

	//step 2 intialization
 public SwagLabLoginPage(WebDriver driver)
 {
	PageFactory.initElements(driver, this); 
	//className.methodName(webDriverObject,thisKeyword); 
	 
 }
	//step3:usage
	//Enter UN
public	void enterUN()
{
	UN.sendKeys("standard_user");
}
public void enterPWD()
{
	PWD.sendKeys("secret_sauce");
}

public void clickOnLoginbtn()
{
	login.click();
}

	
}
	
	
	


