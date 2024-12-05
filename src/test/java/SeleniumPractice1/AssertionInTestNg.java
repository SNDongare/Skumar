package SeleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNg {

	
	@Test
	public void Test1() {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");

		String actualTitle=driver.getTitle();
		
		SoftAssert sAssert= new SoftAssert();
		sAssert.assertEquals(actualTitle, "Your Store");
		
		driver.findElement(By.name("search")).sendKeys("HP");
		
		driver.findElement(By.xpath("(//button[contains(@class,'btn-default')])[1]")).click();
		
		boolean result=driver.findElement(By.linkText("HP LP3065")).isDisplayed();
		
		Assert.assertTrue(result);
		sAssert.assertAll();
		driver.quit();
		
		
	}
	
	//Hard Assertions in TestNg
}


