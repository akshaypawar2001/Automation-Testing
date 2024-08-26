import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(4000);
LoginPage lp=new LoginPage(driver);
lp.verifyUsername("Admin");
lp.verifyPassword("admin123");
lp.verifyClick();

	}

}
