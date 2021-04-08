package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentConfirm {
	public WebDriver driver;

	public PaymentConfirm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//p[@class='payment_module'])[2]")
	private WebElement payByCheck;

	public WebElement getPayByCheck() {
		return payByCheck;
	}
	@FindBy(xpath = "//p[contains(text(),'Check owner and')]")
	private WebElement scroll;

	public WebElement getScroll() {
		return scroll;
	}
	
}
