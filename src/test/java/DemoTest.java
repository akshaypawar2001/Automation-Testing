import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://demowebshop.tricentis.com/login");
		 
		 DemoLoginPage dlp=new DemoLoginPage(driver);
		 dlp.verifyEmail("Akshay321@gmail.com");
		 dlp.verifyPassword("Akshay@123");
		 dlp.verifyLogin();
		 Thread.sleep(2000);
		 DemoSearchPage dsp=new DemoSearchPage(driver);
		 dsp.verifySearch("Computer");
		 dsp.verifySubmission();
		 Thread.sleep(2000);
		 DemoAddToCartPage dap=new DemoAddToCartPage(driver);
		 Thread.sleep(1000); 
		 dap.verifyAddToCart();
		 Thread.sleep(2000);
		 dap.verifyHDD();
		 Thread.sleep(2000);
		 dap.verifyFinalAddToCart();
		 Thread.sleep(2000);
		 JavascriptExecutor j2=(JavascriptExecutor)(driver);
		 String Scrollup="window.scrollBy(0,-1000)";
		 j2.executeScript(Scrollup);
		 
		 DemoLogoutPage dl=new DemoLogoutPage(driver);
		 dl.verifyLogout();
         
	}

}
