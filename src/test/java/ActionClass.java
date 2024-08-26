import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://demowebshop.tricentis.com/books");
		WebElement element= driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		Actions act=new Actions(driver);
		//act.moveToElement(element).perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]")).click();
		act.contextClick(element).perform();

	}

}
