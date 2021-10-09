package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Pract {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			Actions act=new Actions(driver);
			act.contextClick(mobile).perform();
			Robot r=new Robot();
			
			
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
				r.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(2000);
				
				String currentUrl = driver.getCurrentUrl();
				System.out.println(currentUrl);
				
				
				 //  window handle
				
				String windowHandle = driver.getWindowHandle();
				System.out.println(windowHandle);
				
				  // windowHandles
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
				
				List<String> li =new ArrayList<String>();
				li.addAll(windowHandles);
				
				Thread.sleep(2000);
				driver.switchTo().window(li.get(1));
				
				String currentUrl2 = driver.getCurrentUrl();
				System.out.println(currentUrl2);
				
	}
			

	}


