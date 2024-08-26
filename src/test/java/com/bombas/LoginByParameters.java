package com.bombas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginByParameters {
	@Test
	@Parameters({"a","b","c"})
	public void search(String s1,String s2,String s3) throws InterruptedException {
		
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		driver.get("https://shop.bombas.com/");
		driver.findElement(By.xpath("//button[text()='Got It']")).click() ;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click() ;
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys(s1); 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(s2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@data-name='close'])[2]")).click() ;
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click() ;
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@data-name='close'])[2]")).click(); 
		
		Thread.sleep(3000);
		 driver.findElement(By.xpath("(//span[@size='22'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys(s3);
		 
	}
	

}
