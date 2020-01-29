package clientRequest;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class PracticeQA {
	
	public static  WebDriver driver;
	
//	@Test
//	public void tearUP() {
//		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\devashish.mathur\\Downloads\\V_69_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		WebElement hiddenBox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
//		hiddenBox.click();
//		hiddenBox.sendKeys("Hello world");
//		Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_UP);
//		
//		
//		
//		
//	}
	
	
	@Test
	public  void assignMent() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devashish.mathur\\Downloads\\V_69_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement checkBox=	driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	checkBox.click();
	//String label=checkBox.getText();
	//System.out.println("label");
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	String checking=jse.executeScript("return arguments[0].innerHTML", checkBox).toString();
	System.out.println(checking);
	
	////*[@id="checkbox-example"]/fieldset/label[2]
	
//	Select sel=new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
//	sel.selectByVisibleText(label);
//	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(label);
//	driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
//	Alert ale=driver.switchTo().alert();
//	Boolean br=ale.getText().contains(label);
//	Assert.assertTrue(br);
//		
	}
	
	

}
