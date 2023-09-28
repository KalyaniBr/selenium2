package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PSH_ProfilePage {

 @FindBy(xpath="//html[@lang='en']")private WebElement Login_register;
	
 public PSH_ProfilePage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
public void ProfilrRegister()
{
	Login_register.click();
}
 
}
