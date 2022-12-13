package ServiceBase_Testing.ECommerce_Domain_TestClasses;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.Reporter;
import org.testng.annotations.*;
import ServiceBase_Testing.ECommerce_Domain_Mandatoryclasses.*;
import ServiceBase_Testing.ECommerce_Domain_Flipkart_POM.*;
public class Testclass1 extends Baseclass
{
	
	Flipkart_Home_Page fhp;
	Flipkart_Login_Page flp;
	XSSFSheet S;
	@BeforeClass
	public void configureBrowser_Openapplication() throws IOException 
	{
		configureBrowser();
		fhp= new Flipkart_Home_Page (driver);
		flp= new Flipkart_Login_Page(driver);
		UtilityClass.ScreenShot(driver, "Ng1 Application opened");
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{	
		
		fhp.ClickOnClose();
		Thread.sleep(1000);
		fhp.ClickOnLogin();
		Thread.sleep(1000);
		
		UtilityClass.ScreenShot(driver,"Logingpage");
		
		flp.enterMobile(UtilityClass.fetchdata(1, 0));
		flp.enterPassword(UtilityClass.fetchdata(1, 1));
		UtilityClass.ScreenShot(driver, "EnteredValues");
		flp.ClicksLogin();
	}
	@Test
	public void userValidation() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		
		fhp.ValidateUser(UtilityClass.fetchdata(1, 2));
		
		UtilityClass.ScreenShot(driver,"Validuser");
	}
	
	@AfterMethod
	public void logout() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		fhp.ClickOnLogout(driver);
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closingapplication()
	{
		driver.close();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("closing browser",true);
	}
	

	

	


}
