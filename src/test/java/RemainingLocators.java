import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RemainingLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 //Linktext
		//WebElement element= driver.findElement(By.linkText("Register"));
		//element.click();
		 
		 //partial link text
		//driver.findElement(By.partialLinkText("Compare p")).click();
		 
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Books");//css selector by id
		 
		driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Car Toys");//css selector by Class
		
		

	}

}
