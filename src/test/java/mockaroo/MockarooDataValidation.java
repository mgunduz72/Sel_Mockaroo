package mockaroo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MockarooDataValidation {
	
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setupClass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}
	
	@Test
	public void testNavigationToMockaroo() {
		
		driver.navigate().to("http://mockaroo.com");
	}
	
	
	

}
