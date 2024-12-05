package reinsurance.qa.Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTables {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
			driver.get("https://testuserautomation.github.io/WebTable/");
			// Method 1
			String before_xpath = "//table/tbody/tr["; 
			String after_xpath = "]/td[2]";
			
			List rows = driver.findElements(By.xpath("//table/tbody/tr"));
			
			int rowSize = rows.size();
			
			System.out.println(rowSize);
			
			for (int i = 2; i <= rowSize; i++) {
				
			String firstNames = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			
			System.out.println(firstNames);
			// Now click the checkBox where first Name would be Will
			if (firstNames.contains("Will")) {
			// click the checkBox
			driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[1]/input")).click(); 
			System.out.println("candidate has been selected");
			break;
			}
			}

	}

}
