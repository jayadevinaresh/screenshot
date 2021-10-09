package com.yaj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_A {
	public static void main(String[] args) throws InterruptedException {
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
		
		
		WebElement createnew = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

		createnew.click();

		//Thread.sleep(4000);
		
		       // Implicitly Wait------------------------------------
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement firstname = driver.findElement(By.xpath("(//input[@aria-required='true'])[1]"));

		firstname.sendKeys("jaya");

		
		       // Explicit Wait-------------------------------------------------
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(firstname));
		
		
		WebElement surname = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));

		surname.sendKeys("devi");
		Thread.sleep(5000);
		
		//------------- Fluent Wait-------------------------------------
		
		//Wait wait1=new FluentWait(driver);
		             
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));

		mobile.sendKeys("9977665544");
		
		Thread.sleep(2000);


	}

}
