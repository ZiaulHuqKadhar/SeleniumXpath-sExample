package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowser {
	public static void main(String args[]) {
		//1.configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
	
		//2.launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("http://www.amazon.in/");
		
		//maximize
		driver.manage().window().maximize();
		
		//4.to find search element using xpath
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("vivo y15 moblies");
	
		//5.to click on search btn using xpath
		WebElement searchbtn = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		searchbtn.click();
	}
}
