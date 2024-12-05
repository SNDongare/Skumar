package SeleniumPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeBrowserWindow {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		Dimension d=new Dimension(1500, 900);
		
		driver.manage().window().setSize(d);

//		driver.navigate().to("https://tutorialsninja.com/demo/");

	}

}
