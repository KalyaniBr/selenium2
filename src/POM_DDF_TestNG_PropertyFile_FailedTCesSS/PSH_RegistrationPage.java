package POM_DDF_TestNG_PropertyFile_FailedTCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PSH_RegistrationPage {

	@FindBy(xpath="")private WebElement FN;
	@FindBy(xpath="")private WebElement LN;
	@FindBy(xpath="")private WebElement Email;
	@FindBy(xpath="")private WebElement MoNo;
	@FindBy(xpath="")private WebElement PWD;
	@FindBy(xpath="")private WebElement REPWD;
	@FindBy(xpath="")private WebElement CreateAcc;
	
	
	public PSH_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void PSH_RegistrationPageFN(String FNValue)
	{
		FN.sendKeys(FNValue);
	}
	
	public void PSH_RegistrationPageLN(String LNValue)
	{
		LN.sendKeys(LNValue);
	}
	public void PSH_RegistrationPageEmail(String EmailValue)
	{
		Email.sendKeys(EmailValue);
	}
	public void PSH_RegistrationPageREPWD(String REPWDValue)
	{
		REPWD.sendKeys(REPWDValue);
	}
	public void PSH_RegistrationPageCreateAcc()
	{
	  CreateAcc.click();
	}
	
	
}
