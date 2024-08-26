package pageObjectModel1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FillDetails extends BasePage {
	@FindBy(id="inputName")
	WebElement name;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="city")
	WebElement city;
	
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="zipCode")
	WebElement zipcode;
	
	@FindBy(id="cardType")
	WebElement cardtype;
	
	
	@FindBy(id="creditCardNumber")
	WebElement creditcardnumber;
	
	@FindBy(id="creditCardMonth")
	WebElement creditcardmonth;
	
	@FindBy(id="creditCardYear")
	WebElement creditcardyear;
	
	@FindBy(id="nameOnCard")
	WebElement nameOncard;
	
	@FindBy(xpath="//input[@value='Purchase Flight']")
	WebElement purchase;
	
	
	public void name(String s) {
		name.sendKeys(s);
	}
	
	public void address(String s) {
		address.sendKeys(s);
	}
	
	public void city(String s) {
		city.sendKeys(s);
	}
	
	public void state(String s) {
		state.sendKeys(s);
	}
	
	public void zipCode(String s) {
		zipcode.sendKeys(s);
	}
	
	public void cardType(String s) {
	Select sel=new Select(cardtype);
	sel.selectByVisibleText(s);
		
	}
	
	public void creditCardNumber(String s) {
		creditcardnumber.sendKeys(s);
	}
	
	public void creditCardMonth(String s) {
		creditcardmonth.sendKeys(s);
	}
	
	public void creditCardYear(String s) {
		creditcardyear.sendKeys(s);
	}
	
	public void nameOnCard(String s) {
		nameOncard.sendKeys(s);
	}
	public void purchaseFlight() {
		purchase.click();
	}

}
