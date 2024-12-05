package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RunCommonMethods extends HandleAllAlerts {
	
	public WebDriver driver;
	public RunCommonMethods() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}


	HandleAllAlerts handleAllAlerts=new HandleAllAlerts();
	

	@Test
	public void launchApp() {
		HandleAllAlerts.getTextOfAllert(driver, 10);
}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
