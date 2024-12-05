package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		
		String attributeValue = driver.findElement(By.id("textbox1")).getAttribute("id");
		
		System.out.println(attributeValue);
		
		
		
		driver.quit();

	}

}
