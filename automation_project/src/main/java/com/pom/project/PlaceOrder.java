package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	public WebDriver driver;

	public PlaceOrder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[contains(@class,'button btn btn')]")
	private WebElement confirmOrder;
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement  backToOrders;
	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
	public WebElement getBackToOrders() {
		return backToOrders;
	}
	
}
