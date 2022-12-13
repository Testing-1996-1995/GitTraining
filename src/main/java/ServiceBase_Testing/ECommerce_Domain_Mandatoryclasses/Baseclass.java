package ServiceBase_Testing.ECommerce_Domain_Mandatoryclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public WebDriver driver;
	
	public void configureBrowser()
	{
		//configure browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse new\\ECommerce_Domain\\BrowserDrivers\\chromedriver.exe");   
		   //create webdriver object
		   
	    driver= new ChromeDriver();
		   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
		   
		//open application
		driver.get("https://www.flipkart.com");
	}
 

}
