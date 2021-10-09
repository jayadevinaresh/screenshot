package com.yaj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Hari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\NARESHKUMAR\\\\Jaya-eclipseWorkspace\\\\Selenium_Concepts\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement states = driver.findElement(By.xpath("//select[@name='States']"));
		Select s=new Select(states);
		boolean a = s.isMultiple();
		System.out.println(a);
		
		List<WebElement> opt = s.getOptions();
		for (WebElement all : opt) {
			String text = all.getText();
			System.out.println(text);
			
		}
		System.out.println("-------------------------------");
		int size = opt.size();
		System.out.println(size);
		System.out.println("------------------------------");
		
		s.selectByIndex(2);
		s.selectByValue("Texas");
		s.selectByVisibleText("Pennsylvania");
		
		List<WebElement> select = s.getAllSelectedOptions();
		for (WebElement one : select) {
			String  text1 = one.getText();
			System.out.println(text1);
			
		}
		
		System.out.println("----------------------------");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text2 = firstSelectedOption.getText();
		
		System.out.println(text2);
		
		Thread.sleep(4000);

		s.deselectByIndex(2);
		
		s.deselectAll();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}
}
