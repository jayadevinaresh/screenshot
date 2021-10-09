package com.yaj;

import org.openqa.selenium.WebDriver;

public class Browser_Launch_Ele extends Base_Class_Ele{

	public static WebDriver driver; 
	public static void main(String[] args) {
		
		getbrowser();
		getUrl("https://www.amazon.in/");
		GetCurrentUrl();
		gettitle();
		naviga_new("https://www.flipkart.com/");
		back();
		forward();
		refresh();
		close();
		quit();

		
	}
	
		
}
