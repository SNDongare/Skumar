package reinsurance.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilities {
	
	public static final int IMPLICIT_WAIT_TIME=30;
	public static final int PAGE_LOAD_TIME=25;
	public static final int EXPLICIT_WAIT_TIME=15;
	public static final int SHORT_WAIT_TIME=5;
	public static final int MEDIUM_WAIT_TIME=10;
	public static final int LONG_WAIT_TIME=20;
	

	
	public static String generateEmailWithTimeStamp()
	{
		Date date=new Date();
		String timeStamp= date.toString().replace(" ", "_").replace(":","_");
		return "sachindongare4467"+timeStamp+"@gmail.com";
	}
	
	public static Object[][] getTestDataFromExcel(String sheetName)
	{
		File excelFile=new File(System.getProperty("user.dir")+"/src/main/java/Automation/in/qa/testdata/Automation.qa.testdata.xlsx");
		XSSFWorkbook workbook=null;
		try {
		FileInputStream fisExcel=new FileInputStream(excelFile);
		 workbook=new XSSFWorkbook(fisExcel);
		}catch(Throwable e)
		{
			e.printStackTrace();
		}
		XSSFSheet sheet=workbook.getSheet(sheetName);
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		Object [][] data=new Object[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			XSSFRow row=sheet.getRow(i+1);
			
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell=row.getCell(j);
				CellType celltype = cell.getCellType();
				
				switch(celltype)
				{
				case STRING:
					data[i][j]=cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j] = Integer.toString((int)cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[i][j]=cell.getBooleanCellValue();
					break;
				}
			}
		}
		return data;
	}
public static String captureScreenShot(WebDriver driver,String testName) {
	File sreScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destinationScreenShotPath=System.getProperty("user.dir")+"/ScreenShots/"+testName+".png";
	try {
		FileHandler.copy(sreScreenShot, new File(destinationScreenShotPath));
	} catch (IOException e) {
		e.printStackTrace();
	}
	return destinationScreenShotPath;
}
	
}
