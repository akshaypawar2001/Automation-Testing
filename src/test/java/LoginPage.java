import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		// TODO Auto-generated method stub
       /*Page Object model another name is POM class.
	Each and every webpage will have one page object model.Example:Loginpage,searchpage,Add to cart page,Logout page.
	Page object model works as object repository
	we create constructor as object repository in page object model
	PAGEFACTORY CLASS TO CREATE A OBJECT(WebElements).
	every class of page object model end with PAGE	
	here the class contains the locators and methods
	from the test class we call these methods
        */
	
       @FindBy(name="username")
   	WebElement txtUsername;
    
   	@FindBy(name="password")
   	WebElement txtPassword;
    
   	@FindBy(xpath="//button[@type='submit']")
   	WebElement button;
   	public LoginPage(WebDriver driver)
   	{
   		PageFactory.initElements(driver, this);//return object
   	}
   
	public void verifyUsername(String str)
   	{
   		txtUsername.sendKeys(str);
   	}
   	public void verifyPassword(String str)
   	{
   		txtPassword.sendKeys(str);
   	}
   	public void verifyClick()
   	{
   		button.click();
   	}


}
