package ServiceBase_Testing.ECommerce_Domain_TestClasses;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ServiceBase_Testing.ECommerce_Domain_Mandatoryclasses.*;
import ServiceBase_Testing.ECommerce_Domain_Flipkart_POM.*;

public class captureFailedScreenshot extends Baseclass
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
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{	
		
		fhp.ClickOnClose();
		Thread.sleep(1000);
		fhp.ClickOnLogin();
		Thread.sleep(1000);
			
		flp.enterMobile(UtilityClass.fetchdata(1, 0));
		flp.enterPassword(UtilityClass.fetchdata(1, 1));
		flp.ClicksLogin();
	}
	@Test
	public void userValidation() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		
		fhp.ValidateUser(UtilityClass.fetchdata(1, 2));
	}
	@AfterMethod
	public void logout(ITestResult result) throws IOException, InterruptedException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.ScreenShot(driver, result.getName());
		}
        Thread.sleep(2000);		
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
