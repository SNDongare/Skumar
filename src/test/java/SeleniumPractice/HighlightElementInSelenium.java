package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightElementInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://tutorialsninja.com/demo/");
		
		WebElement searchBox = driver.findElement(By.name("search"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red')", searchBox);

		Thread.sleep(4000);
		
		driver.close();
	}

}
