package reinsurance.qa.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import reinsurance.qa.utils.ExtentReporters;
import reinsurance.qa.utils.Utilities;

public class MyListeners implements ITestListener{
	ExtentReports extentReport;
	ExtentTest extentTest;
	String testName;
	@Override
	public void onStart(ITestContext context) {
		extentReport = ExtentReporters.generateExtentReport();
	}
	@Override
	public void onTestStart(ITestResult result) {
		 testName = result.getName();
		extentTest = extentReport.createTest(testName);
		extentTest.log(Status.INFO, testName+" started executing");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, testName+" got successfully executed");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver=null;
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		String destinationScreenShotPath= Utilities.captureScreenShot(driver, testName);
		
		extentTest.addScreenCaptureFromPath(destinationScreenShotPath);
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.FAIL, testName+" got Failed");
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.INFO, result.getThrowable());
		extentTest.log(Status.INFO, testName+" got skipped");
	}
	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
		String pathOfExtentReport=System.getProperty("user.dir")+"/reports/ExtentReportManager.html";
		File extenReport=new File(pathOfExtentReport);
		try {
			Desktop.getDesktop().browse(extenReport.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
