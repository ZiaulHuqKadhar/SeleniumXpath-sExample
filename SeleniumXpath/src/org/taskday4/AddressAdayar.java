package org.taskday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressAdayar {
	public static void main(String[] args) {
		//1.browser configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
		
		//2.upcasting
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		//window maximize
		driver.manage().window().maximize();
		
		//4.to find the element for green tech Green text by using contains text
		WebElement txt = driver.findElement(By.xpath("(//h6[contains(text(),'Greens ')])[1]"));
		WebElement txt1 = driver.findElement(By.xpath("//span[contains(text(),'No:11')]"));
		WebElement txt2 = driver.findElement(By.xpath("//span[contains(text(),'First Street')]"));
		WebElement txt3 = driver.findElement(By.xpath("//span[contains(text(),'padmanabha Nagar,')]"));
		WebElement txt4 = driver.findElement(By.xpath("//span[contains(text(),'Adyar,')]"));
		WebElement txt5 = driver.findElement(By.xpath("//span[contains(text(),'Chennai-600 020.')]"));
		WebElement txt6 = driver.findElement(By.xpath("(//a[contains(text(),'+91 89399 15577')])[1]"));
		WebElement txt7 = driver.findElement(By.xpath("(//a[contains(text(),'contact@greenstechnologys.com')])[1]"));
		
		//getText() field
		String text = txt.getText();
		System.out.println(text);
		
		String text1 = txt1.getText();
		System.out.println(text1);
		
		String text2 = txt2.getText();
		System.out.println(text2);
		
		String text3 = txt3.getText();
		System.out.println(text3);
		
		String text4 = txt4.getText();
		System.out.println(text4);
		
		String text5 = txt5.getText();
		System.out.println(text5);
		
		String text6 = txt6.getText();
		System.out.println(text6);
		
		String text7 = txt7.getText();
		System.out.println(text7);
	}
}
