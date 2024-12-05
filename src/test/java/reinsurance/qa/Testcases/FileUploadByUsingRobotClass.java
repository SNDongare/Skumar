package reinsurance.qa.Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadByUsingRobotClass {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//input[@type='file']")).click();
		Thread.sleep(4000);
		
	
			Robot robot=new Robot();
			
			StringSelection stringSelection=new StringSelection("C:\\Users\\DELL\\Desktop");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(4000);
			driver.close();
			
		
	}

}
