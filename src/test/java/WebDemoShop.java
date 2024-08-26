import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDemoShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 //which opens a new Chrome browser window.
		// WebDriver driver2= new ChromeDriver();
		 driver.get("https://demowebshop.tricentis.com/login");
		
			Thread.sleep(3000);
		
		 
		 //driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
			
			
		// driver.findElement(By.name("FirstName")).sendKeys("Akshay");
		 //driver.findElement(By.name("LastName")).sendKeys("Pawar");
		 //driver.findElement(By.name("Email")).sendKeys("Akshaypawar6349@gmail.com");
		 //driver.findElement(By.name("Password")).sendKeys("Akshay@123");
		 //driver.findElement(By.name("ConfirmPassword")).sendKeys("Akshay@123");
		 //driver.findElement(By.name("register-button")).click();
		 
		 //Xpath By attribute
		/* driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Akshay");
		 driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Pawar");
		 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Akshay321@gmail.com");
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Akshay@123");
		 driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Akshay@123");
		 driver.findElement(By.xpath("//input[@id='register-button']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Continue']")).click();*/
		 //driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 
		 
		 //Xpath by contains
		 //driver.findElement(By.xpath("a[contains(test(),'Electronics']"));
		 driver.findElement(By.xpath("//input[@class='email']")).sendKeys("Akshay321@gmail.com");
		 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Akshay@123");
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[@href='/computing-and-internet'])[4]")).click();
		 
		 driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		 driver.findElement(By.xpath("//a[text()='Add your review']")).click();
		 driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("just bougth computing and internet");
		 driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("Looking forward to learn new"
		 		+ " and amazing topics from it and implement in real life");
		 driver.findElement(By.xpath("(//input [@type='submit'])[2]")).click();
	}

}
