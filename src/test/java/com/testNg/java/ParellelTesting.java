package com.testNg.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class ParellelTesting {

	@Test
	public void a(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VISHWANATHAN\\eclipse-workspace\\testNg.java\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void b() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VISHWANATHAN\\eclipse-workspace\\testNg.java\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
