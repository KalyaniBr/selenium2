package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//page3
public class SwagLabMenuPage {

	//step1 declaration
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logout;
	
	//step2 Intialization
	
	public SwagLabMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//step3 usege
	public void clickonmenu()
	{
		logout.click();
	}
	
	
	
	
}
