package clientRequest;



import java.io.FileInputStream;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.response.Response;


//@RunWith annotation tells JUnit that tests should run using Cucumber class present in ‘Cucumber.api.junit‘ package.
@RunWith(Cucumber.class)
//This annotation tells Cucumber a lot of things like where to look for feature files etc.
@CucumberOptions(
features = "C:\\Users\\devashish.mathur\\eclipse-workspace\\RestAssured\\src\\main\\java\\gherkinTestCaseFeature\\1_CUC-25.feature"
,glue={"clientRequest"},
plugin= {"pretty", "json:target/cucumber-reports/cucumber.json"},
monochrome=true,
strict= false,
dryRun=false)


public class TestRunner {

@AfterClass
public static void reportToXray() {
	
	
	
	System.out.println("Running after the tests");
	 // String userDir = System.getProperty("user.dir");
	 //RestAssured rest;
	
	//rest = new RestAssured();

	FileInputStream ip = null;
	try {
		ip = new FileInputStream("C:\\Users\\devashish.mathur\\eclipse-workspace\\RestAssured\\target\\cucumber-reports\\cucumber.json");
	ip.read();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	
	System.out.println("Before Passing it the body");

	Response resp = RestAssured.given().auth().oauth2(
			"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJlYzI3MzA4Zi03NjU5LTNiZTItOTNiOS1kODg2NTc2MGVjODIiLCJhY2NvdW50SWQiOiI1ZTEzMWE0YzUzNjEzMzBkYWFlYWVhYzEiLCJpYXQiOjE1ODA4MjA1ODQsImV4cCI6MTU4MDkwNjk4NCwiYXVkIjoiRUUwOTYyRTAwNzA2NDI5NEFERjZCN0VENDU0OTE5MEEiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiJFRTA5NjJFMDA3MDY0Mjk0QURGNkI3RUQ0NTQ5MTkwQSJ9.AE7jY_jsfw_Wpzm4b2eUopx0LC5sq5lIyNQjhHnGYI0")
		.body(ip)
		.with()
		.contentType("application/json")
		.post("https://xray.cloud.xpand-it.com/api/v1/import/execution/cucumber");

	System.out.println(resp.getStatusCode());
	System.out.println(resp.getBody().jsonPath().prettify());


	
}

}
