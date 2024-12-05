package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PauseExecution {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//Pause the execution for the 5 seconds

		synchronized(driver) {
			//Before Enter any value wait some time
			driver.wait(5000);
		}

		driver.findElement(By.id("input-email")).sendKeys("sachindongare4467@gmail.com");

		synchronized(driver) {

			//			Wait after enter some time
			driver.wait(5000);
		}

		driver.quit();
	}



}
