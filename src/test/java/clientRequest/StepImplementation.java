package clientRequest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class StepImplementation {

	public static WebDriver driver;

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devashish.mathur\\Downloads\\V_69_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		WebDriverWait w=new WebDriverWait(driver,10);
		
	

	}
	
	

	@When("^User enter any text$")
	public void user_enter_any_text() throws Throwable {

		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("australia");
		driver.findElement(By.xpath("//button[@id='uh-search-button']")).click();
	}

	@Then("^User is navigated to search result page$")
	public void user_is_navigated_to_search_result_page() throws Throwable {

		Assert.assertFalse(true);
	}

	

}
