package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getCurrentURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://tutorialsninja.com/demo/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("MacBook")).click();
		
		Thread.sleep(4000);
		
	String currentPageURL = driver.getCurrentUrl();
	
	System.out.println(currentPageURL);
	
	driver.quit();
	}

}
