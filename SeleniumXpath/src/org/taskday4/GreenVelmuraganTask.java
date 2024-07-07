package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenVelmuraganTask {
	public static void main(String[] args) {
		//1.browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
		
		//2.upcasting
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//window maximize
		driver.manage().window().maximize();
		
		//4.to find the text xpath  for create trainer button
		WebElement trainer = driver.findElement(By.xpath("//span[text()='Trainer']"));
		trainer.click();
		
		//4.to find the element for green tech Green text by using contains text
		WebElement txt = driver.findElement(By.xpath("//b[contains(text(),'Velmurugan')]"));
		
		//getText() field
		String text = txt.getText();
		System.out.println(text);
	}
}
