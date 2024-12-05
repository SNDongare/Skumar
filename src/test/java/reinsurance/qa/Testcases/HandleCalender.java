package reinsurance.qa.Testcases;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalender {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(4000);


	}

	public static void selectDateFromCalender(WebDriver driver,WebElement calenderOpt,WebElement prevButton,WebElement nextButton,WebElement monthYear,List<WebElement> date,String targetDate) throws Exception  {
		Calendar calendar =  Calendar.getInstance();
		SimpleDateFormat targetDateFormat= new SimpleDateFormat("dd-MM-yyyy");
		Date formatedTargetDate;
		try {
			targetDateFormat.setLenient(false);
			formatedTargetDate = targetDateFormat.parse(targetDate);
			calendar.setTime(formatedTargetDate);

			int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
			int targetMonth=calendar.get(Calendar.MONTH);
			int targetYear=calendar.get(Calendar.YEAR);

			//driver.findElement(By.id("second_date_picker")).click();
			calenderOpt.click();
			Thread.sleep(2000);
			//String actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			String actualDate = monthYear.getText();
			calendar.setTime(new SimpleDateFormat("MM yyyy").parse(actualDate));

			int actualMonth=calendar.get(Calendar.MONTH);
			int actualYear=calendar.get(Calendar.YEAR);

			while(targetMonth < actualMonth|| targetYear < actualYear) {
				//driver.findElement(By.className("ui-datepicker-prev")).click();
				prevButton.click();
				//actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				actualDate = monthYear.getText();
				calendar.setTime(new SimpleDateFormat("MM yyyy").parse(actualDate));

				actualMonth=calendar.get(Calendar.MONTH);
				actualYear=calendar.get(Calendar.YEAR);
			}

			while(targetMonth > actualMonth|| targetYear > actualYear) {
				//driver.findElement(By.className("ui-datepicker-next")).click();
				nextButton.click();
				//actualDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				actualDate = monthYear.getText();
				calendar.setTime(new SimpleDateFormat("MM yyyy").parse(actualDate));

				actualMonth=calendar.get(calendar.MONTH);
				actualYear=calendar.get(calendar.YEAR);
			}

			//driver.findElement(By.xpath("Write Expath of Date to select target date")).click();
			//List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar"));
			List<WebElement> allDates = date;
			for(WebElement dates:allDates) {
				String dateValue = dates.getText();
				
				if(dateValue.equals(date)) {
					dates.click();
					break;
				}
			}
			
		}catch(Exception e) {
			throw new Exception("Invalid Date is provided, please check input date");
		}
	}

	
	

}
