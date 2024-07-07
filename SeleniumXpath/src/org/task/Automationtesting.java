package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationtesting {
	public static void main(String args[]) {
		//1.configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\workspace\\SeleniumXpath\\driver\\chromedriver.exe");
	
		//2.launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//3.launch url
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//maximize
		driver.manage().window().maximize();
		
		//4.to find 1st name using xpath
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("Ziya");
		
		//5.to find last name using xpath
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("kather");
		
		//6.to find address using xpath
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Anna Nagar,\nChennai.");
		
		//7.to find email using xpath
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("abc@gmail.com");
		
		//8.to find phone using xpath
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("1234567890");
		
		//9(a).to find Gender Male using xpath
		WebElement genderMale = driver.findElement(By.xpath("//input[@value='Male']"));
		genderMale.click();
		
		//9(b).to find Gender FeMale using xpath
		WebElement genderFeMale = driver.findElement(By.xpath("//input[@value='FeMale']"));
		genderFeMale.click();
		
		//10(a).to find Hobbies(Cricket) using xpath
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		checkbox1.click();
		
		//10(b).to find Hobbies(Movies) using xpath
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		checkbox2.click();
				
		//10(c).to find Hobbies(Hockey) using xpath
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@id='checkbox3']"));
		checkbox3.click();
		
		//12(a).to find language using xpath
		WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
		lang.click();
		
		//11(b). to find lang choose (English) using xpath
		WebElement english = driver.findElement(By.xpath("(//li[@class='ng-scope'])[8]"));
		english.click();
		
		//12(a).to find skills using xpath 
		WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
		skill.click();
	}
}