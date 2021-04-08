package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public WebDriver driver;

	public Shipping(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	public WebElement getCheckbox() {
		return checkbox;
	}
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement delivery;

	public WebElement getDelivery() {
		return delivery;
	}
	
}
