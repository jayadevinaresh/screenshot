package com.yaj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Locator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		    // id locator- #
		driver.findElement(By.cssSelector("#email")).sendKeys("jayade@gmail.com");
		
		    // class locator- .
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("6hsbhygdu");
		
		    // locate by name and value
		WebElement createnew = driver.findElement(By.cssSelector("a[rel='async']"));
		createnew.click();
		
		Thread.sleep(2000);
		
		     // prefix----  ^
		WebElement firstname = driver.findElement(By.cssSelector("[class^='inputtext _58mg _5dba']"));
		firstname.sendKeys("jai");
		Thread.sleep(2000);
		
		     // suffix---- $
		WebElement surname = driver.findElement(By.cssSelector("[name$='astname']"));
		surname.sendKeys("dev");
		Thread.sleep(2000);
		
		    // contains(middle words in sequence order)----  *
		WebElement mob = driver.findElement(By.cssSelector("[aria-label*='number or email']"));
		mob.sendKeys("6543894567");
		
		
		}
	}

