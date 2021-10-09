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

public class Methods_Selen {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("ind@gmail.com");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("675432");
		Thread.sleep(2000);
		
		
		
		
		WebElement createnew = driver.findElement(
				By.xpath("(//a[@role='button'])[2]"));

		createnew.click();

		Thread.sleep(4000);

		WebElement firstname = driver.findElement(By.xpath("(//input[@aria-required='true'])[1]"));

		firstname.sendKeys("jaya");

		WebElement surname = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));

		surname.sendKeys("devi");
		Thread.sleep(5000);
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));

		mobile.sendKeys("9977665544");
		
		Thread.sleep(2000);

		TakesScreenshot a=(TakesScreenshot) driver;
		File source = a.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\pic1.png");
		FileUtils.copyFile(source, destination);	

		WebElement pass = driver.findElement(By.xpath("//input[contains(@data-type,\"password\")]"));

		pass.sendKeys("uytgdfev");


firstname.clear();



	}

	
}
