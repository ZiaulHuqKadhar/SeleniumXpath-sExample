package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEmailText {
	public static void main(String args[]) {
		//1.browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
		
		//2.upcasting
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("https://www.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//4.to find the text xpath for create new account button
		WebElement newAccBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		//using javascript executor.
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",newAccBtn);
		newAccBtn.click();
		
		
	}
}
