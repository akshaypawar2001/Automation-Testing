package pageObjectModel2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generic2.Driverutils2;

public class BasePage {
	WebDriver driver;
	public BasePage() {
		driver=Driverutils2.getDriver();
		PageFactory.initElements(driver, this);
	}

}
