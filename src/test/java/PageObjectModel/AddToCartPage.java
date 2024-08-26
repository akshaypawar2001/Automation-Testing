package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {
	@FindBy(xpath="(//img[@alt=\"Women's Solids Ankle Sock 4-Pack\"])[2]")
WebElement selectproduct;
	
	@FindBy(xpath="//button[text()='Add to Bag']")
	WebElement addtocart;
	
	@FindBy(xpath="//span[@data-name='close']")
	WebElement closepopup;
	
	public void selectProduct() {
		selectproduct.click();
	}
	
	public void addToCart() {
		addtocart.click();
	}
	
	public void closePopup() {
		closepopup.click();
	}
	
	
	
	

}
