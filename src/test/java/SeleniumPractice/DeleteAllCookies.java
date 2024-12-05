package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAllCookies {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://tutorialsninja.com/demo/");
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(4000);
		
		
		
		
		driver.quit();
	}

}
