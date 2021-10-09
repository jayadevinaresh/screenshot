package com.yaj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Class {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		WebElement simple = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		simple.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		WebElement conform = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		conform.click();
		driver.switchTo().alert().dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
		prompt.click();
		Thread.sleep(3000);
		Alert alert2 = driver.switchTo().alert();
		String text = alert2.getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		alert2.accept();


		
	}

}
