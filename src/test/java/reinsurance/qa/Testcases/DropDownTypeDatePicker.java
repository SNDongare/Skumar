package reinsurance.qa.Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTypeDatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(4000);

		driver.findElement(By.id("fourth_date_picker")).click();//Open the datepicker
		
		Select selectMonth =new Select(driver.findElement(By.className("ui-datepicker-month")));
		selectMonth.selectByVisibleText("selectMonth");
		
		Select selectYear=new Select(driver.findElement(By.className("ui-datepicker-year")));
		selectYear.selectByVisibleText("2023");
		
		String date="12";
		
	//	Select dates
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar"));
		
		for(WebElement dates:allDates) {
			String dateValue = dates.getText();
			
			if(dateValue.equals(date)) {
				dates.click();
				break;
			}
		}
	
		
		
	}

}
