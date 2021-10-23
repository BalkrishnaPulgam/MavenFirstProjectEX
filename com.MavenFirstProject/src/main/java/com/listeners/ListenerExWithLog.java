package com.listeners;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerExWithLog implements ITestListener {

	private Logger log=Logger.getLogger(ListenerExWithLog.class);
	public void onFinish(ITestContext result) {
		log.info("Test suite is finished with execution");
		
	}

	public void onStart(ITestContext result) {
		log.info("Test suite is ready to start execution");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailure(ITestResult result) {
		log.info("TestCase failed with name: "+ result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		log.info("TestCase skipped with name: "+ result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		log.info("TestCase started with name: "+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		log.info("TestCase passed with name: "+ result.getName());
		
	}

}
