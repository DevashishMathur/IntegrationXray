package clientRequest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {



	
	@Test
	public void postCall() throws FileNotFoundException {

		RestAssured rest = new RestAssured();

		FileInputStream ip = null;
		try {
			ip = new FileInputStream(
					"C:\\Users\\devashish.mathur\\eclipse-workspace\\RestAssured\\target\\cucumber-reports\\cucumber.json");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		Response resp = RestAssured.given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJlYzI3MzA4Zi03NjU5LTNiZTItOTNiOS1kODg2NTc2MGVjODIiLCJhY2NvdW50SWQiOiI1ZTEzMWE0YzUzNjEzMzBkYWFlYWVhYzEiLCJpYXQiOjE1NzkwMDQyMzQsImV4cCI6MTU3OTA5MDYzNCwiYXVkIjoiRUUwOTYyRTAwNzA2NDI5NEFERjZCN0VENDU0OTE5MEEiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiJFRTA5NjJFMDA3MDY0Mjk0QURGNkI3RUQ0NTQ5MTkwQSJ9.wGBqSJI89Po2HH__iiN73lpJhKEl6uegbh2P10cmCmA")
				.body(ip).with().contentType("application/json").post("https://xray.cloud.xpand-it.com/api/v1/import/execution/cucumber");

		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().asString());

	}
	
	
	
	
}
