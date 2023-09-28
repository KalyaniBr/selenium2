package SwagLabPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex5SwagLabMenuPage {

	@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logout;
	
	public Ex5SwagLabMenuPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickSwagLabMenuPageLogoutBtn()
	{
		logout.click();
	}
	
	
}
