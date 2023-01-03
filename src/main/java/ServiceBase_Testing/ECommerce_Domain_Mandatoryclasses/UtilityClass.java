package ServiceBase_Testing.ECommerce_Domain_Mandatoryclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String fetchdata(int rowindex, int colindex) throws IOException
	{
		 FileInputStream file1= new FileInputStream("C:\\Users\\User\\eclipse_new\\ECommerce_Domain\\TestData\\parameteristiondata.xlsx");
		 XSSFWorkbook book= new XSSFWorkbook(file1);
		XSSFSheet S = book.getSheet("TestData");
		String data= S.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}
	public static void ScreenShot(WebDriver driver,String Snap) throws IOException
	{
		TakesScreenshot scr=(TakesScreenshot)driver;
		File sor= scr.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\User\\eclipse_new\\ECommerce_Domain\\Screenshots/"+Snap+".jpg");
		FileHandler.copy(sor, dest);

	}
}
