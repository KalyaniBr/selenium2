package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1_SwagLabMenuPage {
	
@FindBy(xpath="//a[@id='logout_sidebar_link']")private WebElement Logout;

   public Ex1_SwagLabMenuPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }

public void clickEx1_SwagLabMenuPageLogoutBtn()
{
	Logout.click();
}











}
