package com.qa.utility;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class Listeners extends TestBase implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case execution started :- " + result.getName());
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed :- " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed :- " + result.getName());
		UtilClasses.takeSS(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

}
