package com.yaj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			
			WebElement first_frm = driver.findElement(By.xpath("//iframe[@id='frame1']"));
			driver.switchTo().frame(first_frm);
			
			WebElement tex = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
			String text = tex.getText();
			System.out.println(text);
			
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			
			WebElement second_frm = driver.findElement(By.xpath("//iframe[@id='frame2']"));
			driver.switchTo().frame(second_frm);
			WebElement tex2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			String text2 = tex2.getText();
			System.out.println(text2);
			
			
			
			
			
			
			

	}

}
