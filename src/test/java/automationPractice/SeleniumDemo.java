package automationPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) throws IOException, Exception {

		WebDriver driver= new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Find all the links on webpage
		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a")); for(WebElement
		 * link:links) {
		 * System.out.println(link.getText()+"--->"+link.getAttribute("href")); }
		 */

		//Take screen shot code in java
		/*
		 * File screenshot= (((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE)); FileUtils.copyFile(screenshot, new
		 * File("Desktop.png"));
		 */

		//Scroll in to view in to visibility of element
		/*
		 * WebElement targetElement=driver.findElement(By.xpath(
		 * "//button[normalize-space()='LogIn']")); JavascriptExecutor
		 * js=(JavascriptExecutor)driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		 * //js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
		 * Thread.sleep(5000);
		 */


		//Read the data from the excel and use it

		/*
		 * FileInputStream fis= new FileInputStream(new
		 * File("C://Users//DELL//Desktop//AutomationLearning//testFile.xlsx"));
		 * Workbook workBook= new XSSFWorkbook(fis); Sheet sheet=workBook.getSheetAt(0);
		 * Row row=sheet.getRow(0);
		 * 
		 * String username=row.getCell(0).getStringCellValue(); String password=
		 * row.getCell(1).getStringCellValue();
		 * 
		 * System.out.println(username); System.out.println(password);
		 * 
		 * workBook.close();
		 */
		
		//Find the all broken links
		
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
		
	for(WebElement link:links) {
		String url=link.getAttribute("href");
	try {
		HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		
		if(connection.getResponseCode()>=400) {
			System.out.println(url+" is the broken links.");
		}
		else {
			System.out.println(url+" is the valid link.");
		}
	}catch(Exception e) {
		System.out.println(url+" is the broken links.");
	}
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}

}
