package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
	public static void main(String args[]) throws InterruptedException {
		//1.browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
		
		//2.upcasting 
		WebDriver driver = new ChromeDriver();
		
		//3.to launch url
		driver.get("https://www.snapdeal.com/");
		
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//4.to find search box snap deal
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphone mobile phone");
		Thread.sleep(3000);
		
		//5.to click on 1st element
		WebElement btn = driver.findElement(By.xpath("(//span[contains(text(),'iphone mobile phone')])[1]"));
		btn.click();
	}
}
