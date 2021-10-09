package com.yaj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class_Ele {
	
	public static WebDriver driver;

		public static WebDriver getbrowser()
		{
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
		
		}
		
		public static void getUrl(String Url) {
			driver.get(Url);
		}
		
		public static void GetCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
		}
		
		public static void gettitle() {
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
		public static void naviga_new(String Url) {
			driver.navigate().to(Url);
		}
		public static void back() {
			driver.navigate().back();
		}
		
		public static void forward() {
			driver.navigate().forward();
		}
		
		public static void refresh() {
			driver.navigate().refresh();
		}
		
		
		
		
		public static void close() {

			driver.close();
		}
		
		public static void quit() {

			driver.quit();
		}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


