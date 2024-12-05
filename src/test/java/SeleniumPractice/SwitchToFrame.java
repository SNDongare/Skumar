package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://the-internet.herokuapp.com/iframe");
		
		WebElement frmaeT = driver.findElement(By.id("mce_0"));
		
		driver.switchTo().frame(frmaeT);
		
		String frameContent = driver.findElement(By.id("tinymce")).getText();
		
		System.out.println("The value of frame is :"+frameContent);
	}

}
