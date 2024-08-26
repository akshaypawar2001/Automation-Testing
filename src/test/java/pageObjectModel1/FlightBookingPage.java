package pageObjectModel1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBookingPage extends BasePage{
	@FindBy(xpath="(//input[@type='submit'])[3]")
	WebElement selectflight;
	
	
	public void selectFlight() {
		selectflight.click();
	}

}
