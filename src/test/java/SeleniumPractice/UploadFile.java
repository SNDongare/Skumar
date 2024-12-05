package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");

			Thread.sleep(2000);

//			driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\DELL\\Desktop\\Adhar addressside.jpg");

			
			
			//Upload the file from Project
			
			String projectPath = System.getProperty("user.dir");
			
			driver.findElement(By.id("uploadfile")).sendKeys(projectPath+"\\Files\\Error message.PNG");
			Thread.sleep(2000);
//			driver.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	
		
	}}