package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle_Arun {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
			Actions act=new Actions(driver);
			act.contextClick(mobile).build().perform();
			
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			WebElement bestseller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
			act.contextClick(bestseller).build().perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
			act.contextClick(fashion).build().perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			
			WebElement cust_service = driver.findElement(By.xpath("//a[text()='Customer Service']"));
			act.contextClick(cust_service).build().perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			
			
			   //windows handling
			
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			String title = driver.switchTo().window(windowHandle).getTitle();
			System.out.println(title);
			
			    //windows Handles-----> return all active window id
			
			Set<String> activewindow = driver.getWindowHandles();
			
			             //iterate
			
//			for (String str : activewindow) {
//				String activeone = driver.switchTo().window(str).getTitle();
//				System.out.println(activeone);
//				Thread.sleep(2000);
//				
//			}
//			
//			String s="Amazon.in Bestsellers: The most popular items on Amazon";
//			for (String str : activewindow) {
//				if (driver.switchTo().window(str).getTitle().equals(s)) {
//					break;
//				}
//				
//			}
//			
//			driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
 			
			
			
			     //othermethod for iterate
			
			
			Iterator<String> ite = activewindow.iterator();
//			while (ite.hasNext()) {
//				String next = ite.next();
//				String full = driver.switchTo().window(next).getTitle();
//				System.out.println(full);
//			}
			
			
			
			String Amazon_home = ite.next();
			String Fashion = ite.next();
			String Bestsellers = ite.next();
			String Mobiles = ite.next();
			
			String al = driver.switchTo().window(Mobiles).getTitle();
			System.out.println(al);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
			
	}

}
