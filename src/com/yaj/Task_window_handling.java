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

public class Task_window_handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/windows");
			driver.manage().window().maximize();
			
			WebElement clickbt = driver.findElement(By.xpath("//a[text()='Click Here']"));
			Actions act=new Actions(driver);
			
			act.contextClick(clickbt).build().perform();
			Thread.sleep(2000);
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
//			String windowHandle = driver.getWindowHandle();
//			String title = driver.switchTo().window(windowHandle).getTitle();
//			System.out.println(title);
			
			Set<String> windowHandles = driver.getWindowHandles();
			for (String one : windowHandles) {
				String text = driver.switchTo().window(one).getTitle();
				System.out.println(text);
				Thread.sleep(2000);
			}
				
				System.out.println("--------------------------------------------");
				
			
			
			WebElement newpage = driver.findElement(By.xpath("//h3[text()='New Window']"));
			String print = newpage.getText();
			System.out.println(print);
			
			String s="The Internet";
			
			for (String check : windowHandles) {
				if (driver.switchTo().window(check).getTitle().equals(s)) {
					break;
					
				}
			}
			
			WebElement mainpage = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
			String mainpgprint = mainpage.getText();
			System.out.println(mainpgprint);
			
			
			
			

	}

}
