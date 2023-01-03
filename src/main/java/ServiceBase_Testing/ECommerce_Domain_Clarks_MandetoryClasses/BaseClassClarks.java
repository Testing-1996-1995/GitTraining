package ServiceBase_Testing.ECommerce_Domain_Clarks_MandetoryClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassClarks {
	
	WebDriver driver;
	public void ConfigureBrower()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse_new\\ECommerce_Domain\\BrowsersDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.clarks.in/");
	}
	

}
