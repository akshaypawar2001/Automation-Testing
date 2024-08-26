package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverutils {
	static WebDriver driver;
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		  driver= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		 //driver.get("https://shop.bombas.com/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	}
	public static WebDriver getDriver() {
		if(driver==null)
		createDriver();
		return driver;
	}

}
