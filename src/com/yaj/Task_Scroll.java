package com.yaj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
//			js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
//			
//			js.executeScript("window.scrollBy(0,-2078)");
			
			WebElement gas= driver.findElement(By.xpath("//span[text()='Gas stoves']"));
			js.executeScript("arguments[0].scrollIntoView();",gas);
			Thread.sleep(2000);
			
			WebElement baby = driver.findElement(By.xpath("//span[text()='Baby wishlist']"));
			js.executeScript("arguments[0].scrollIntoView();", baby);
			
	}
}
