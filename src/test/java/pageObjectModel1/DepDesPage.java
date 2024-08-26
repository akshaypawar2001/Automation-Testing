package pageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DepDesPage extends BasePage{
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement findflight;
	
	@FindBy(name="fromPort")
	WebElement dep;
	
	@FindBy(name="toPort")
	WebElement des;
	
	public void departure(String s1) {
	
	Select sel=new Select(dep);
	sel.selectByVisibleText(s1);
	}
	
	public void destination(String s2) {
		
		Select sel=new Select(des);
		sel.selectByVisibleText(s2);
		}
	
	public void findFlight() {
		findflight.click();
	}
}
