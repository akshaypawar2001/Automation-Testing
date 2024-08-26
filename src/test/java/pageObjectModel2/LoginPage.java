package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	@FindBy(xpath="//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(name="password")
	WebElement clearpassword;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='signon']")
	WebElement login;
	
	public void signIn() {
		signin.click();
	}
	
	public void userName(String s) {
		username.sendKeys(s);
	}
	
	public void clearPassword() {
		clearpassword.clear();
	}
	
	public void password( String s) {
		password.sendKeys(s);
	}
	
	public void logIn() {
		login.click();
	}
	
	
	
}
