package com.yaj;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Horizontal_Hari {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/horizontal_slider");
			driver.manage().window().maximize();
			
			WebElement hori = driver.findElement(By.xpath("//input[@type='range']"));
			
			hori.sendKeys(Keys.END);
			
	}

}
