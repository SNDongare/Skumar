package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDownPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://tutorialsninja.com/demo/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Scroll down
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//Scroll Up
		jse.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(3000);
		
		driver.close();
	}

}
