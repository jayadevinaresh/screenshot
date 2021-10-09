package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Actions act=new Actions(driver);
		
		Robot r=new Robot();
		
		WebElement getname = driver.findElement(By.xpath("//span[text()='( Username : Admin | Password : admin123 )']"));
		String text = getname.getText();
		// System.out.println(text);
		String s1 = text.substring(13, 18);
		String s2 = text.substring(32, 40);
		
		System.out.println("*****************************");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("******************************");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		username.sendKeys(s1);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.sendKeys(s2);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));
		act.click(login).build().perform();
		
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		act.moveToElement(admin).build().perform();
		
		WebElement user = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		act.moveToElement(user).build().perform();
		
		WebElement clic = driver.findElement(By.xpath("//a[text()='Users']"));
		act.click(clic).build().perform();
		
//		WebElement user_name1 = driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']"));
//		user_name1.sendKeys("jaya");
//		
//		WebElement select = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
//		act.click(select).build().perform();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		
//		WebElement employee = driver.findElement(By.xpath("//input[@class='inputFormatHint ac_input']"));
//		employee.sendKeys("jayadevi");
//		
//		WebElement status = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
//		act.click(status).build().perform();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);

		WebElement add = driver.findElement(By.xpath("//input[@value='Add']"));
		act.click(add).build().perform();
		
		WebElement employee_name = driver.findElement(By.xpath("//input[@name='systemUser[employeeName][empName]']"));
		employee_name.sendKeys("Nina Patel");
		
		WebElement user_name = driver.findElement(By.xpath("//input[@name='systemUser[userName]']"));
		user_name.sendKeys("jayadevi");
		
		WebElement passw = driver.findElement(By.xpath("//input[@name='systemUser[password]']"));
		passw.sendKeys("jaya4589");
		
		WebElement confirmpassw = driver.findElement(By.xpath("//input[@name='systemUser[confirmPassword]']"));
		confirmpassw.sendKeys("jaya4589");
		
		WebElement save = driver.findElement(By.xpath("//input[@name='btnSave']"));
		act.click(save).build().perform();
		
		Thread.sleep(2000);
		
		 List<WebElement> all_headers = driver.findElements(By.xpath("//table[@class='table hover']"));
		 
		 for (int i = 0; i < all_headers.size(); i++) {
	
			 String text2 = all_headers.get(i).getText();
			  // System.out.println(text2);
		}
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
		 for (int i = 0; i < rows.size(); i++) {
			
			 List<WebElement> row = rows.get(i).findElements(By.tagName("td"));
			 for (int j = 0; j < row.size(); j++) {
				
				 if (row.get(j).getText().equalsIgnoreCase("jayadevi")) {
					
					 System.out.println("Username:" + row.get(1).getText());
					 
					 System.out.println("Role:" + row.get(2).getText());
					 
					 System.out.println("Employee Name:" + row.get(3).getText());
					 
					 System.out.println("Status:" + row.get(4).getText());
				}
			}
			 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
