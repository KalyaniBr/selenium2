package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Webdriver.WebElement;
import graphql.PublicApi;

public class practice1 {
	
	@FindBy(xpath="")private WebElement UN;
	
	@FindBy(xpath="")private WebElement PWD;
	
	@FindBy(xpath="")private WebElement Login;
	
	public practice1(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username()
	{
		UN.sendKeys("");
	}
	public void pass()
	{
		PWD.sendKeys("");
	}
	
	public void login()
	{
		Login.click();
	}
	
	
	

	
	
}


