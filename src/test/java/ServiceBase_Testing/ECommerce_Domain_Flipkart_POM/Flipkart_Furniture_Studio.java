package ServiceBase_Testing.ECommerce_Domain_Flipkart_POM;

import java.util.List;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_Furniture_Studio {
	public static int i;
	public static int j; 
	@FindBy(xpath="//img[ @alt=\"Office Tables \" and @class=\"_2OHU_q aA9eLq\"]")private WebElement OfficeTable;
	//{//div[2]/div[2]//div[2][@style="width: 25%;"]}
	@FindBy(xpath="(//select[@class=\"_2YxCDZ\"])[2]")private WebElement FltPrice;
	// for validating price filter
	//@FindBy(xpath="(//div["+j+"]//a[3]//div[@class=\"_30jeq3\"])["+i+"]")private WebElement ValidateFiltr;
	//div/div[2]/div[1]/div[1][@style="width: 25%;"]----i=10, j=4
	//(//div[4]//a[3]//div[@class="_30jeq3"])[2]---- j=1-4 matches i= 1to 11
	
	public Flipkart_Furniture_Studio(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void FurnitureStudio()
	{
		OfficeTable.click();
	}
	public void FilterPrice()
	{
		Select st= new Select(FltPrice);
		st.selectByVisibleText("₹5000");
		
	}
	public void ValidateFilterApplied(WebDriver driver)
	{
//		for(i=1; i<=4; i++)
//		{
//			for(j=2; j<=11; j++)
//			{
//				WebElement e1= driver.findElement(By.xpath("(//div[2]//div["+j+"][@class=\"_1AtVbE col-12-12\"]//a[3])["+i+"]"));
//			    String s = e1.getText();
//			    
//			}
//		}
//		
		
		List<WebElement> prz=driver.findElements(By.xpath("(//div[2]//div[@class=\"_1AtVbE col-12-12\"]//a[3]/div/div[@class=\"_30jeq3\"])"));
		
		for(WebElement e2: prz)
		{
			String s1= e2.getText();
			if(s1.contains("₹"))
			{
				
			}
		}
		
	}
	
	
}
