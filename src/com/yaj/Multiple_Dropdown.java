package com.yaj;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\NARESHKUMAR\\\\Jaya-eclipseWorkspace\\\\Selenium_Concepts\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		WebElement states = driver.findElement(By.xpath("//select[@name='States']"));
		Select s=new Select(states);
		boolean a = s.isMultiple();
		System.out.println(a);
		System.out.println("------------------------------------------");
		
		List<WebElement> opt = s.getOptions();
		Iterator<WebElement> ite = opt.iterator();
		
		while (ite.hasNext()) {
			WebElement st = ite.next();
			String text = st.getText();
			System.out.println(text);
		}
		
		s.selectByValue("New York");
		s.selectByIndex(2);
		s.selectByVisibleText("Texas");
		
		System.out.println("------------------------------------------");
		List<WebElement> allselect = s.getAllSelectedOptions();
		
		for (WebElement all : allselect) {
			String text = all.getText();
			System.out.println(text);
			
		}
		Thread.sleep(4000);
		
		
		s.deselectByValue("Texas");
		s.deselectAll();

	}

}
