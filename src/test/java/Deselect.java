import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 driver.get("file:///C:/Users/Aayush%20Pawar/Downloads/code.html");
		 
		 
			/*WebElement element1 = driver.findElement(By.xpath("//select[@id='slv']"));
			Select sel=new Select(element1);
			sel.selectByIndex(3);
			Thread.sleep(5000);
			sel.deselectAll();*/

	}

}
