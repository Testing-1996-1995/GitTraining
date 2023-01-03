package ServiceBase_Testing.ECommerce_Domain_Clarks_Page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Clarks_Mens_Page {
	
	@FindBy(xpath="//select[@class=\"sort-by\"]")private WebElement sort;
	@FindBy(xpath="//span[text()='Price (High to Low)']")private WebElement valsort;
	@FindBy(xpath="//span[text()=\"Price\"]")private WebElement prizefilter;
	//@FindBy(xpath="//div[@class=\"p-list\"]//div[3]//div[2]//span")private WebElement PHtoL;
	@FindBy(xpath="//span[text()='Rs.2000 to Rs.4000']")private WebElement Filter;
	SoftAssert a= new SoftAssert();
	
	public Clarks_Mens_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void SortByPrice()
	{
		sort.click();
		Select s= new Select(sort);
		s.selectByVisibleText("Price (High to Low)");
	}
	
	
	public void validatesortbyprice(String expected)
	{
		//List<WebElement> PHL=driver.findElements(By.xpath("//div[@class=\"p-list\"]//div[3]//div[2]//span"));
		String actual= valsort.getText();
		a.assertEquals(actual, expected);		
	}
	public void PriceRange()
	{
		Filter.click();
	}
	public void validatePriceRenge()
	{
		boolean bl=Filter.isSelected();
		a.assertTrue(bl);
		a.assertAll();
	}
	
}
