package com.yaj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dynamicxpath {
	
	static String s="599";
 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/tshirt");
		
		Actions act=new Actions(driver);
		List<WebElement> all_price = driver.findElements(By.xpath
				("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
		
		List<Integer> price=new ArrayList<>();
		for (int i = 0; i < all_price.size(); i++) {
			 String text = all_price.get(i).getText().replace("Rs. ", "");
			System.out.println(text);
			if (text.contains("599")) {
				WebElement ele = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[" + (i +1)+ "]"));
				ele.click();
				break;
			}
			
				
			}
//			int a = Integer.parseInt(text);
//			price.add(a);
		}
		
		
		
			

			
		
//		System.out.println(price);
//		int size = price.size();
//		System.out.println("size: "+size);
//		System.out.println("max value: "+Collections.max(price));
//		System.out.println("min value: "+Collections.min(price));
		
		
		
	
		
//		List<WebElement> image = driver.findElements(By.xpath
//				("//span[@class='product-discountedPrice']//preceding::img[@class='img-responsive']"));

			
		
		
		
		
		
		}
		
		




