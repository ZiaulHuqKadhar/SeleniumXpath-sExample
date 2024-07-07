package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertext {
public static void main(String[] args) {
	//1.browser configuration
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
	
	//2.upcasting
	WebDriver driver = new ChromeDriver();
	
	//3.launch url
	driver.get("https://www.facebook.com/");
	
	//window maximize
	driver.manage().window().maximize();
	
	//4.to find the element for facebook helps text by using contains text
	WebElement txt = driver.findElement(By.xpath("//h2[contains(text(),'Connect')]"));
	
//	//getText()
	String text = txt.getText();
	System.out.println(text);
	
	
	
	//6.to find email text field
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Selenium");
	
	String attribute = email.getAttribute("class");
	System.out.println(attribute);
	
	String attribute2 = email.getAttribute("value");
	System.out.println(attribute2);
}
}
