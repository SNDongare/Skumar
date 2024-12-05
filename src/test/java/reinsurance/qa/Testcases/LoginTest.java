package reinsurance.qa.Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import reinsurance.qa.Base.Base;
import reinsurance.qa.pageObjects.DashBoardPage;
import reinsurance.qa.pageObjects.LoginPage;

public class LoginTest extends Base{

	public static WebDriver driver;
	public LoginPage loginPage;
	public DashBoardPage dashBoardPage;

	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		driver=initializeBrowser(prop.getProperty("browserName"));

		Thread.sleep(5000);
	}

	@Test(priority=1)
	public void verifyLoginWithValidCredentials() throws InterruptedException
	{
		 loginPage=new LoginPage(driver);
		loginPage.enterUserName(prop.getProperty("validUserName"));
		loginPage.password(prop.getProperty("validpassword"));
		Thread.sleep(4000);
		dashBoardPage=loginPage.clickOnLoginButton();
		
		Assert.assertEquals(dashBoardPage.retriveDashboardName(),proData.getProperty("expectedLoginErrorMessage"));


	}

	@Test(priority=2)
	public void verifyLogInWithInvalidCredentials() throws InterruptedException
	{	 loginPage=new LoginPage(driver);
		loginPage.enterUserName(proData.getProperty("invaliduserName"));
		loginPage.password(proData.getProperty("invalidpassword"));
		loginPage.clickOnLoginButton();
		Assert.assertEquals(loginPage.retriveLoginErrorMessage(),proData.getProperty("expectedLoginErrorMessage"));

	}
	@Test(priority=3)
	public void verifyLogInWithInvalidUserNameValidPassword() throws InterruptedException
	{ loginPage=new LoginPage(driver);
		loginPage.enterUserName(proData.getProperty("invaliduserName"));
		loginPage.password(prop.getProperty("validpassword"));
		dashBoardPage=loginPage.clickOnLoginButton();
		Assert.assertEquals(loginPage.retriveLoginErrorMessage(),proData.getProperty("expectedLoginErrorMessage"));
	}

	@Test(priority=4)
	public void verifyLogInWithValidUserNameInvalidPassword() throws InterruptedException
	{ loginPage=new LoginPage(driver);
		loginPage.enterUserName(prop.getProperty("validUserName"));
		loginPage.password(proData.getProperty("invalidpassword"));
		loginPage.clickOnLoginButton();
		Assert.assertEquals(loginPage.retriveLoginErrorMessage(),proData.getProperty("expectedLoginErrorMessage"));
	}
	/*@Test(priority=5)
	public void verifyLogInWithBlankEmailandPassword() throws InterruptedException
	{ loginPage=new LoginPage(driver);
		loginPage.clickOnLoginButton();
		Assert.assertEquals(loginPage.retriveLoginErrorMessage(),proData.getProperty("expectedLoginErrorMessage"));
		*/

	}


