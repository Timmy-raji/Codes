package com.pom.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesSelect {
public WebDriver driver;
@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
private WebElement tshirt;
@FindBy(xpath = "//img[contains(@title,'Faded Short')]")
private WebElement faddedShort;
@FindBy(xpath = "//span[text()='Quick view']")
private WebElement quickView;
@FindBy(xpath = "//i[@class='icon-plus']")
private WebElement plusIcon;
@FindBy(xpath = "//select[@name='group_1']")
private WebElement selectSize;
@FindBy(xpath = "//a[@title='Blue']")
private WebElement selectColour;
@FindBy(xpath = "//button[@name='Submit']")
private WebElement addCart;
@FindBy(xpath = "//button[@name='Submit']")
private WebElement submit;


public WebElement getTshirt() {
	return tshirt;
}
public WebElement getFaddedShort() {
	return faddedShort;
}
public WebElement getQuickView() {
	return quickView;
}
public WebElement getPlusIcon() {
	return plusIcon;
}
public WebElement getSelectSize() {
	return selectSize;
}
public WebElement getSelectColour() {
	return selectColour;
}
public WebElement getAddCart() {
	return addCart;
}
public WebElement getSubmit() {
	return submit;
}

public DressesSelect(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}


}
