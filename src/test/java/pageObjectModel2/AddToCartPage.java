package pageObjectModel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage{
	@FindBy(xpath="(//img[contains(text(),'')])[19]")
	WebElement selectanimal;
	
	@FindBy(xpath="(//a[text()])[5]")
	WebElement selectproductid;
	
	@FindBy(xpath="(//a[text()])[5]")
	WebElement selectanimalbreed;
	
	@FindBy(xpath="//a[contains(text(),'Add to Cart')]")
	WebElement addtocart;
	
	
	public void selectAnimal() {
		selectanimal.click();
	}
	
	public void selectProductId() {
		selectproductid.click();
	}
	
	public void selectAnimalBreed() {
		selectanimalbreed.click();
	}
	
	public void addToCart() {
		addtocart.click();
	}
	
}
