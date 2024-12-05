package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.navigate().to("https://omayo.blogspot.com/");

		WebElement searchEle = driver.findElement(By.name("search"));

		Actions actions=new Actions(driver);

		//Right Click Actions
		//		WebElement searchEle = driver.findElement(By.name("search"));
		//		actions.contextClick(searchEle).build().perform();


		//Double Click Actions

		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[normalize-space()='Double click Here']"));
		actions.doubleClick(doubleClickBtn).build().perform();

		Thread.sleep(3000);

		driver.close();

	}

}
