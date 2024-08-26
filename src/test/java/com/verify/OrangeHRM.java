package com.verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHRM {


		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		 @Test
		 @Parameters({"a","b"})
		 public void login(String c,String d) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
				
			 /*System.setProperty sets a system property for the Chrome driver. 
			  * It specifies the path to the chromedriver.exe executable,
			  *  which is needed to control the Chrome browser.*/
			 WebDriver driver= new ChromeDriver();//downcasting
			 //which opens a new Chrome browser window.
			// WebDriver driver2= new ChromeDriver();
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(c);
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(d);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 
		 
		 }
		 
	
	
	
	}