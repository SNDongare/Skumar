package reinsurance.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reinsurance.qa.utils.TestUtility;

public class LoginPage {
	

	public WebDriver driver;
	
	TestUtility testUtility=new TestUtility();
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userNameField;

	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordField;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement loginErrorMessage;

	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String usernameText) {
		 userNameField.sendKeys(usernameText);
		
		
	}
	public void password(String passwordText) {
		passwordField.sendKeys(passwordText);
	}
	public DashBoardPage clickOnLoginButton() {
		loginButton.click();
		return new DashBoardPage(driver);
		
	
		
	}
	public String retriveLoginErrorMessage() {
		String actualLoginErrorMessage = loginErrorMessage.getText();
		return actualLoginErrorMessage;
	}
	
}