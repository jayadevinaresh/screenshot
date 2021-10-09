package com.yaj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://demoqa.com/alerts");
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alert1.click();
		Alert bt1 = driver.switchTo().alert();
		bt1.accept();
		Thread.sleep(2000);
		
		WebElement alert2 = driver.findElement(By.id("timerAlertButton"));
		alert2.click();
		Thread.sleep(6000);

		Alert bt2 = driver.switchTo().alert();
		bt2.accept();
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.id("confirmButton"));
		confirm.click();
		Alert bt3 = driver.switchTo().alert();
		bt3.dismiss();
		Thread.sleep(2000);
		
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		Alert bt4 = driver.switchTo().alert();
		String text = bt4.getText();
		System.out.println(text);
		Thread.sleep(2000);
		bt4.sendKeys("welcome");
		Thread.sleep(2000);
		bt4.accept();
	
	
	
	
	
	
	}

}
