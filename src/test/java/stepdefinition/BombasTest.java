package stepdefinition;

import Generic.Driverutils;
import PageObjectModel.AddToCartPage;
import PageObjectModel.FrameworkLoginpage;
import PageObjectModel.LogOutPage;
import PageObjectModel.Searchpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BombasTest {
	FrameworkLoginpage fp=new FrameworkLoginpage();
	Searchpage sp=new Searchpage();
	 AddToCartPage ac=new AddToCartPage();
	 LogOutPage lg=new LogOutPage();

@Given("enter url")
public void enter_url() throws InterruptedException {
	Driverutils.getDriver().get("https://shop.bombas.com/");
	Thread.sleep(2000);
	fp.gotIt();
	 fp.loginB();
	 Thread.sleep(2000);
	 fp.closeButton();
	 Thread.sleep(2000);
}

@When("enter valid mail {string} and Password {string} and login")
public void enter_valid_mail_and_password_and_login(String string, String string2) throws InterruptedException{
	fp.verifyEmail("akshay1234@gmail.com");
	 fp.verifyPassword("Akshay@123");
	 Thread.sleep(2000);
	 fp.verifySubmit();
	 Thread.sleep(4000);
	fp.closeButton2();
}

@Then("Search required item {string}, select and Add to cart")
public void search_required_item_select_and_add_to_cart(String string)throws InterruptedException {
	 Thread.sleep(3000);
		 sp.searchIcon();
		 Thread.sleep(2000);
		 sp.searchValue("Socks");
		
		 Thread.sleep(6000);
		 ac.selectProduct();
		 Thread.sleep(2000);
		 ac.addToCart();
		 Thread.sleep(2000);
		 ac.closePopup();
}

@Then("Logout")
public void logout() throws InterruptedException{
	 
	 Thread.sleep(4000);
	 lg.Account();
	 Thread.sleep(2000);
	 lg.Setting();
	 Thread.sleep(2000);
	 lg.Logout();
}


}
