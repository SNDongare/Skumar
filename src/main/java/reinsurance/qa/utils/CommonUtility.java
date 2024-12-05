/**
 * 
 */
package reinsurance.qa.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import reinsurance.qa.Base.Base;



/**
 * @author sachindongare
 *
 */
public class CommonUtility extends Base{

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select select;
	public static Actions actions;
	public static Alert alert;
	public static JavascriptExecutor javaScript;

	public static Logger logger=(Logger) LoggerFactory.getLogger(CommonUtility.class);


	//For Click Action
	public static void clickingOnWebElement(WebElement element , long waitTimeInSeconds){
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(waitTimeInSeconds));
		WebElement elements=null;
		elements=wait.until(ExpectedConditions.elementToBeClickable(elements));
		elements.click();
	}
	//For click Action by using Action Class
	public static void clickOnElementByUsingActionClass(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	//To perform Drag and Drop Operation by using Action Class(Method One)
	public static void dragAndDropAction(WebDriver driver,WebElement sourceEelement,WebElement targetElement) {
		actions =new Actions(driver);
		actions.dragAndDrop(sourceEelement, targetElement).pause(Duration.ofSeconds(Utilities.SHORT_WAIT_TIME)).release().build().perform();
	}
	//To perform Drag and Drop Operation by using Action Class(Method Second)
	public static void dragAndDropOperation(WebDriver driver,WebElement sourceElement,WebElement targetElement) {
		actions=new Actions(driver);
		actions.clickAndHold(sourceElement).pause(Duration.ofSeconds(Utilities.SHORT_WAIT_TIME)).moveToElement(targetElement).pause(Duration.ofSeconds(Utilities.SHORT_WAIT_TIME)).release().build().perform();
	}
	//To Perform Right Click operation using Actions Class.
	public static void rightClick(WebDriver driver,WebElement element) {
		actions=new Actions(driver);
		actions.contextClick(element).build().perform();
	}
	//To perform Double Click action using Actions Class.
	public static void doubleClick(WebDriver driver,WebElement element) {
		actions=new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	//For Sendkeys Action
	public static void sendKeysWebElement(WebElement element,long waitTimeInSeconds,String text) {
		new WebDriverWait(driver,Duration.ofSeconds(waitTimeInSeconds)).until(ExpectedConditions.visibilityOf(element));
		element.click();
		element.clear();
		element.sendKeys(text);

	}

	//Select value from Dropdown by Visisble Text
	public static void selectDropDownByVisibleText(WebElement element,String text) {
		try {
			select =new Select(element);
			select.selectByVisibleText(text);
			logger.info("text'"+"'is selected from dropdown'"+element+"'");}
		catch(Exception e) {
			e.printStackTrace();
			logger.info("'"+element+ "'is not present or text,"+text+ "'is not selected");
		} 
	}
	//Select value from DropDown by value
	public static void selectDropDownByValue(WebElement element,String text) {
		try {
			select.selectByValue(text);
			logger.info("text'"+"'is selected from dropdown'"+element+"'");
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.info("'"+element+ "'is not present or text,"+text+ "'is not selected");
		}
	}
	//Select value from Dropdown by index
	public static void selectValueFromDropDownByIndex(WebElement element, int value)
	{
		try {
			select.selectByIndex(value);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	

	//To Accept Simple Alert Pop-Up
	public static void acceptSimpleAllertPopup() {
		try {
			alert=driver.switchTo().alert();
			logger.info(alert.getText());
			wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			logger.info("Alert Dismissed Successfully");
		}
		catch(Exception e)
		{
			logger.info("Something Went Wrong ==>> Please Check ::: " +e.getMessage());
		}
	}
	//To HandleDismiss Alert Pop-Up.
	public static void dismissAlertPopup() {
		try {
			alert=driver.switchTo().alert();
			logger.info(alert.getText());
			wait.until(ExpectedConditions.alertIsPresent());
			alert.dismiss();
			logger.info("Alert Dismissed Successfully");
		}
		catch(Exception e) {
			logger.info("Something Went Wrong ==>> Please Check ::: " + e.getMessage());
		}
	}
	//To Prompt Alert
	public static void promptAlert(WebDriver driver,String value) {
		alert=driver.switchTo().alert();
		logger.info("Alert Handled Successfully");
		wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys(value);
	}
	//To Switch into a Frame using Name.
	public static void switchToFrame(String frameName) {
		try {
			driver.switchTo().frame(frameName);
			logger.info("Navigated to Frame with Name ::: " +frameName);
		}
		catch(NoSuchFrameException e)
		{
			logger.info("Unable to Locate Frame with Name ::: " +frameName +e.getStackTrace());
		}
		catch(Exception e) {
			logger.info("Unable to Locate Frame with Name ::: " +frameName +e.getStackTrace());
		}
	}
	//To Switch into a Frame using Index.
	public static void switchToFrame(int frameNo) {
		try {
			driver.switchTo().frame(frameNo);
			logger.info("Navigated to Frame with Index ::: " +frameNo);
		}
		catch(NoSuchFrameException e) {
			logger.info("Unable to Locate Frame with Index ::: " +frameNo +e.getStackTrace());
		}
		catch(Exception e) {
			logger.info("Unable to Locate Frame with Index ::: " +frameNo +e.getStackTrace());
		}
	}
	//To Check Element is Displayed or No.
	public static boolean isElementDisplayed(WebElement element) {
		boolean elementDisplayed = element.isDisplayed();
		if(elementDisplayed)
		{
			logger.info("Element is Displayed");
			return true;
		}
		else
		{
			logger.info("Element is Not Displayed");
			return false;
		}
	}
	//To Check Element is Enabled or No.
	public static boolean isElementEnabled(WebElement element) {
		boolean elementEnabled = element.isEnabled();
		if(elementEnabled)
		{
			logger.info("Element is Enabled");
			return true;
		}
		else {
			logger.info("Element is Disabled");
			return false;
		}
	}
	//Select Radio Button
	public static void selectRadioButton(List<WebElement> element, String value) {
		for(WebElement elements:element)
		{
			if(elements.equals(value))
			{
				elements.click();
				break;
			}
		}	
	}
	//To Match Value with List of Elements and Click on it.
	public static void clickOnMatchingValue(List<WebElement> listOfElement,String valueToBeMatched) {
		for(WebElement element: listOfElement) {
			if(element.getText().equalsIgnoreCase(valueToBeMatched)) {
				element.click();
				return;
			}
		}
	}
	//Scroll down Page by using JavaScript
	public static void scrollDownPageByJavaScript(WebDriver driver) {
		javaScript = ((JavascriptExecutor) driver);
		javaScript.executeScript("Window.ScrolTo(0,document.body.scrollHeight)");
	}
	//Upload File By using Robot Class
	public static void uploadFiles(String filePath) throws AWTException {
		StringSelection selectFile=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectFile, null);
		logger.info("SelectedFile" +selectFile);
		Robot robot=new Robot();
		robot.delay(Utilities.SHORT_WAIT_TIME);
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

	}
	//Upload File by using JavaScript
	public static void uploadFilesThruJavascript(WebElement element, String filePath) {

		javaScript = (JavascriptExecutor)driver;
		String javaScriptCode = "arguments[0].style.display = 'block';";
		javaScript.executeScript(javaScriptCode, element);
		element.sendKeys(System.getProperty("user.dir") + filePath);
	}
	//Upload file by using SendKeys Method with Action Class
	public static void uploadFileBySenkeys(WebElement element,String filePath) {
		actions.moveToElement(element).click().build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(filePath);
	}
	
	//Handle Calender
	public static void selectDateFromDatePicker() {
		
	}



	
	
}












