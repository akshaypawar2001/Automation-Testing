import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver1= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		 driver1.get("file:///C:/Users/Aayush%20Pawar/Downloads/disable.html");
		JavascriptExecutor j1=(JavascriptExecutor)driver1;
		 String stmt="document.getElementById('n').value='Akshay'";
		 j1.executeScript(stmt);
		 Thread.sleep(2000);
		 String stmt1=	"document.getElementById('n').value=''";

			j1.executeScript(stmt1);

			//String stmt2="document.getElementById('g').click()";
		 //j1.executeScript(stmt2);
		 
		 
		 Thread.sleep(5000);
		 
		 
		 //for Scrollup and scrolldown
		 WebDriver driver2= new ChromeDriver();//Upcasting
		 driver2.get("https://www.selenium.dev/downloads/");
		 JavascriptExecutor j2=(JavascriptExecutor)(driver2);
		 //driver.manage().window().maximize();
		 Thread.sleep(2000);
		 String Scrolldown="window.scrollBy(0,1000)";
		 j2.executeScript(Scrolldown);
		 Thread.sleep(1000);
		 String Scrollup="window.scrollBy(0,-1000)";
		 j2.executeScript(Scrollup);
		 }

}
