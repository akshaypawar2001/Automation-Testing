package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class Searchpage extends BasePage{

	@FindBy(xpath="(//span[@data-name='close'])[2]")
	WebElement closepopup;

	@FindBy(xpath="(//span[@size='22'])[2]")
	WebElement searchicon;

	@FindBy(xpath="//input[@id='search']")
	public WebElement value;
	
	@DataProvider
	public Object[][] getData(){
		Object [][] data=new Object[1][1];
		data[0][0]="socks";
		return data;
	}
	
	public void closePopup() {
		closepopup.click();
	}
	
	
	public void searchIcon()  {
		
		searchicon.click();
	}
	
	
	public void searchValue(String str) {
		value.sendKeys(str);;
	}


}
