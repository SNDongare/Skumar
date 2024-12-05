package reinsurance.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage{
	public static WebDriver driver;

	
	
	@FindBy(xpath="//span[@class='oxd-topbar-header-breadcrumb']")
	WebElement dashboardPage;

	

	
	
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	public String retriveDashboardName() {
		String actualDashboardName = dashboardPage.getText();
		
		return actualDashboardName;
	}

}