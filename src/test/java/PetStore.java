import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PetStore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 //which opens a new Chrome browser window.
		// WebDriver driver2= new ChromeDriver();
		 driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
			Thread.sleep(2000);
			/*
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Akshay_Pawar2001");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Akshay@123");
			driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("Akshay@123");
			//input[@name='account.firstName']
			driver.findElement(By.xpath("//input[@name='account.firstName']")).sendKeys("Akshay");
			driver.findElement(By.xpath("//input[@name='account.lastName']")).sendKeys("pawar");
			driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("Akshay3223@gmail.com");
			driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys("8457833374");
			driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys("dshga kjasdhs jda");
			driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys("bhopal");
			driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("Madhya Pradesh");
			driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("460221");
			driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
			driver.findElement(By.xpath("//input[@name='account.listOption']")).click();
			driver.findElement(By.xpath("//input[@name='account.bannerOption']")).click();
			driver.findElement(By.xpath("//input[@name='newAccount']")).click();
			*/
			
			
			driver.findElement(By.xpath("//a[text()='Sign In']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Akshay_Pawar2001");
			Thread.sleep(1000);
			driver.findElement(By.name("password")).clear();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Akshay@123");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@name='signon']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//img[contains(text(),'')])[19]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[text()])[5]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//a[text()])[5]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//a[contains(text(),'Add to Cart')]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//a[contains(text(),'Confirm')]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//a[contains(text(),'Return to Main Menu')]")).click();
			}

}
