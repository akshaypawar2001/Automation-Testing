import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//Upcasting
		
		 driver.get("https://www.google.com/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.name("q")).sendKeys("Q Spiders");
		 List <WebElement> list=driver.findElements(By.xpath("//span[contains(text(),'QSpiders')]"));
		 System.out.println(list.size());
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i).getText());
		 }
		 Thread.sleep(2000);
			
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.name("q")).sendKeys("compute");
        Thread.sleep(2000);
        List<WebElement> list1=driver.findElements(By.xpath("//a[contains(text(),'compute')]"));
        System.out.println(list1.size());
        for(int i=0;i<list.size();i++) {
        	System.out.println(list1.get(i).getText());
        }
        

	}

}
