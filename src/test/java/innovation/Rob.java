package innovation;

import java.awt.AWTException;
import java.awt.Robot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rob {
	public static WebDriver driver;
	
	
	@Test
	public void robotDemo() throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devashish.mathur\\Downloads\\V_69_ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://in.yahoo.com/");
		
		Robot robot = new Robot();
		
		Thread.sleep(5000);
		
		robot.mouseWheel(3);
		
		
	}
	
	@Test
	public WebElement table(String name) {
		WebDriver driver = null;
		
		//Method-2:
			WebElement table=driver.findElement(By.xpath("//a[contains(text(),'\"+name+\"')]/parent::td//preceding-sibling::td//input[@name='contact_id']"));
			return table;
			//	driver.findElement(By.xpath("//a[contains(text(),'name')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
	}

}
