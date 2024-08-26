

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOut {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement drag= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		//act.moveToElement(element).perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]")).click();
		
		//for alert usage
		//act.doubleClick(drag).perform();
		//Alert a=driver.switchTo().alert();
		WebDriverWait wait= new WebDriverWait(driver, 5);
		/*try {
			wait.until(ExpectedConditions.alertIsPresent());
			System.out.println(a.getText());
			System.out.println("Alert loaded");	
		}
		catch(Exception e) {
			System.out.println("Alert not loaded");
		}*/
		
		
		WebElement element=driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			System.out.println(element.getText());
			System.out.println("element is clickable");	
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("element is not clickable");
		}
		
		
		
		WebElement options=driver.findElement(By.className("dropdown-toggle"));
		//Select select = new Select(options);
		//select.selectByVisibleText("Ajax Demo");
		
		WebElement option=options.findElement(By.xpath("//a[text()='Ajax Demo']"));
		try {
			wait.until(ExpectedConditions.elementToBeSelected(option));
			System.out.println(option.getText());
			System.out.println("element is selectable");	
		}
		catch(Exception e) {
			System.out.println("element is not Selectable");
			System.out.println();
			//System.out.println(e.getMessage());
		}
		
		//used where data comes dynamically
		
		By locator=By.xpath("//a[text()='Agile Project']");
		try {
			wait.until(ExpectedConditions.textToBe(locator, "Agile Project"));
			
			System.out.println("Element Contains given text");	
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Element does not Contains given text");
			
		}
		
		//Waits for an element's text to be exactly equal to a specified value.
		WebElement element2=driver.findElement(By.xpath("//a[text()='Agile Project']"));
		try {
			wait.until(ExpectedConditions.textToBePresentInElement(element2, "Agile"));
			System.out.println(element2.getText());
			System.out.println("Element Contains given partial text");
			System.out.println();
		}
		catch(Exception e) {
			System.out.println("Element does not Contains given text");
			
		}
		
		//TextToBePresentInElementLocated= Similar to textToBePresentInElement, but it uses a locator
		By locator2=By.xpath("//a[text()='Payment Gateway Project']");
	
			boolean result1=wait.until(ExpectedConditions.textToBePresentInElementLocated(locator2, "Gateway"));
		System.out.println(result1);
		System.out.println();
		
		
		//urlcontains = used to wait until the current URL of the web browser contains a specified substring.
		
		driver.findElement(By.xpath("//a[text()='Demo Site']")).click();
		boolean result2=wait.until(ExpectedConditions.urlContains("demo.guru99"));
		System.out.println(result2+" the url contains the given string");
		System.out.println();
		
	}

}