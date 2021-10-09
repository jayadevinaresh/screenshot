package com.yaj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Up {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor	js=(JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,3078);");
		
		//Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,-2078);");
		//Thread.sleep(2000);
		
		//to scroll full page
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		
		//in amazon page find element
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//mob.click();
		
		js.executeScript("arguments[0].click();", mob);
		
		js.executeScript("window.scrollBy(0,5000);");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-3000);");
		
		WebElement smartphone = driver.findElement(By.xpath("//h2[text()='Xiaomi smartphones']"));
		
		js.executeScript("arguments[0].scrollIntoView();",smartphone );
		
		
		       // introduce alert
		
		
		
		js.executeScript("alert('welcome');");
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		
		
		
		
}
}
