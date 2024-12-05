package SeleniumPractice;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();

		String downloadFilePath = System.getProperty("user.dir");

		EdgeOptions options = new EdgeOptions();
		HashMap<String, Object> edgePrefs = new HashMap<>();
		edgePrefs.put("profile.default_content_settings.popups", 0);
		edgePrefs.put("download.default_directory", downloadFilePath);
		options.setExperimentalOption("prefs", edgePrefs);

		WebDriver driver = new EdgeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page7.html");

		driver.findElement(By.linkText("ZIP file")).click();        
		Thread.sleep(5000); // Adjust sleep time if needed


		File file=new File(downloadFilePath+"\\DownloadDemo-master.zip");
		
		if(file.exists()) {
			System.out.println("File got successfully downloaded");
		}
		else
		{
			System.out.println("File is not downloaded");
		}

		driver.close();
	}
}
