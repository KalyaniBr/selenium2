package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeMenupage1 {
 @FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement Logout;
 
 public PracticeMenupage1(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void PracticeMenupage1LogoutBtn()
 {
	 Logout.click();
 }
 
 
}
