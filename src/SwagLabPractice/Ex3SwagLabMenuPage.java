package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex3SwagLabMenuPage {

	@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement Logout;
	
	public Ex3SwagLabMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickSwagLabMenuPageLogoutBtn ()
	{
		Logout.click();
	}
	
	
}
