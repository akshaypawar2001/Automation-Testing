import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {

	@FindBy(xpath="//input[@class='email']")
	WebElement txtmail;
	
	@FindBy(xpath="//input[@class='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement txtlogin;
	
	public DemoLoginPage(WebDriver driver)
   	{
   		PageFactory.initElements(driver, this);//return object
   	}
	
	public void verifyEmail(String str) {
		txtmail.sendKeys(str);
	}
   
	public void verifyPassword(String str) {
		txtpassword.sendKeys("Akshay@123");
	}
	
	public void verifyLogin(){
		txtlogin.click();
	}
	
	
	
	
}
