package ServiceBase_Testing.ECommerce_Domain_Clarks_TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ServiceBase_Testing.ECommerce_Domain_Clarks_MandetoryClasses.BaseClassClarks;
import ServiceBase_Testing.ECommerce_Domain_Clarks_MandetoryClasses.UtilityClassClarks;
import ServiceBase_Testing.ECommerce_Domain_Clarks_Page.Clarks_Home_Page;
import ServiceBase_Testing.ECommerce_Domain_Clarks_Page.Clarks_Mens_Page;

public class TestClassClarks extends BaseClassClarks
{
	WebDriver driver;
	Clarks_Home_Page chp;
	Clarks_Mens_Page cmp;
	
	@BeforeClass
	public void ConfigureBrowser_OPenapplication()
	{
		ConfigureBrower();
		chp= new Clarks_Home_Page(driver);
		cmp= new Clarks_Mens_Page(driver);
		
	}
	
	@BeforeMethod
	public void Shopping() throws InterruptedException
	{
		chp.NewArrivals(driver); // we use action class methods
		Thread.sleep(2000);
		cmp.SortByPrice(); 
		Thread.sleep(1000);
		cmp.PriceRange();  // we use filter here
		Thread.sleep(2000);
	}
	
	@Test
	public void Vlaidatesortfilterss() throws IOException
	{
	       // we here validate the shoting by price from high to low
		cmp.validatesortbyprice(UtilityClassClarks.Fetchdata(0, 0));
	}

	@Test
	public void ValidatedPriceFilterss()
	{
		// we vlidate price filter under 2000 rs
		cmp.validatePriceRenge();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		// we close the webpage
		driver.close();
		Thread.sleep(1000);
	}
	@AfterClass
	public void Report()
	{
		Reporter.log("Clarks web base Application is closed");
	}
	

}
