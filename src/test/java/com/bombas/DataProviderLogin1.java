package com.bombas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin1 {
     
	@DataProvider
	public Object[][] getData(){
		Object [][] data=new Object[1][3];
		data[0][0]="Akshay1234@gmail.com";
		data[0][1]="Akshay@123";
		data[0][2]="socks";
		
		return data;
	}
	@Test(dataProvider="getData")
	public void Search(String x,String y,String z) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
	
	 /*System.setProperty sets a system property for the Chrome driver. 
	  * It specifies the path to the chromedriver.exe executable,
	  *  which is needed to control the Chrome browser.*/
	 WebDriver driver= new ChromeDriver();//Upcasting
	 //which opens a new Chrome browser window.
	driver.get("https://shop.bombas.com/");
	driver.findElement(By.xpath("//button[text()='Got It']")).click() ;
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Log In']")).click() ;
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[@data-name='close'])[2]")).click() ;
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys(x); 
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(y);

	
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click() ;
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@data-name='close'])[2]")).click(); 
	
	Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[@size='22'])[2]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='search']")).sendKeys(z);
	 Thread.sleep(3000);
	
	 driver.findElement(By.xpath("(//img[@alt=\"Women's Solids Ankle Sock 4-Pack\"])[2]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[text()='Add to Bag']")).click();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//span[@data-name='close']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//span[@data-name='account']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[contains(text(),'Settings')]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	}

}
