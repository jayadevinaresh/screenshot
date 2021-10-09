package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_Phptravels {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://phptravels.com/");
		
		Actions act=new Actions(driver);
		Robot r=new Robot();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement features = driver.findElement(By.xpath("//span[text()='Features']"));
		act.moveToElement(features).build().perform();
		
		WebElement hotel_module = driver.findElement(By.xpath("//a[text()='Hotels Module']"));
		hotel_module.click();
		
		WebElement flow = driver.findElement(By.xpath("//h2[text()='Hotels booking module flow']"));
		String text1 = flow.getText();
		System.out.println(text1);
		
		js.executeScript("arguments[0].scrollIntoView();", flow);
		
		WebElement overview_btn = driver.findElement(By.xpath("(//a[@href='https://phptravels.com/demo'])[2]"));
		act.click(overview_btn).build().perform();
		
		WebElement front_end = driver.findElement(By.xpath("(//h3[@class='text-center'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", front_end);
		String text = front_end.getText();
		System.out.println(text);
		
		WebElement username = driver.findElement(By.xpath("(//div[@class='row'])[5]"));
		String text2 = username.getText();
		System.out.println(text2);
		
		
		
		
	}

}
