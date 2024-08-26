package stepdefinition1;

import Generic.Driverutils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel1.DepDesPage;
import pageObjectModel1.FillDetails;
import pageObjectModel1.FlightBookingPage;

public class BlazeDemoTest {
	
DepDesPage dp=new DepDesPage();
FlightBookingPage fp=new FlightBookingPage();
FillDetails fd=new FillDetails();

@Given("Enter url")
public void enter_url() throws InterruptedException {
	Driverutils.getDriver().get("https://blazedemo.com/");
	Thread.sleep(2000);
}



@When("valid departure place {string}  and Destination  {string} And select flight accordingly")
public void valid_departure_place_and_destination_and_select_flight_accordingly(String string, String string2) throws InterruptedException {
	dp.departure(string);
	   Thread.sleep(2000);
	   dp.destination(string2);
	   Thread.sleep(2000);
	   dp.findFlight();
	   Thread.sleep(2000);
	   fp.selectFlight();
	   
}


@Then("fill necessary details name {string} And address {string}")
public void fill_necessary_details_name_and_address(String string, String string2) throws InterruptedException {
    fd.name(string);
    fd.address(string2);
    Thread.sleep(2000);
}

@Then("city {string} And state {string}")
public void city_and_state(String string, String string2)throws InterruptedException  {
   fd.city(string);
   fd.state(string2);
   Thread.sleep(2000);
}

@Then("zipcode {string} And cardtype {string}")
public void zipcode_and_cardtype(String string, String string2)throws InterruptedException  {
   fd.zipCode(string);
   fd.cardType(string2);
   Thread.sleep(2000);
   
}

@Then("credit card number {string} And  credit card month {string}")
public void credit_card_number_and_credit_card_month(String string, String string2) throws InterruptedException {
    fd.creditCardNumber(string);
    fd.creditCardMonth(string2);
    Thread.sleep(2000);
    
}

@Then("credit card year {string} And name on card {string} and purchase flight")
public void credit_card_year_and_name_on_card_and_purchase_flight(String string, String string2) throws InterruptedException {
   fd.creditCardYear(string);
   fd.nameOnCard(string2);
   Thread.sleep(2000);
   fd.purchaseFlight();
}


}
