package utilities_salesforce;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import sdfc_testcases.Base_test;



public class ListenersUtility extends Base_test implements ITestListener {
	
	 
		
	 

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName());
		
	}

	public void onTestFailure(ITestResult result, String s) {
		try {
			test.log(Status.FAIL, result.getName()).addScreenCaptureFromPath(basicutil.getScreenCapture(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
