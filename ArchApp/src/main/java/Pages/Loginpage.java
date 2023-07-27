package Pages;  

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
 
	WebDriver driver;
	
	/*** PageConstructor ***/

	public Loginpage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*** WebElements ***/
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='loginform-password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement chechbox;
	
	@FindBy(partialLinkText="reset")
	WebElement restit;
	
	@FindBy(xpath="(//*[contains(text (),'Username cannot be blank.')])[1]")
	WebElement blankusernm;
	
	@FindBy(xpath="(//*[contains(text (),'Password cannot be blank.')])[1]")
	WebElement blankpwd;
	
	@FindBy(xpath="//*[contains(text (),'Incorrect username or password.')]")
	WebElement wrnguserpwdcred;
	
	
	/*** UserActionMethods ***/
	
	public void enterUsername(String uname) 
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String pswd) 
	{
		password.sendKeys(pswd);
	}
	public void clicklogin() 
	{
		login.click();
	}
	public String getwrongpwdcred()
	{
		return wrnguserpwdcred.getText();
		
	}
	public String getwrongidcred()
	{
		return wrnguserpwdcred.getText();
		
	}
	public String getblankpwdcred()
	{
		return blankpwd.getText();
		
	}
	public String getblankusernmcred()
	{
		return blankusernm.getText();
		
	}
	
	public String getblankuserpwdcred()
	{
		return blankusernm.getText();
		
	}
	public String getincrtusernmpswdcred()
	{
		return blankusernm.getText();
		
	}
	public void login2Care (String uname, String pswd) 
	{
		this.enterUsername(uname);
		this.enterPassword(pswd);
		this.clicklogin();
		
	}
	
}
