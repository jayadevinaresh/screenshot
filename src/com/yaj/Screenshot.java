package com.yaj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("jayadevinaresh@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("34527865");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\pic.png");
		FileUtils.copyFile(source, destination);

		

	}

}
