package com.yaj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Webtable {
	static int indexofL, indexofNRR, indexofPts;
	
	static String country= "MI";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=ipl+table+2021&ei=EqxJYZ7zCtW48QPXgreoAg&oq=ipl+table+2021&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAELADEEMyCgguEMgDELADEEMyCgguEMgDELADEEMyCgguEMgDELADEEMyCgguEMgDELADEEMyCgguEMgDELADEEMyCgguEMgDELADEENKBQg4EgExSgQIQRgAUABYAGDE6gNoAXACeACAAQCIAQCSAQCYAQDIAQ_AAQE&sclient=gws-wiz&ved=0ahUKEwiexOGu5o_zAhVVXHwKHVfBDSUQ4dUDCA4&uact=5");
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='Jzru1c']/tbody/tr/th"));
		
		  //   iterate
		
		for (int i = 0; i < headers.size(); i++) {
			String all_headers = headers.get(i).getText();
			//System.out.println(all_headers);
			
			String repl = all_headers.replace("\n", " ");

			if(repl.equalsIgnoreCase("L")) {
				
				indexofL =i+1;
				System.out.println("index of L :"+indexofL);
				}
			else if (repl.equalsIgnoreCase("NRR")) {
				
				indexofNRR=i+1;
				
				System.out.println("index of  NRR :"+ indexofNRR);
				
			}else if (repl.equalsIgnoreCase("Pts")) {
				indexofPts=i+1;
				
				System.out.println("index of Pts :"+ indexofPts);
				
			}

		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		        //   traverse of table body
		
		       // get the row
		
		
		List<WebElement> all_rows = driver.findElements(By.xpath("//table[@class='Jzru1c']/tbody/tr"));
		
		      //   iterate rows
		
		for (int i = 0; i < all_rows.size(); i++) {
			
			   // get the table data
			
			List<WebElement> data = all_rows.get(i).findElements(By.tagName("td"));
			
			   // iterate data
			
			for (int j = 0; j < data.size(); j++) {
				
				if (data.get(j).getText().equalsIgnoreCase(country)) {
					
					System.out.println(country);
					
					System.out.println("total L : "+ data.get(indexofL).getText());
					
					System.out.println("total NRR : "+ data.get(indexofNRR).getText());
					
					System.out.println("total pts : "+ data.get(indexofPts).getText());
				
					System.exit(0);

					
				}
				
			}
			
			
			
			
			
		}
		
		
		
		
		
	}

}
