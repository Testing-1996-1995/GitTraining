package ServiceBase_Testing.ECommerce_Domain_Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Flipkart_Home_Page {
	@FindBy(xpath="//button[text()='✕']")private WebElement close;
	@FindBy(xpath="//a[text()='Login']")private WebElement LoginButton;
	@FindBy(xpath="//div[text()='Manoj']")private WebElement UserName;
	@FindBy(xpath="//div[@class=\"_2t2dSp\"]")private WebElement Next;
	@FindBy(xpath="//li[9]//div[text()='Logout']")private WebElement LogOut;
	@FindBy(xpath="//div[@class=\"xtXmba\" and text()=\"Home\"]")private WebElement home;
	@FindBy(xpath="//a[ text()=\"Furniture Studio\"]")private WebElement Fstudio;
	
	public Flipkart_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOnClose()
	{
		close.click();
	}
	public void ClickOnLogin()
	{
		LoginButton.click();
	}
	public void ValidateUser(String expecteduser)
	{
		String ActualUser=UserName.getText();
		
		Assert.assertEquals(ActualUser, expecteduser);
	}
	
	public void ClickOnLogout(WebDriver driver)
	{
		Actions act= new Actions(driver);
		act.moveToElement(UserName).perform();
		act.click(LogOut).perform();
		
	}
	public void HomeFurniture(WebDriver driver)
	{
		Actions at= new Actions(driver);
		at.moveToElement(home).perform();
		at.click(Fstudio).perform();
	}
	

}
