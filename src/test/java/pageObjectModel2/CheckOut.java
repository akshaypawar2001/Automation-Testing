package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut extends BasePage {
	
	@FindBy(xpath="//a[contains(text(),'Proceed to Checkout')]")
	WebElement checkout;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continue1;
	
	@FindBy(xpath="//a[contains(text(),'Confirm')]")
	WebElement confirm;
	
	@FindBy(xpath="//a[contains(text(),'Return to Main Menu')]")
	WebElement mainmenu;
	
	public void checkOut() {
		checkout.click();
	}
	
	public void Continue() {
		continue1.click();
	}
	
	public void Confirm() {
		confirm.click();
	}
	
	public void mainMenu() {
		mainmenu.click();
	}


}
