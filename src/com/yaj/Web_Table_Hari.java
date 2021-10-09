package com.yaj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Hari {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");

		driver.manage().window().maximize();
		
		System.out.println("*****************ALL DATA*********************");
		
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement separate : all_data) {
			String text = separate.getText();
			System.out.println(text);
		}
		
		System.out.println("**************ROW DATA*******************");
		
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		for (WebElement rowdata : row) {
			String text1 = rowdata.getText();
			System.out.println(text1);
		}
		
		System.out.println("**************COLUMN DATA*********************");
	
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		for (WebElement columndata : column) {
			String text2 = columndata.getText();
			System.out.println(text2);
			
		}
		
		System.out.println("***********PARTICULAR DATA**********************");
	
		WebElement particular = driver.findElement(By.xpath("//table/tbody/tr[7]/td[6]"));
		String text3 = particular.getText();
		System.out.println(text3);
		
		
		System.out.println("*********HEADING**********************");
		
		List<WebElement> heading = driver.findElements(By.tagName("th"));
		for (WebElement headings : heading) {
			String text4 = headings.getText();
			System.out.println(text4);
			
				}
	
	}

}
