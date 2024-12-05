package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinksOnPage {

	public static void main(String[] args) {
		

		WebDriverManager.edgedriver().setup();

		WebDriver driver=new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement link:allLinks) {
			
			String url = link.getAttribute("href");
			
			if(url==null || url.isEmpty()) {
				System.out.println("The URL is Empty");
				continue;
			}
			
			
			try {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				
				huc.connect();
				
				if(huc.getResponseCode()>=400) {
					
					System.out.println(url+": Is a broken URL");
				}
				else {
					System.out.println(url+": is Valid URL");
				}
				
			} catch (MalformedURLException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
