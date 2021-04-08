package com.pom.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PomProject extends com.project.baseclass.BaseClass{
	public static WebDriver driver;
public static void main(String[] args) throws Throwable {
	driver = getBrowser("chrome");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	getWebsite("http://automationpractice.com/index.php");
	Homepage home = new Homepage(driver);
	WebElement signin = home.getSignin();clickElement(signin);
	
	LoginPage loginpage = new LoginPage(driver);
	WebElement email = loginpage.getEmail();enterText(email, "tharu@gmail.com");
	WebElement password = loginpage.getPassword();enterText(password, "Tharunika");
	WebElement login = loginpage.getLogin();clickElement(login);
	
	DressesSelect dress = new DressesSelect(driver);
	WebElement tshirt = dress.getTshirt();clickElement(tshirt);
	WebElement faddedShort = dress.getFaddedShort();
	mouseActions(faddedShort, "mouseover");
	WebElement quickView = dress.getQuickView();clickElement(quickView);
	frames("index", "0");
	WebElement plusIcon = dress.getPlusIcon();clickElement(plusIcon);
	WebElement selectSize = dress.getSelectSize();clickElement(selectSize);
	dropDown(selectSize, "value", "3");
	WebElement selectColour = dress.getSelectColour();clickElement(selectColour);
	WebElement addCart = dress.getAddCart();clickElement(addCart);
	WebElement submit = dress.getSubmit();clickElement(submit);
	frame("defaultcontent");
	Thread.sleep(2000);
	Summary summary = new Summary(driver);
	WebElement checkout = summary.getCheckout();clickElement(checkout);
	summary.getCheckout2().click();
	VerifyAddress verifyaddress = new VerifyAddress(driver);
	Thread.sleep(3000);
	WebElement address = verifyaddress.getAddress();clickElement(address);
	Shipping shipping = new Shipping(driver);
	WebElement checkbox = shipping.getCheckbox();clickElement(checkbox);
	WebElement delivery = shipping.getDelivery();clickElement(delivery);
	PaymentConfirm pay = new PaymentConfirm(driver);
	WebElement payByCheck = pay.getPayByCheck();clickElement(payByCheck);
	WebElement scroll = pay.getScroll();scrollToElement(scroll);
	Thread.sleep(2000);
	screenShot("checkpay1");
	PlaceOrder orderPlaced = new PlaceOrder(driver);
	orderPlaced.getConfirmOrder().click();
	WebElement backToOrders = orderPlaced.getBackToOrders();clickElement(backToOrders);
	closeTab();
	
	
	
	
	
	
	
	
	
}
}
