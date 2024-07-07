package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfb {
	public static void main(String args[]) {
		//1.configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
	
		//2.to launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//3.to launch url 
		driver.get("http://www.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//4.to find xpath for email element
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("abc@gmail.com");
		
		//5.to find xpath for password element
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("12345");
		
		//6.to click xpath for login button
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}
}
