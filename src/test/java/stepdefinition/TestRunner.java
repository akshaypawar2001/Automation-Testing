package stepdefinition;



import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\AkshayWorkSpace2\\HexaHRM\\src\\test\\java\\featurE" }, 
glue = "stepdefinition", plugin = {
		"html:reports/reports.html"}
)

public class TestRunner {

}
