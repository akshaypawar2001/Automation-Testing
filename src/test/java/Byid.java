import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Byid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://demowebshop.tricentis.com/books");
			WebElement element=	driver.findElement(By.id("products-orderby"));
			Select sel=new Select(element);
			Thread.sleep(3000);
			//sel.selectByIndex(3);
			//sel.selectByVisibleText("Created On");
      //sel.selectByValue("https://demowebshop.tricentis.com/books?orderby=5");
			
			
		
		List<WebElement> li=sel.getOptions();
			int count=li.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
			System.out.println( li.get(i).getText());
			}		

	}

}
