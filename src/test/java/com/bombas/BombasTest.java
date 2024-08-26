package com.bombas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BombasTest {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\resources\\chromedriver.exe");
		
		 /*System.setProperty sets a system property for the Chrome driver. 
		  * It specifies the path to the chromedriver.exe executable,
		  *  which is needed to control the Chrome browser.*/
		 WebDriver driver= new ChromeDriver();//Upcasting
		 //which opens a new Chrome browser window.
		 driver.get("https://shop.bombas.com/");
		 BombasLoginPage blp=new BombasLoginPage(driver);
		 blp.gotIt();
		 blp.loginB();
		 Thread.sleep(2000);
		 blp.verifyEmail("akshay1234@gmail.com");
		 blp.verifyPassword("Akshay@123");
		 Thread.sleep(2000);
		 blp.closeButton();
		 blp.verifySubmit();
		 Thread.sleep(3000);
		 blp.closeButton2();}

}
