

import java.io.IOException;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert1 {

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
		Actions act=new Actions(driver);
		//act.moveToElement(element).perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]")).click();
		
		//for alert usage
		act.doubleClick(drag).perform();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
		

	}

}
