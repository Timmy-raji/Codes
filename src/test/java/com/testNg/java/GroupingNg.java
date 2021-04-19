package com.testNg.java;

import org.testng.annotations.Test;

public class GroupingNg {
	@Test(groups ="a",priority = -1)
	public void mobile() {
	System.out.println("moblie");
	}
	@Test(groups ="a",priority = -3)
	public void laptop() {
		System.out.println("laptop");
	}
	@Test(groups ="b")
	public void tv() {
		System.out.println("tv");
	}
	@Test(groups ="b")
	private void electronics() {
		System.out.println("Electronics");
	}
}
