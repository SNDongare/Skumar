package reinsurance.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporters {

	public static ExtentReports generateExtentReport() {
		ExtentReports extentReports=new ExtentReports();

		File extentReportFile=new File(System.getProperty("user.dir")+"\\test-output\\ExtentReports\\extentReport.html");
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter(extentReportFile);
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Automation Test Result");
		sparkReporter.config().setDocumentTitle("AUT Test Reports");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");

		extentReports.attachReporter(sparkReporter);

		Properties configProp=new Properties();
		File configPropFile=new File(System.getProperty("user.dir")+"/src/main/java/reinsurance/qa/config/Config.Properties");
		try {
			FileInputStream fis=new FileInputStream(configPropFile);
			configProp.load(fis);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		extentReports.setSystemInfo("Application url", configProp.getProperty("url"));
		extentReports.setSystemInfo("Browser Name", configProp.getProperty("browserName"));
		extentReports.setSystemInfo("Email", configProp.getProperty("validEmail"));
		extentReports.setSystemInfo("Password", configProp.getProperty("password"));
		extentReports.setSystemInfo("Operating System", System.getProperty("os.name"));
		extentReports.setSystemInfo("UserName", System.getProperty("user.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));

		return extentReports;

	}

}
