package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadAJavaScriptVariable {

	public static void main(String[] args) {
		
	WebDriverManager.edgedriver().setup();

	WebDriver driver=new EdgeDriver();

	driver.manage().window().maximize();

	driver.get("https://tutorialsninja.com/demo/");
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	String title=(String) jse.executeScript("return document.title");
	
	System.out.println(title);
	
	driver.close();
}
}