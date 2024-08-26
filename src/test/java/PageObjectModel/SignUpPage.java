package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{
	
	@FindBy(xpath="//button[text()='Got It']")
	WebElement gotit;
	
	@FindBy(xpath="(//span[@data-name='close'])[2]")
	WebElement close;
	
	@FindBy(xpath="//button[text()='Log In']")
			WebElement login;
	@FindBy(xpath="(//button[contains(text(),'Sign Up')])[2]")
	WebElement signup;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	WebElement email;
	
	@FindBy(xpath="(//input[@autocomplete='name'])[1]")
	WebElement firstname;
	
	@FindBy(xpath="(//input[@autocomplete='name'])[2]")
	WebElement lastname;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submit;
	
	
	
	public void gotIt() {
		gotit.click();
	}
	public void closeButton() {
		close.click();
	}
	
	public void loginB() {
		login.click();
	}
	
	public void Signup() {
		signup.click();
	}
	
	
	public void Email(String str) {
		email.sendKeys(str);
	}
	
	public void firstName(String str) {
		firstname.sendKeys(str);
	}
	
	public void LastName(String str) {
		lastname.sendKeys(str);
	}
	
	public void verifyPassword(String str) {
		password.sendKeys(str);
	}
	
	public void verifySubmit() {
		submit.click();;
	}

}
