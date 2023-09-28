package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex2_SwagLabMenuPage {
	//step1 declaration
	
		@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement logout;
		
		//step2 Intialization
		
		public Ex2_SwagLabMenuPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		//step3 usege
		public void clickEx2_SwagLabMenuPageLogoutBtn()
		{
			logout.click();
		}

	
	
	
	
	
	
	
	
	
	
	
	
}
