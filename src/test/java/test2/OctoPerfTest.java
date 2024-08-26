package test2;

import org.testng.annotations.Test;

import generic2.Driverutils2;
import pageObjectModel2.AddToCartPage;
import pageObjectModel2.CheckOut;
import pageObjectModel2.LoginPage;

public class OctoPerfTest {
	@Test(priority = 1)
	public void logingIn() throws InterruptedException {
		LoginPage lp=new LoginPage();
				Driverutils2.getDriver().get("https://petstore.octoperf.com/actions/Catalog.action");
				lp.signIn();
				Thread.sleep(2000);
				lp.userName("Akshay_Pawar2001");
				lp.clearPassword();
				Thread.sleep(1000);
				lp.password("Akshay@123");
				Thread.sleep(2000);
				lp.logIn();
				Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void addToCart() throws InterruptedException {
		AddToCartPage add=new AddToCartPage();
		Thread.sleep(1000);
		add.selectAnimal();
		Thread.sleep(1000);
		add.selectProductId();
		Thread.sleep(1000);
		add.selectAnimalBreed();
		Thread.sleep(1000);
		add.addToCart();
	}
	
	@Test(priority = 3)
	public void CheckOutOcto() throws InterruptedException {
		CheckOut co=new CheckOut();
		Thread.sleep(2000);
		co.checkOut();
		Thread.sleep(2000);
		co.Continue();
		Thread.sleep(2000);
		co.Confirm();
		Thread.sleep(2000);
		co.mainMenu();
	}

}
