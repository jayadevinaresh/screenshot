package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task_All {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		Actions act=new Actions(driver);
		act.click(signin).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement get = driver.findElement(By.xpath("//p[text()='Please enter your email address to create an account.']"));
		String text = get.getText();
		System.out.println(text);
		System.out.println("**************************************");
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("jayadevinaresh2020@gmail.com");
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement create = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));
		
		//Robot r=new Robot();
		act.click(create).build().perform();
		Thread.sleep(2000);
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio.click();
		
		boolean radioselected = radio.isSelected();
		System.out.println(radioselected);
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("jayadevi");
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surname.sendKeys("naresh");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("yajjas21");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement findele = driver.findElement(By.xpath("//label[@for='passwd']"));
		js.executeScript("arguments[0].scrollIntoView();",findele );
		
		WebElement day = driver.findElement(By.id("days"));
		Select s=new Select(day);
		s.selectByValue("26");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1=new Select(month);
		s1.selectByValue("7");
		
		WebElement year = driver.findElement(By.id("years"));
		Select s2=new Select(year);
		s2.selectByValue("1991");
		
		WebElement add_firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
		add_firstname.sendKeys("jayadevi");
		
		WebElement add_lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
		add_lastname.sendKeys("naresh");
		
		WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("TATA");
		
		WebElement addr1 = driver.findElement(By.xpath("//input[@id='address1']"));
		addr1.sendKeys("shollinganallur, shollinganallur(p.o)");
		
		WebElement addr2 = driver.findElement(By.xpath("//input[@id='address2']"));
		addr2.sendKeys("3, grand appartment");
		
		WebElement findele2 = driver.findElement(By.xpath("//label[@for='address2']"));
		js.executeScript("arguments[0].scrollIntoView();",findele2 );

		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("vishagapatanam");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select s3=new Select(state);
		s3.selectByVisibleText("Florida");
		
		WebElement code = driver.findElement(By.xpath("//input[@id='postcode']"));
		code.sendKeys("32118");
		
		WebElement country = driver.findElement(By.xpath("(//select[@class='form-control'])[5]"));
		Select s4=new Select(country);
		s4.selectByVisibleText("United States");
		
		WebElement info = driver.findElement(By.xpath("//textarea[@id='other']"));
		info.sendKeys("hello");
		
		WebElement landline = driver.findElement(By.xpath("//input[@name='phone']"));
		landline.sendKeys("674893452");
		
		WebElement mobi = driver.findElement(By.xpath("//input[@name='phone_mobile']"));
		mobi.sendKeys("9876234624");
		
		WebElement findele3 = driver.findElement(By.xpath("//label[@for='phone_mobile']"));
		js.executeScript("arguments[0].scrollIntoView();",findele3 );

		WebElement add = driver.findElement(By.xpath("//input[@name='alias']"));
		add.sendKeys("465,shollinganallur");
		
		WebElement register = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		act.click(register).build().perform();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\\\Users\\\\NARESHKUMAR\\\\Jaya-eclipseWorkspace\\\\Selenium_Concepts\\\\screenshot\\\\pic.png");
		FileUtils.copyFile(source, destination);
		
		}

}
