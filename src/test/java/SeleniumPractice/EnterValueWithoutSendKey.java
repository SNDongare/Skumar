package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterValueWithoutSendKey {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(1000);
		
//		With Send Key Methgod
//		driver.findElement(By.name("search")).sendKeys("imac");
		
		
		//Without send Key Method(Use Java script executor)
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	WebElement searchBox = driver.findElement(By.name("search"));
	
	jse.executeScript("arguments[0].value='imac'", searchBox);
	Thread.sleep(1000);
		
		
		
		
		driver.quit();

	}

}
