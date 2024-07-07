package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String args[]) throws InterruptedException {
		//1.browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
		
		//2.upcasting 
		WebDriver driver = new ChromeDriver();
		
		//3.to launch url
		driver.get("https://www.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//4.to find email 
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		System.out.println(email);
		
		//5.to find pwd
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("123456");
		System.out.println(pwd);
	}
}
