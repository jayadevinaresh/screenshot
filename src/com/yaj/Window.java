package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions act=new Actions(driver);
		act.contextClick(mobile).build().perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		act.contextClick(bestseller).build().perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN
				);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		act.contextClick(fashion).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(4000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		WebElement cust_service = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		act.contextClick(cust_service).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String all_windows : windowHandles) {
		 
			String title = driver.switchTo().window(all_windows).getTitle();
			System.out.println(title);
		}
		
		String s="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		
		
		for (String single : windowHandles) {
			
			if (driver.switchTo().window(single).getTitle().equals(s)) {
				
				break;
				
			}
			
			
			
			
		}
				
			
			
			
			
			
			
		}

	}


