package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Driverutils;
import PageObjectModel.AddToCartPage;
import PageObjectModel.FrameworkLoginpage;
import PageObjectModel.LogOutPage;
import PageObjectModel.Searchpage;
import PageObjectModel.SignUpPage;

public  class TestNGFrameworkTest {
	
	
	
	@Test(enabled = false,  priority = 1)
	public void signUp() throws InterruptedException {
		SignUpPage sp=new SignUpPage();
		Driverutils.getDriver().get("https://shop.bombas.com/");
		sp.gotIt();
		 Thread.sleep(2000);
		 sp.closeButton();
		 Thread.sleep(2000);
		sp.loginB();
		sp.Signup();
		 Thread.sleep(2000);
		sp.Email("Akshay987@gmail.com");
		sp.firstName("Akshay");
		sp.LastName("pawar");
		sp.verifyPassword("Akshay@123");
		 Thread.sleep(2000);
		sp.verifySubmit();
	}
	
	@Test(priority = 1)
	public void verifyLogin() throws InterruptedException {
		Driverutils.getDriver().get("https://shop.bombas.com/");
		Thread.sleep(2000);
		FrameworkLoginpage lp=new FrameworkLoginpage();
		 lp.gotIt();
		 lp.loginB();
		 Thread.sleep(2000);
		 lp.closeButton();
		 Thread.sleep(2000);
		 lp.verifyEmail("akshay1234@gmail.com");
		 lp.verifyPassword("Akshay@123");
		 Thread.sleep(2000);
		 lp.verifySubmit();
		 Thread.sleep(4000);
		lp.closeButton2();
		
		
	}
	
	/*@Test(alwaysRun = true, priority = 2)
	 public void searching() throws InterruptedException {
	 Searchpage sp=new Searchpage();
	// sp.closePopup();
	Thread.sleep(3000);
	 sp.searchIcon();
	 Thread.sleep(2000);
	 sp.searchValue("Socks");
	}*/ 
	 
	

	@DataProvider
	public Object[][] getData(){
		Object [][] data=new Object[1][1];
		data[0][0]="socks";
		return data;
	}

	@Test(dataProvider ="getData",alwaysRun = true,priority = 2)
	public void search(String s) throws InterruptedException {
		Searchpage sp=new Searchpage();
		//sp.value.sendKeys(s);
		Thread.sleep(3000);
		 sp.searchIcon();
		 Thread.sleep(2000);
		 sp.searchValue(s);
	}
	
	
	
	@Test(dependsOnMethods = {"search"}, priority = 3)
		 public void addtoCart() throws InterruptedException {
		 AddToCartPage ac=new AddToCartPage();
		 Thread.sleep(6000);
		 ac.selectProduct();
		 Thread.sleep(2000);
		 ac.addToCart();
		 Thread.sleep(2000);
		 ac.closePopup();
		 }
		 
	
	@Test(dependsOnMethods = {"verifyLogin"}, priority = 4)
		 public void LogOut() throws InterruptedException {
		 LogOutPage lg=new LogOutPage();
		 Thread.sleep(3000);
		 lg.Account();
		 Thread.sleep(2000);
		 lg.Setting();
		 Thread.sleep(2000);
		 lg.Logout();
		 
		
		}
	
	
	
	
	
}
	
	
	


