package reinsurance.qa.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	private int count=0;
	private final int maxtry=2;
	@Override
	public boolean retry(ITestResult result) {

		if (count<maxtry)
		{
			count++;
			return true;
			}
		return false;
		}

}