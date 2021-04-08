package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
public WebDriver driver;

public Summary(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//a[@title='Proceed to checkout']")
private WebElement checkout;
@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
private WebElement checkout2;

public WebElement getCheckout2() {
	return checkout2;
}

public WebElement getCheckout() {
	return checkout;
}

}
