package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyAddress {
public WebDriver driver;

public VerifyAddress(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//button[@name='processAddress']")
private WebElement address;

public WebElement getAddress() {
	return address;
}
}
