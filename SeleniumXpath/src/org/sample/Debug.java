package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String args[]) throws InterruptedException {
		//1.browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
		
		//2.upcasting
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("http://www.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//4.to find email element
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Selenium");
		
		//5.to find pwd element
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("12345");
		
		//6.to click on create new acc btn
		WebElement newaccBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		newaccBtn.click();
		
		Thread.sleep(3000);
		
		//7.to click on male radio btn
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
	}
}
