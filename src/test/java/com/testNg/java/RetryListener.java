package com.testNg.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IRetryAnalyzer,IAnnotationTransformer{
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryListener.class);
	}
	int count = 0,limit =4;
	public boolean retry(ITestResult result) {
		if (count<limit) {
			count++;
			return true;
		}
		return false;
	}

}
