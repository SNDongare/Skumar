package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait15 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.className("dropdown")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		WebElement faceBookOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
		faceBookOption.click();
		
//		driver.findElement(By.linkText("Facebook")).click();


		driver.quit();

	}

}
