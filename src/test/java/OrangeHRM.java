import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 //which opens a new Chrome browser window.
		// WebDriver driver2= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			Thread.sleep(5000);
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		 //Xpath By Text
		 //driver.findElement(By.xpath("//span[text()='Admin']")).click();
		 //driver.findElement(By.xpath("//span[text()='PIM']")).click();
		 //driver.findElement(By.xpath("//span[text()='Leave']")).click();	
		 //driver.findElement(By.xpath("//span[text()='Time']")).click();
		 driver.findElement(By.xpath("//span[text()='Directory']")).click();
		 
		 /*driver.navigate().to("https://www.google.com/");
		 driver.navigate().back();
		// driver.navigate().forward();
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 //driver.close();
		 //driver.quit();
		 System.out.println(driver.getPageSource());*/

	}

}
