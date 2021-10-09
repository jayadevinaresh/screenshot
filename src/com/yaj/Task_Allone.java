package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Allone {
	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		Actions act=new Actions(driver);
		act.click(signin).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("jayadevinaresh@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("yajjas21");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		driver.findElement(By.id("SubmitLogin")).click();

			
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		String text = dress.getText();
		System.out.println(text);

		act.moveToElement(dress).build().perform();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
		WebElement eve_dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		act.click(eve_dress).build().perform();
		
		WebElement findele = driver.findElement(By.xpath("(//div[@class='product-count'])[1]"));
		js.executeScript("arguments[0].scrollIntoView()",findele);
		
		WebElement fr = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		act.moveToElement(fr).build().perform();
		
		WebElement quicl_view = driver.findElement(By.xpath("//a[@class='quick-view']"));
		act.click(quicl_view).build().perform();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			driver.switchTo().frame(iframe);
			
			WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			for (int i = 0; i <9; i++) {
				act.click(plus).build().perform();
			}

			
			WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
			act.click(size).build().perform();
			
			Robot r=new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);



			r.keyPress(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


			WebElement color = driver.findElement(By.xpath("//a[@name='Pink']"));
			act.click(color).build().perform();
			

			WebElement addToCart = driver.findElement(By.name("Submit"));
			addToCart.click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.switchTo().defaultContent();
			
			WebElement findele2 = driver.findElement(By.xpath("//span[contains(text(),'There are')]"));
			js.executeScript("arguments[0].scrollIntoView()",findele2);

			
			WebElement pro = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			pro.click();
			
			WebElement findele3 = driver.findElement(By.xpath("//h1[@id='cart_title']"));
			js.executeScript("arguments[0].scrollIntoView()",findele3);

			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img1.png");
			FileUtils.copyFile(source, destination);

			WebElement proceed1 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
			proceed1.click();
			
			WebElement findele4 = driver.findElement(By.xpath("//h1[text()='Addresses']"));
			js.executeScript("arguments[0].scrollIntoView()",findele4);
			
			TakesScreenshot ts1=(TakesScreenshot)driver;
			File sou = ts1.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img2.png");
			FileUtils.copyFile(sou, dest);

			
			WebElement proceed2 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
			proceed2.click();
			
			WebElement findele5 = driver.findElement(By.xpath("(//h1[normalize-space()='Shipping'])[1]"));
			js.executeScript("arguments[0].scrollIntoView()",findele5);
			
			WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
			act.click(agree).build().perform();

			
			TakesScreenshot ts2=(TakesScreenshot)driver;
			File sou1 = ts2.getScreenshotAs(OutputType.FILE);
			File dest1=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img3.png");
			FileUtils.copyFile(sou1, dest1);
			
			
			WebElement proceed3 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
			proceed3.click();
			
			WebElement findele6 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			js.executeScript("arguments[0].scrollIntoView()",findele6);

			TakesScreenshot ts3=(TakesScreenshot)driver;
			File sou2 = ts3.getScreenshotAs(OutputType.FILE);
			File dest2=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img4.png");
			FileUtils.copyFile(sou2, dest2);
			
			WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
			payment.click();
			
			WebElement findele7 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			js.executeScript("arguments[0].scrollIntoView()",findele7);
			
			TakesScreenshot ts4=(TakesScreenshot)driver;
			File sou3 = ts4.getScreenshotAs(OutputType.FILE);
			File dest3=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img5.png");
			FileUtils.copyFile(sou3, dest3);
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


			WebElement confirm = driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']"));
			confirm.click();
			
			WebElement order_confirm = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
			js.executeScript("arguments[0].scrollIntoView()",order_confirm);
			
			TakesScreenshot ts5=(TakesScreenshot)driver;
			File sou4 = ts5.getScreenshotAs(OutputType.FILE);
			File dest4=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img6.png");
			FileUtils.copyFile(sou4, dest4);

			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			
			//***********************order again**************************************************
			
			WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
			act.click(back).build().perform();
			
			WebElement new_order = driver.findElement(By.xpath("//a[@title='Women']"));
			act.moveToElement(new_order).build().perform();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
			act.click(casual).build().perform();
			
			WebElement findelem = driver.findElement(By.xpath("//span[@class='cat-name']"));
			js.executeScript("arguments[0].scrollIntoView()", findelem);
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			WebElement move = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
			act.moveToElement(move).build().perform();

			WebElement quick_view = driver.findElement(By.xpath("//a[@class='quick-view']"));
			quick_view.click();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			WebElement frm = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
			driver.switchTo().frame(frm);
			
			WebElement quty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
			
			 for(int i = 0; i <5; i++) {
				quty.click();
			}
			
			WebElement size1 = driver.findElement(By.xpath("//select[@id='group_1']"));
			act.click(size1).build().perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			
			WebElement colour = driver.findElement(By.xpath("//a[@name='Orange']"));
			colour.click();
			
			WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
			act.click(cart).build().perform();
			
			driver.switchTo().defaultContent();
			

			TakesScreenshot ts6=(TakesScreenshot)driver;
			File sou5 = ts6.getScreenshotAs(OutputType.FILE);
			File dest5=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img7.png");
			FileUtils.copyFile(sou5, dest5);
			
			WebElement proce = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
			proce.click();


			WebElement tex = driver.findElement(By.xpath("//h1[@id='cart_title']"));
			js.executeScript("arguments[0].scrollIntoView();", tex);
			
			
			TakesScreenshot ts7=(TakesScreenshot)driver;
			File sou6 = ts7.getScreenshotAs(OutputType.FILE);
			File dest6=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img8.png");
			FileUtils.copyFile(sou6, dest6);

			WebElement proce1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
			act.click(proce1).build().perform();

			
			WebElement tex1 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			js.executeScript("arguments[0].scrollIntoView();", tex1);
			
			TakesScreenshot ts8=(TakesScreenshot)driver;
			File sou7 = ts8.getScreenshotAs(OutputType.FILE);
			File dest7=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img9.png");
			FileUtils.copyFile(sou7, dest7);

			
			WebElement proce2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
			act.click(proce2).build().perform();
			
			WebElement tex2 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			js.executeScript("arguments[0].scrollIntoView();", tex2);
			
			WebElement checkx = driver.findElement(By.xpath("//input[@name='cgv']"));
			checkx.click();

			TakesScreenshot ts9=(TakesScreenshot)driver;
			File sou8 = ts9.getScreenshotAs(OutputType.FILE);
			File dest8=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img10.png");
			FileUtils.copyFile(sou8, dest8);
			
			
			WebElement proce3 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
			act.click(proce3).build().perform();
			
			WebElement tex3 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			js.executeScript("arguments[0].scrollIntoView();", tex3);
			
			TakesScreenshot ts10=(TakesScreenshot)driver;
			File sou9 = ts10.getScreenshotAs(OutputType.FILE);
			File dest9=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img11.png");
			FileUtils.copyFile(sou9, dest9);
			
			WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
			pay.click();
			
			
			WebElement tex4 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			js.executeScript("arguments[0].scrollIntoView();", tex4);

			WebElement conf = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			act.click(conf).build().perform();
			
			WebElement tex5 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
			js.executeScript("arguments[0].scrollIntoView();", tex5);

			
			
			TakesScreenshot ts11=(TakesScreenshot)driver;
			File sou10 = ts11.getScreenshotAs(OutputType.FILE);
			File dest10=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot\\Img12.png");
			FileUtils.copyFile(sou10, dest10);

			
//			driver.quit();
			}

}
