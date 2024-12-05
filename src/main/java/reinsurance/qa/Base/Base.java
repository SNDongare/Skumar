package reinsurance.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import reinsurance.qa.utils.Utilities;

public class Base {

	WebDriver driver;
	public Properties prop;
	public Properties proData;

	public Base()
	{
		prop=new Properties();
		File propFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\reinsurance\\qa\\config\\Config.Properties");
		proData=new Properties();
		File proDataFile=new File(System.getProperty("user.dir")+"\\src\\main\\java\\reinsurance\\qa\\testdata\\testdata.properties");
		try {
		FileInputStream fis1=new FileInputStream(proDataFile);
		proData.load(fis1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis=new FileInputStream(propFile);
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public WebDriver initializeBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origns");
			driver=new ChromeDriver(options);
			
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver =new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("Safari"))
		{
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_LOAD_TIME));
		driver.get(prop.getProperty("url"));
		return driver;
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
