package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlternateToGetCommand {

	public static void main(String[] args) {

		//get() open url in browser 
		//driver.navigate() open the url 

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		//	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//Alternative way to open url in browser

		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");

		driver.quit();

	}

}
