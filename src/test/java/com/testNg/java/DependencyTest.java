package com.testNg.java;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test(priority = -3)
	public void mobile() {
	System.out.println("moblie");
	}
	@Test(priority = -1,enabled = true)
	public void laptop() {
		System.out.println("laptop");
	}
	@Test(dependsOnMethods = "laptop")
	public void tv() {
		System.out.println("tv");
	}
	@Test(priority = 4)
	private void electronics() {
		System.out.println("Electronics");
	}
}
