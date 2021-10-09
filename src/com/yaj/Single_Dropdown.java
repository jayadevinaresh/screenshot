package com.yaj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\NARESHKUMAR\\\\Jaya-eclipseWorkspace\\\\Selenium_Concepts\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		
		username.sendKeys("jayanaresh@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("246963");
		
		//WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		//login.click();
		
		WebElement createnew = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createnew.click();
		
		Thread.sleep(4000);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("jaya");
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("devi");
		
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mobile.sendKeys("652987655");
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("8unbg5");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByValue("16");
		Thread.sleep(6000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByValue("10");
		
		Thread.sleep(3000);
		
		TakesScreenshot a=(TakesScreenshot)driver;
		File source = a.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\pic2.png");
		FileUtils.copyFile(source, destination);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByIndex(2);
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
