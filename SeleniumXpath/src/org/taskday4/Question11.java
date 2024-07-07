package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question11{
	public static void main(String args[]) throws InterruptedException{
		//1.browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
		
		//2.upcasting
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("https://www.flipkart.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//4.to click on login btn in flipcart
		WebElement loginbtn = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginbtn.click();
		
		Thread.sleep(3000);
		//5.to find email element
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("ziya@gmail.com");
		
		Thread.sleep(3000);
		//6.to find pwd element
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123456");
	}
}
