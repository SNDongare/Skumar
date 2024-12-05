package SeleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshPageCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://tutorialsninja.com/demo/");


		//Refresh Page by suing Refresh command

		Thread.sleep(4000);

		driver.navigate().refresh();

		//Refresh Page by suing SendKeys Command

		Thread.sleep(4000);

		Actions actions=new Actions(driver);

		actions.sendKeys(Keys.F5).build().perform();

		//Refresh Page by suing java script executor
		Thread.sleep(4000);

		JavascriptExecutor jsc = (JavascriptExecutor)driver;

		jsc.executeScript("window.location.reload");

		Thread.sleep(4000);

		//Refresh Page by suing driver.get Command

		driver.get(driver.getCurrentUrl());


		Thread.sleep(4000);

		//Refresh Page by suing driver.navigate().get() Command

		driver.navigate().to(driver.getCurrentUrl());

		Thread.sleep(4000);


		driver.quit();
	}

}
