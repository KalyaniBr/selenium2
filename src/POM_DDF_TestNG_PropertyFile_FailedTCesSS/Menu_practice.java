package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu_practice {

@FindBy(xpath="")private WebElement Logout;
	
	public Menu_practice(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickLogout() {
		Logout.click();
	}
	
	
	
	
}
