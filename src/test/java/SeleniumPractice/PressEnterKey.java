package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PressEnterKey {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(1000);
		
	
		driver.findElement(By.name("search")).sendKeys("imac");
		
		driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
		
	}

}
