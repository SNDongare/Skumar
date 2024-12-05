package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.htmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement sourceEle = driver.findElement(By.id("box1"));
		
		WebElement targetEle = driver.findElement(By.id("box101"));
		
		
		
		Actions actions=new Actions(driver);
		
		actions.dragAndDrop(sourceEle, targetEle).build().perform();
		
		driver.close();
		
		

	}

}
