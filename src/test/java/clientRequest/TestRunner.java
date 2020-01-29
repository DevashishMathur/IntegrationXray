package clientRequest;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


//@RunWith annotation tells JUnit that tests should run using Cucumber class present in ‘Cucumber.api.junit‘ package.
@RunWith(Cucumber.class)
//This annotation tells Cucumber a lot of things like where to look for feature files etc.
@CucumberOptions(
features = "C:\\Users\\devashish.mathur\\eclipse-workspace\\RestAssured\\src\\main\\java\\gherkinTestCaseFeature\\1_CUC-25.feature"
,glue={"clientRequest"},
plugin= {"pretty", "json:target/cucumber-reports/cucuumber.json"},
monochrome=true,
strict= false,
dryRun=false)
public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
