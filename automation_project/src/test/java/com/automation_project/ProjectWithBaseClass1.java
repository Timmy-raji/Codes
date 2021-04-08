package com.automation_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProjectWithBaseClass1 extends com.project.baseclass.BaseClass {
	public static WebDriver driver;
public static void main(String[] args) throws Throwable {	
	
		driver = getBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		getWebsite("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickElement(signin);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		enterText(email, "tharu@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		enterText(password, "Tharunika");

		WebElement login = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		clickElement(login);

		WebElement tshirt1 = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickElement(tshirt1);

		WebElement tshirt = driver.findElement(By.xpath("//img[contains(@title,'Faded Short')]"));
		mouseActions(tshirt, "mouseover");

		WebElement quickview = driver.findElement(By.xpath("//span[text()='Quick view']"));
		clickElement(quickview);
		frames("index", "0");

		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickElement(plus);

		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']"));
		clickElement(size);
		dropDown(size, "value", "3");
		
		WebElement blue = driver.findElement(By.xpath("//a[@title='Blue']"));
		clickElement(blue);
		WebElement submit = driver.findElement(By.xpath("//button[@name='Submit']"));
		clickElement(submit);
		WebElement submit1 = driver.findElement(By.xpath("//button[@name='Submit']"));
		clickElement(submit1);
		frame("defaultcontent");

		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickElement(checkout);

		WebElement checkout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickElement(checkout1);

		WebElement address = driver.findElement(By.xpath("//button[@name='processAddress']"));
		clickElement(address);

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickElement(checkbox);
		WebElement process = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickElement(process);

		WebElement payment = driver.findElement(By.xpath("(//p[@class='payment_module'])[2]"));
		clickElement(payment);
		
		WebElement bank = driver.findElement(By.xpath("//h3[text()='Check payment']"));
		scrollToElement(bank);
		screenShot("checkpay");

		WebElement button = driver.findElement(By.xpath("//button[contains(@class,'button btn btn')]"));
		clickElement(button);
		WebElement orders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		clickElement(orders);
		closeTab();
	}
}
