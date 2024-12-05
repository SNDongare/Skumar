package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception {

		//What is Javascripteecutor
		//It is a predefined InterFace in a selenium
		//Run the Java script code
		
		//Q-When we go for the Javascript Executor
		//Ans-> Selenium WebDriver is not able to do something
		//eg.Scroll of page
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
//		jse.executeScript("alert('Sachin Dongare')");
		/*
		 * Thread.sleep(3000);
		 * 
		 * //Scroll page By
		 * 
		 * jse.executeScript("window.scrollBy(0,600)"); Thread.sleep(3000);
		 * driver.close();
		 */
		
		
		//Click on button by using Javascript Executor
		
		WebElement alertButton = driver.findElement(By.id("alert1"));
		
		jse.executeScript("arguments[0].click()", alertButton);
		Thread.sleep(2000);
		

	}

}
