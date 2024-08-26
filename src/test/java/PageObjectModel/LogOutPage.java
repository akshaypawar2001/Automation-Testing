package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage {
	@FindBy(xpath="//span[@data-name='account']")
	WebElement account;
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement setting;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement logout;
	
	public void Account() {
		account.click();
	}
	public void Setting() {
		setting.click();
	}
	public void Logout() {
		logout.click();
	}
	 

}
