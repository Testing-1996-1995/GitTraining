package ServiceBase_Testing.ECommerce_Domain_Clarks_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clarks_Home_Page {
	
	
	@FindBy(xpath="//li[@class=\"nav-item arrow child open\"]")private WebElement newarrival;
	@FindBy(xpath="(//span[text()='Mens'])[1]")private WebElement mens;
	
	public Clarks_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void NewArrivals(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.moveToElement(newarrival).perform();
		act.click(mens).perform();
		
	}
	

}
