package com.yaj;

import java.sql.Driver;
import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_pra {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();
			
			WebElement singlefrm = driver.findElement(By.xpath("(//a[@class=\"analystic\"])[1]"));
			singlefrm.click();
			
			WebElement outter = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
			driver.switchTo().frame("singleframe");
			
			WebElement inner = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			inner.sendKeys("welcome");
			
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
			
			
			//multipleframes
			
			
			
			WebElement multiplefrm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
			multiplefrm.click();
			
			WebElement outter1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			driver.switchTo().frame(outter1);
			
			WebElement middle = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			driver.switchTo().frame(middle);
			
			WebElement inner1 = driver.findElement(By.xpath("//input[@type='text']"));
			inner1.sendKeys("yajjas");
	
	
	}

}
