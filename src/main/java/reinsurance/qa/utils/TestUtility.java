package reinsurance.qa.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor.Base;

//import com.crm.qa.Constants.Constants;


public class TestUtility extends Base 
{
	/*
	 * public static Workbook book; public static Sheet sheet;
	 */
	public static WebDriver driver;
	public static Actions actions;
	public static Select select;
	public static Alert alert;
	public static JavascriptExecutor javaScript;


	//To Switch into a Frame using Name.
	public void switchToFrame(String frameName) 
	{
		try 
		{
			driver.switchTo().frame(frameName);
			System.out.println("Navigated to Frame with Name ::: " +frameName);
		} 
		catch (NoSuchFrameException e) 
		{
			System.out.println("Unable to Locate Frame with Name ::: " +frameName +e.getStackTrace());
		} 
		catch (Exception e) 
		{
			System.out.println("Unable to Navigate to Frame with Name ::: " +frameName +e.getStackTrace());
		}
	}

	//To Switch into a Frame using Index.
	public void switchToFrame(int frame) 
	{
		try 
		{
			driver.switchTo().frame(frame);
			System.out.println("Navigated to Frame with Index ::: " +frame);
		} 
		catch(NoSuchFrameException e) 
		{
			System.out.println("Unable to Locate Frame with Index ::: " +frame +e.getStackTrace());
		} 
		catch(Exception e) 
		{
			System.out.println("Unable to Navigate to Frame with Index ::: " +frame +e.getStackTrace());
		}
	}

	//To Take Screenshot at End Of Test.
	public static void takeScreenshotAtEndOfTest() throws IOException 
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/Screenshots/" + System.currentTimeMillis() + ".png"));
	}

	//Explicit Wait to Click on WebElement.
	public static void clickOn(WebDriver driver, WebElement element, Duration i) 
	{
		new WebDriverWait(driver,i).until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}
	//Explicit Wait to Send Data to WebElement.
	public static void sendKeys(WebDriver driver, WebElement element, Duration i, String value) 
	{
		new WebDriverWait(driver, i).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	//Explicit Wait for Element To Be Visible.
	public static void waitForElementToBeVisible(WebDriver driver, By locator, Duration timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	//To Handle Multiple Windows or Switch Between Multiple Windows.
	public void switchWindow(WebDriver driver, String firstWindow, String secondWindow) 
	{
		Set<String> windowHandles = driver.getWindowHandles();

		//	for Each loop 
		for(String windows : windowHandles) 
		{
			if(!windows.equals(firstWindow) && !windows.equals(secondWindow)) 
			{
				driver.switchTo().window(windows);
			}
		}
	}

	//To Check Element is Displayed or No.
	public static boolean isElementDisplayed(WebElement element) 
	{
		boolean elementDisplayed = element.isDisplayed();
		if(elementDisplayed) 
		{
			//	System.out.println("Element is Displayed");
			return true;
		} 
		else 
		{
			//	System.out.println("Element is not Displayed");
			return false;
		}
	}
	//To Check Element is Enabled or No.
	public static boolean isElementEnabled(WebElement element) 
	{
		boolean elementEnabled = element.isEnabled();
		if(elementEnabled) 
		{
			//System.out.println("Element is Enabled");
			return true;
		} 
		else 
		{
			//System.out.println("Element is not Enabled");
			return false;
		}
	}

	public static void isElementVisible(WebDriver driver, WebElement element) 
	{
		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(Exception.class);

	}
	//To refresh the page
	public static void pageRefresh(WebDriver driver) {

		driver.navigate().to(driver.getCurrentUrl());
	}

	public static void pressEnterKey(WebElement element ) {
		element.sendKeys(Keys.ENTER);
	}
	public static void pressDownKey(WebElement element ) {
		element.sendKeys(Keys.ARROW_DOWN);
	}
	//To Select a value from Drop Down by using SelectByVisibleText Method.
	public static void selectValueFromDropDownByText(WebElement element, String value) 
	{
		select = new Select(element);
		select.selectByVisibleText(value);
	}

	//To Select a value from Drop Down by using SelectByIndex Method.
	public static void selectValueFromDropDownByIndex(WebElement element, int value) 
	{
		select = new Select(element);
		select.selectByIndex(value);
	}

	//To Select a value from Drop Down by using SelectByValue Method.
	public static void selectValueFromDropDownByValue(WebElement element, String value) 
	{
		select = new Select(element);
		select.selectByValue(value);
	}

	//To Print all Values and Select a Required Value from Drop Down.
	public static void selectDropDownValue(String xpathValue, String value) 
	{
		List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());

		for(int i=0; i<monthList.size(); i++) 
		{
			System.out.println(monthList.get(i).getText());
			if(monthList.get(i).getText().equals(value)) 
			{
				monthList.get(i).click();
				break;
			}
		}
	}

	//To Validate Drop Down Values.
	public static List<String> dropDownValuesValidation(WebElement element) 
	{
		Select select = new Select(element);
		List<WebElement> dropDownValues = select.getOptions();

		List<String> toolsDropDownValues = new ArrayList<String>();

		for(WebElement listOfDropDownValues : dropDownValues) 
		{
			toolsDropDownValues.add(listOfDropDownValues.getText());
		}
		return toolsDropDownValues;
	}

	//To Select Radio Button.
	public void selectRadioButton(List<WebElement> element, String value)
	{
		for(WebElement elements : element)
		{
			if(elements.getText().equalsIgnoreCase(value))
			{
				elements.click();
				break;
			}
		}
	}

	//To Accept Alert Pop-Up.
	public static void acceptAlertPopup() throws InterruptedException 
	{
		try 
		{
			alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.accept();
			System.out.println("Alert Accepted Successfully");
		} 
		catch(Exception e) 
		{
			System.out.println("Something Went Wrong ==>> Please Check ::: " +e.getMessage());
		}
	}

	//To Dismiss Alert Pop-Up.
	public static void dismissAlertPopup() throws InterruptedException 
	{
		try 
		{
			alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(2000);
			alert.dismiss();
			System.out.println("Alert Dismissed Successfully");
		} 
		catch(Exception e) 
		{
			System.out.println("Something Went Wrong ==>> Please Check ::: " + e.getMessage());
		}
	}
	
	

	//To Match Value with List of Elements and Click on it.
	public void clickOnMatchingValue(List<WebElement> listOfElements, String valueToBeMatched) 
	{
		for(WebElement element : listOfElements) 
		{
			if(element.getText().equalsIgnoreCase(valueToBeMatched)) 
			{
				element.click();
				return;
			}
		}
	}

	//To Click on Element using Actions Class.
	public void clickOnElementUsingActions(WebElement element) 
	{
		actions = new Actions(driver);
		actions.moveToElement(element).click().perform();

	}

	//To Mouse Hover and Click or Select an Element using Actions Class.
	public static void moveToElement(WebDriver driver, WebElement element) 
	{

		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	//To Perform Drag and Drop action using Actions Class - 1.
	public static void dragAndDrop_1(WebDriver driver, WebElement sourceElement, WebElement destinationElement) 
	{
		actions = new Actions(driver);
		actions.dragAndDrop(sourceElement, destinationElement).pause(Duration.ofSeconds(2)).release().build().perform();
	}

	//To Perform Drag and Drop action using Actions Class - 2.
	public static void dragAndDrop_2(WebDriver driver, WebElement sourceElement, WebElement destinationElement) 
	{
		actions = new Actions(driver);
		actions.clickAndHold(sourceElement).pause(Duration.ofSeconds(2)).moveToElement(destinationElement).pause(Duration.ofSeconds(2)).release().build().perform();
	}

	//To Perform Right Click action using Actions Class.
	public static void rightClick(WebDriver driver, WebElement element) 
	{
		actions = new Actions(driver);
		actions.contextClick(element).build().perform();
	}



	//To perform Double Click action using Actions Class.
	public static void doubleClick(WebDriver driver, WebElement element) 
	{
		actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	//Extent Report - 1.
	public static String getSystemDate() 
	{
		DateFormat dateFormat = new SimpleDateFormat("_ddMMyyyy_HHmmss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	//Extent Report - 2.
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException 
	{
		String dateName = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

	/*
	 * //Set Date For Log4J. public static void setDateForLog4j() { SimpleDateFormat
	 * dateFormat = new SimpleDateFormat("_ddMMyyyy_HHmmss");
	 * System.setProperty("current_date", dateFormat.format(new Date()));
	 * PropertyConfigurator.configure("./src/main/resources/log4j.properties"); }
	 */
	public static String getDataFromClientSearchList(String text) {

		String data = driver.findElement(By.xpath("//span[contains(text(),'"+ text +"')]")).getText();

		return data;
	}


	public static void scrollDownPageByJavaScript(WebDriver driver)
	{
		javaScript = ((JavascriptExecutor) driver);
		javaScript.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void uploadFiles(String filePath) throws AWTException, InterruptedException {

		StringSelection sel = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.keyRelease(KeyEvent.VK_DELETE);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

	}

	public static void uploadFilesThruJavascript(WebElement element, String filePath) {

		javaScript = (JavascriptExecutor)driver;
		String javaScriptCode = "arguments[0].style.display = 'block';";
		javaScript.executeScript(javaScriptCode, element);
		element.sendKeys(System.getProperty("user.dir") + filePath);
	}
	public static void scrollIntoElementByJavaScript(WebElement element, WebDriver driver)
	{
		javaScript = ((JavascriptExecutor) driver);
		javaScript.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static boolean isAttribtuePresent(WebElement element, String attribute) {
		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);
			if (value != null){
				result = true;
			}
		} catch (Exception e) {}

		return result;
	}

	public static int getTotalAmount(List<WebElement> totalAmount ) {

		int sum = 0;
		for (WebElement e : totalAmount) {

			String amount = e.getAttribute("value").trim();

			int amnt = Integer.parseInt(amount);	

			sum+= amnt;
		}

		return sum;
	}
	public static void clickOnUsingJavaScript(WebElement element, Duration timeout ) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);

	}

	public static void setDateUsingJavaScript(WebElement element, String Value,WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+Value+"';", element);

	}

	public static void datePicker(String enterDate, WebDriver driver,int calendarIndex) {

		Date current = new Date();
		SimpleDateFormat dFormat = new SimpleDateFormat("d/MM/yyyy");
		try {
			Date dateToSelect = dFormat.parse(enterDate);

			String day = new SimpleDateFormat("d").format(dateToSelect);
			String month = new SimpleDateFormat("MMMM").format(dateToSelect);
			String year = new SimpleDateFormat("yyyy").format(dateToSelect);

			System.out.println(day + "     " + month + "     " + year + "      ");

			String requiredMonth = month + " " + year;

			System.out.println("Required month Year-------------" + requiredMonth);

			List<WebElement> clickDateField = driver.findElements(By.cssSelector("svg.MuiSvgIcon-root"));
			clickOn(driver, clickDateField.get(calendarIndex), 3);

			Thread.sleep(Utilities.SHORT_WAIT_TIME);

			Boolean flag = true;

			while (flag) {

				String monthoncalenderHeader = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();

				if (requiredMonth.equalsIgnoreCase(monthoncalenderHeader)) {
					driver.findElement(By.xpath("//p[text()='" + day + "']")).click();
					driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();

					flag = false;

					break;
				} else {

					if (dateToSelect.compareTo(current) > 0)

						driver.findElement(By.xpath("//div[@class='MuiPickersBasePicker-pickerView']//button[2]//span[1]//*[local-name()='svg']")).click();

					else if (dateToSelect.compareTo(current) < 0)
						driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersCalendarHeader-iconButton']//span[@class='MuiIconButton-label']//*[local-name()='svg']")).click();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void clickOn(WebDriver driver2, WebElement element, int i) {
		// TODO Auto-generated method stub
		
	}

}
