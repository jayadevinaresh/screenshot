package com.yaj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boolean_Cond_Ar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement email = driver.findElement(By.id("email"));

			email.sendKeys("ind@gmail.com");

			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("675432");
			Thread.sleep(2000);
			
			
			      // is Displayed
			
			WebElement createnew = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

			createnew.click();

			Thread.sleep(4000);
			
			boolean displayed = createnew.isDisplayed();
			System.out.println(displayed);
			
                          // is enabled
			
			WebElement firstname = driver.findElement(By.xpath("(//input[@aria-required='true'])[1]"));

			firstname.sendKeys("jaya");
			
			boolean enabled = firstname.isEnabled();
			System.out.println(enabled);

			WebElement surname = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));

			surname.sendKeys("devi");
			Thread.sleep(5000);
			WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));

			mobile.sendKeys("9977665544");
			
			
			               // is selected
			WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
			radio.click();
			boolean selected = radio.isSelected();
			System.out.println(selected);

	}

}
