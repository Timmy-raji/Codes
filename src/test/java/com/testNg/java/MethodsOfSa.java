package com.testNg.java;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MethodsOfSa {
	@BeforeTest
	public void mobile() {
		System.out.println("before test");
		}
		@BeforeSuite
		static public void laptop() {
			System.out.println("before suite");
		}
		@BeforeClass
		public void tv() {
			System.out.println("before class");
}      
		@Test
		public void mobile1() {
			System.out.println("test");
			}
			@BeforeMethod
			static public void laptop1() {
				System.out.println("before method");
			}
			@AfterMethod
			public void tv1() {
				System.out.println("after method");
	}  @AfterClass
			private void electronics() {
				System.out.println("after class");
			}
	@AfterTest
	private void electronics1() {
		System.out.println("after test");
	}
	@AfterSuite
	private void electronics2() {
		System.out.println("after suite");
	}
}