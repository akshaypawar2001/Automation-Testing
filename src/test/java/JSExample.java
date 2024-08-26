import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://www.javatpoint.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		
	
		
			WebElement element=driver.findElement(By.xpath("//a[contains(text(),'24th Jul - HTML Navigation')]"));
			/*if(element.isDisplayed()) {
				System.out.println("element found");
				break;}*/
			//String Scrolldown="window.scrollBy(0,100)";
			//j.executeScript(Scrolldown);
		j.executeScript("arguments[0].scrollIntoView(true)",element);
		Thread.sleep(1000);
			
	
	/*driver.get("https://demowebshop.tricentis.com/books");
      WebElement subscribeElement = driver.findElement(By.id("newsletter-subscribe-button"));
      JavascriptExecutor j = (JavascriptExecutor)driver;
      driver.manage().window().maximize();
      Thread.sleep(2000);
      j.executeScript("arguments[0].scrollIntoView(true);", subscribeElement);
      Thread.sleep(2000);  */
		 
		
		
		
		

	}

}
