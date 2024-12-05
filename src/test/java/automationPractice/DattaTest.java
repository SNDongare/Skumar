package automationPractice;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DattaTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fitpeo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,300);");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		Actions act=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-index='0' and contains(@class, 'MuiSlider-thumb')]")));
		System.out.println(slider.getLocation());
		act.dragAndDropBy(slider, 92,0).perform();
		System.out.println(slider.getLocation());
		Thread.sleep(5000);
		WebElement textfield=driver.findElement(By.xpath("//div[contains(@class, 'MuiInputBase-root')]//input[@type='number']"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].value = '560';", textfield);


		List<String> targetCPTCodes = Arrays.asList("CPT-99091", "CPT-99453", "CPT-99454","CPT-G2012");


		List<WebElement> cptElements = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 inter css-1s3unkt']"));


		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < cptElements.size(); i++) {

			String cptText = cptElements.get(i).getText();

			if (targetCPTCodes.contains(cptText)) {

				System.out.println(cptText);
				checkboxes.get(i).click();



			}
		}
		driver.quit();
	}


}		















/*
 * List<WebElement> listCPTid =
 * driver.findElements(By.className("css-1s3unkt")); for(WebElement
 * value:listCPTid) { String CPT_name=value.getText(); //
 * System.out.println(CPT_name);
 * //if(CPT_name.equals("CPT-99453")||CPT_name.equals("CPT-99091")||
 * CPT_name.equals("CPT-99454")||CPT_name.equals("CPT-99474")){ List<WebElement>
 * checkbox = driver.findElements(By.
 * xpath("//div[@class='MuiBox-root css-rfiegf']//input[@type='checkbox']"));
 * for(WebElement chk:checkbox) { if(!chk.isSelected()) { Thread.sleep(2000);
 * if(CPT_name.equals("CPT-99453")||CPT_name.equals("CPT-99091")||
 * CPT_name.equals("CPT-99454")||CPT_name.equals("CPT-99474")){ chk.click(); }
 * System.out.println("=============="); System.out.println(chk.isSelected());
 * 
 * 
 * } } }
 */


//		driver.quit();
//	}







