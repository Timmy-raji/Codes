package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
public WebDriver driver;

	public Homepage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	
	public WebElement getSignin() {
		return signin;
	}
	
}
