import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSearchPage {
	@FindBy(xpath="(//input[@value='Search store'])")
	WebElement txtsearch;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement txtsubmit;
	
	public DemoSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//return object
	}
	
	public void verifySearch(String str) {
		txtsearch.sendKeys(str);
	}
	public void verifySubmission() {
		txtsubmit.click();
	}

}
