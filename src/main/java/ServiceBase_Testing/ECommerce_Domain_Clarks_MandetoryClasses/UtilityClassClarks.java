package ServiceBase_Testing.ECommerce_Domain_Clarks_MandetoryClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClassClarks {
	
	public static String Fetchdata(int r, int c) throws IOException
	{
		FileInputStream f= new FileInputStream("C:\\Users\\User\\eclipse_new\\ECommerce_Domain\\TestData\\parameteristiondata.xlsx");
		XSSFWorkbook b= new XSSFWorkbook(f);
		XSSFSheet e= b.getSheet("ClarksData");
		String data= e.getRow(r).getCell(c).getStringCellValue();
		return data;
	}

}
