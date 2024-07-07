package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	public static void main(String args[]) {
		//1.configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
	
		//2.launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("https://www.flipkart.com/");
		
		//maximize
		driver.manage().window().maximize();
	
		//4.to click on login btn using xpath
		WebElement loginbtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		loginbtn.click();
		
		//5.to find email element using xpath
		WebElement email1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email1.sendKeys("abc@gmail.com");
	}
}
