import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLogoutPage {
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement logout;
	
	public DemoLogoutPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void verifyLogout() {
		logout.click();
	}

}
