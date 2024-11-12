package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	Declaration
	@FindBy(name="email")
	private WebElement emailTf;
	
	@FindBy(id="password")
	private WebElement passwordTF;
	
	@FindBy(css="[type='checkbox']")
	private WebElement keepMeLoggedInCheckBox;
	
	@FindBy(xpath="//a[text()='Forgot your password?']")
	private WebElement forgotPWDlink;
	
	@FindBy(className = "login_Btn")
	private WebElement loginBTN;
	
//	Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//Utilization
	public void setEmail(String email) {
		emailTf.sendKeys(email);
	}
	
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	
	public void loginCheckbox() {
		keepMeLoggedInCheckBox.click();
	}
	
	public void logibBtn() {
		loginBTN.click();	
	}
	
	public void forgotPassword() {
		forgotPWDlink.click();
	}
}
