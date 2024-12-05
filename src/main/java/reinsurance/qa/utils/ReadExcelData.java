package reinsurance.qa.utils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ReadExcelData {

	
	private WebDriver driver=null;
	
	List<Map<String, String>> testDataInMap;
	@Test
	public void readExcelTestData() throws IOException, Exception {
		try {
			 testDataInMap = ExcelUtility.getTestDataInMap("sheet1");
			
			driver=BrowserUtility.initializeBrowser("Chrome");
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(testDataInMap.get(0).get("keyWord"));
			
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			
			

driver.quit();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

