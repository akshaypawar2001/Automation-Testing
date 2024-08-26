package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrameworkLoginpage extends BasePage{
	
	@FindBy(xpath="//button[text()='Got It']")
	WebElement gotit;
	
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement login;
	
	@FindBy(xpath="(//input[@type='email'])[2]")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="(//span[@data-name='close'])[2]")
	WebElement close;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submit;
	
	@FindBy(xpath="(//span[@data-name='close'])[2]")
	WebElement close2;
	
	
	public void gotIt() {
		gotit.click();
	}
	
	
	public void loginB() {
		login.click();
	}
	
	public void verifyEmail(String str) {
		email.sendKeys(str);;
	}
	
	public void verifyPassword(String str) {
		password.sendKeys(str);;
	}
	
	public void closeButton() {
		close.click();
	}

	public void verifySubmit() {
		submit.click();
	}
	
	public void closeButton2() {
		close.click();
	}

}
