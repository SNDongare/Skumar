package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearTextFieldUsingClearMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("textbox1")).clear();
		
		Thread.sleep(2000);

		driver.quit();
	}

}
