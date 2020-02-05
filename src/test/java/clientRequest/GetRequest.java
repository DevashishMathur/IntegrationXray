package clientRequest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	
	public static String userDir = System.getProperty("user.dir");
	public static RestAssured rest;
	
	



	
	@Test
	public void postCall() throws FileNotFoundException {

		 rest = new RestAssured();

		FileInputStream ip = null;
		try {
			ip = new FileInputStream(userDir+
					"\\target\\cucumber-reports\\cucumber.json");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		Response resp = RestAssured.given().auth().oauth2(
				"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiJlYzI3MzA4Zi03NjU5LTNiZTItOTNiOS1kODg2NTc2MGVjODIiLCJhY2NvdW50SWQiOiI1ZTEzMWE0YzUzNjEzMzBkYWFlYWVhYzEiLCJpYXQiOjE1ODA4MjA1ODQsImV4cCI6MTU4MDkwNjk4NCwiYXVkIjoiRUUwOTYyRTAwNzA2NDI5NEFERjZCN0VENDU0OTE5MEEiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiJFRTA5NjJFMDA3MDY0Mjk0QURGNkI3RUQ0NTQ5MTkwQSJ9.AE7jY_jsfw_Wpzm4b2eUopx0LC5sq5lIyNQjhHnGYI0")
				.body(ip).with().contentType("application/json").post("https://xray.cloud.xpand-it.com/api/v1/import/execution/cucumber");

		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody().jsonPath().prettify());

	}
	
	@Test@Ignore
	public void generatingToken() throws IOException {
	//	FileInputStream ip1=new FileInputStream(userDir+"\\src\\test\\java\\value.properties");
	//	Properties prop=new Properties();
	//	prop.load(ip1);
		
		Response resp1=RestAssured
		.given()
	//	.accept("application/json")
		.contentType("application/json")	
		.queryParam("client_id", "EE0962E007064294ADF6B7ED4549190A")
		.queryParam("client_secret", "12f28aa264d5c579e9eb8b64252c7f1159231e01c325b22ebb20495927d076a1")
	//	.header("Content-Type", "\"application/json; charset=UTF-8\"")
	//	.header("Authorization","EE0962E007064294ADF6B7ED4549190A","12f28aa264d5c579e9eb8b64252c7f1159231e01c325b22ebb20495927d076a1")
	//	.contentType("application/json")
	//	.formParam("client_id","EE0962E007064294ADF6B7ED4549190A")
	//	.formParam("client_secret", "12f28aa264d5c579e9eb8b64252c7f1159231e01c325b22ebb20495927d076a1")
		.post("https://xray.cloud.xpand-it.com/api/v1/authenticate");
		
//		
//		JSONObject jsonObject = new JSONObject(resp1.getBody().asString());
//		String token=jsonObject.get("access_token").toString();
//		System.out.println(token);
		
		
		//System.out.println(resp1.contentType());
		System.out.println(resp1.getBody().jsonPath().prettify());
		
		System.out.println(resp1.getStatusCode());
		
	}
	
	@Test@Ignore
	public void authentication() {
		
//		  Response response =
//			         given()
//			//.header("Authorization",<client id>:<client secret>)
//			.contentType("application/x-www-form-urlencoded")
//			.formParam("grant_type","authorization_code")                                                  
//			.formParam("client_id", CLIENT_ID)
//			.formParam("client_secret", CLIENT_SECRET)
//			        .when()
//			 .post(BASE_URI+"/oauth2/token");
//		
//		
		
	}
	
	
	
	
}
