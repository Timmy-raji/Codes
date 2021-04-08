package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
@FindBy(xpath = "//input[@id='email']")
private WebElement email;
@FindBy(xpath = "//input[@id='passwd']")
private WebElement password;
@FindBy(xpath = "//button[@id='SubmitLogin']")
private WebElement login;
public WebDriver getDriver() {
	return driver;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public LoginPage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}




}
