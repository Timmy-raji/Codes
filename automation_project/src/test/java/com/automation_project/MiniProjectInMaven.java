package com.automation_project;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProjectInMaven {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//Chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[@class='login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("tharu@gmail.com");
	driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement radio = driver.findElement(By.xpath("//div[@id='uniform-id_gender2']"));
	radio.click();
	boolean selected = radio.isSelected();
	System.out.println(selected);
	driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Rajalakshmi");
	driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("M");
	driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Tharunika");
	
	WebElement day = driver.findElement(By.xpath("//select[@name='days']"));	
	Thread.sleep(2000);
	Select sc = new Select(day);
	sc.selectByIndex(21);
	WebElement month = driver.findElement(By.xpath("//select[@name='months']"));	
	Select sc1 = new Select(month);
	sc1.selectByValue("10");
	WebElement year = driver.findElement(By.xpath("//select[@name='years']"));	
	Select sc2 = new Select(year);
	sc2.selectByValue("1987");
	WebElement checkbox = driver.findElement(By.xpath("//input[@name='newsletter']"));
	if (checkbox.isEnabled()==true) {
		System.out.println("true");
		checkbox.click();
	}
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rajalakshmi");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Serco.pv.Ltd.");
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Serco.pv.Ltd.");
	driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Ambattur");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chennai");
	Thread.sleep(3000);

	WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
	Select sc3 =new Select(state);
	sc3.selectByValue("36");
	driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("73101");
	WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
	Select sc4 =new Select(country);
	sc4.selectByValue("21");
	
	driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("No.3/34,tagore st.,ambattur");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9176691777");
	driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("9840241200");
	driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Ambattur,Chennai");
	driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
	Thread.sleep(3000);
	//driver.close();
	
	
	
}
}
