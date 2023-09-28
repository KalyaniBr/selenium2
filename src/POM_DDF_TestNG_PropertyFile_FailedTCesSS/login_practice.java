package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_practice {

	@FindBy(xpath="")private WebElement UN;
	
	@FindBy (xpath="")private WebElement PWD;
	
	@FindBy(xpath="")private WebElement loginbtn;
	
	public login_practice (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Username(String Usname) {
		UN.sendKeys(Usname);
	}
	
	public void Password(String Pass) {
		PWD.sendKeys(Pass);
	}
	
	public void clickloginbtn() {
		loginbtn.click();
	}
	
	
	
	
}
