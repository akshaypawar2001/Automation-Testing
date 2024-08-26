package com.verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangehrmLogin {
	@DataProvider
	public Object[][] getData(){
		Object [][] data=new Object[1][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		return data;
	}
	@Test(dataProvider = "getData")
	public void login(String s1,String s2) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
			
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//downcasting
		 //which opens a new Chrome browser window.
		// WebDriver driver2= new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys( s1);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s2);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Reporter.log("username "+s1+" password "+ s2, true);
	}
}
