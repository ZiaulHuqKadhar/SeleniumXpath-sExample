package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech {
	public static void main(String args[]) {
		//1.configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
	
		//2.launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//maximize
		driver.manage().window().maximize();
		
		//4.to click interview element using xpath
		WebElement interview = driver.findElement(By.xpath("(//i[@class='fas fa-minus'])[1]"));
		interview.click();
		
		//5.to click cts element using xpath
		WebElement cts = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		cts.click();
	}
}
