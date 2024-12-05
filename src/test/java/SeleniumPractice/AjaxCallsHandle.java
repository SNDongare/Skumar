package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AjaxCallsHandle {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.className("dropbtn")).click();


		//To Handle Ajax call by using Waiting mechanism
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement facebookButton = driver.findElement(By.linkText("Facebook"));
		WebElement faceBookOption = wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.linkText("Facebook"))));

		faceBookOption.click();
		
		driver.close();

	}

}
