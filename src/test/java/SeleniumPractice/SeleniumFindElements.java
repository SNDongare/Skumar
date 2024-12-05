package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumFindElements {

	@Test
	public static void checkTheDataPresentInListOrNot() throws InterruptedException {
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		Thread.sleep(3000);
		
		driver.findElement(By.className("wikipedia-search-button")).click();
		Thread.sleep(2000);
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
		
		boolean linkFound = false;
		for(WebElement links:allLinks) {
			String actualLinkName = links.getText();
			System.out.println(actualLinkName);
			
			 if (actualLinkName.equalsIgnoreCase("Selenium")) {
	                linkFound = true;
	                System.out.println("Pass: 'Selenium' found in the search results.");
	                break;
	            }
	        }

	        // Assert based on whether "Datta" was found or not
	        if (!linkFound) {
	            System.out.println("Fail: 'Selenium' not found in the search results.");
	            Assert.fail("The expected link 'Selenium' was not found in the search results.");
	        }
	  
		}
		
  	
	}
	
	/*
	 * public static void checkalistOfDetail() throws InterruptedException {
	 * SeleniumFindElements.checkTheDataPresentInListOrNot();
	 * 
	 * 
	 * }
	 */

