package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToHandleHiddenElements {

	public static void main(String[] args) throws Exception {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.learn.letskodeit.com/p/practice");
		
		driver.findElement(By.id("hidden-textbox")).click();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('displayed-text').value ='sachin dongare';" );

		Thread.sleep(1000);
	}

}
