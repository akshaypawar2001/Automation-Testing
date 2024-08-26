import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoAddToCartPage {
@FindBy(xpath="(//input[@value='Add to cart'])[2]")
WebElement addtocart;

@FindBy(xpath="(//input[@value='Add to cart'])[1]")
WebElement finalAdd;

@FindBy(xpath="//input[@value='18']")
WebElement hdd;


public DemoAddToCartPage(WebDriver driver) {
	PageFactory.initElements(driver, this);;
}
public void verifyAddToCart() {
	addtocart.click();
}

public void verifyFinalAddToCart() {
	finalAdd.click();
}

public void verifyHDD() {
	hdd.click();
}

}
