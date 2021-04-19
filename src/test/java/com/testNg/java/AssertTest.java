package com.testNg.java;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	@Test
	private void credentials1() {
		String actual = "smith";
		String expected = "vichu";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected);
		System.out.println("process completed");		
				

	}

	@Test
	private void credentials() {
	String actual = "smith";
	String expected = "vichu";
			
			//Assert.assertNotEquals(actual, expected);
			Assert.assertEquals(actual, expected);
			System.out.println("process completed");

}
}
