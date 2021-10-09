package com.yaj;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	    // ****************** SELECT BROWSER****************************
	
	public static WebDriver Base_Class(String browsername) {
		
		if (browsername.equalsIgnoreCase("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		}
		
//		else if (browsername.equalsIgnoreCase("ie")) {
//			}
		
		driver.manage().window().maximize();
		return driver;
		}
	
	   // ******************* pass URL*****************************************
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void title() {
		String title = driver.getTitle();
		System.out.println("Title:" +title);
	}
	
	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	
	
	   //  ****************** Actions(moveTo, right,double,click)*************************
	public static void actionsmethods(WebElement element, String options) {
		Actions act=new Actions(driver);
		
		if (options.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
			}
		else if (options.equalsIgnoreCase("right")) {
			act.contextClick(element).build().perform();
		}
		else if (options.equalsIgnoreCase("double")) {
			act.doubleClick(element).build().perform();
			}
		else if (options.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		}
		else {
			System.out.println("INVALID");
		}
	}
	    //  ***************************CLICK********************************
	
	public static void clickOnElement(WebElement element) {
		element.click();
		}
	
	      //*****************WindowHandling********************
	
	public static void windowhandles(String type, String destination) {
		if (type.equalsIgnoreCase("single window")) {
			String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
		}
		
		else if (type.equalsIgnoreCase("multiple windows")) {
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			
			for (String all : windowHandles) {
				System.out.println(all);
				String title = driver.switchTo().window(all).getTitle();
				System.out.println(title);
			}
			
			String actualTitle=destination;
			for (String all1 : windowHandles) {
				if (driver.switchTo().window(all1).getTitle().equals(actualTitle)) {
					break;
				}
			}
		}
	}
		
	     // ***************************RobotClass(up,down,enter,right,left)************************
	
	public static void robotClass(WebElement element, String options) throws AWTException {
		
		Robot r=new Robot();
		
		if (options.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			r.keyPress(KeyEvent.VK_ENTER);
			}
		else if (options.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			//r.keyPress(KeyEvent.VK_ENTER);
			}
		else if (options.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
			r.keyPress(KeyEvent.VK_ENTER);
			}
		else if (options.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
			r.keyPress(KeyEvent.VK_ENTER);
			}
		else if (options.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			}

		else {
			System.out.println("INVALID");
		}
	}
	
	      // ************************dropdown(value,visibleText,index)*********************************
	
	public static void dropDown(WebElement element, String options,String i ) {
		Select s=new Select(element);
		if (options.equalsIgnoreCase("value")) {
			s.selectByValue(i);
		}
		else if (options.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(i);
		}
		else if (options.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(i));
		}
		else {
			System.out.println("INVALID");
		}
	}	
		
		   // ***************sendKeys****************************
	
	public static void getInputs(WebElement element, String input) {
		element.sendKeys(input);
		}
	
	   // ********************javaScriptExecutor------CLICK******************************
	
	public static void jsClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	   // ********************javaScriptExecutor------Scroll(UP,DOWN)******************************
	
	public static void scrol(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	  //***********************ALERT**************************************
	
	public static void alert(WebElement element, String options) {
		Alert al = driver.switchTo().alert();
		if (options.equalsIgnoreCase("accept")) {
			al.accept();
		}
		else if (options.equalsIgnoreCase("dismiss")) {
			al.dismiss();
		}
		else if (options.equalsIgnoreCase("Text")) {
			String text = al.getText();
			System.out.println(text);
		}
	}
	
	    // *********************implicityWait**************************************
	
	public static void impWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	    // ***********************refresh*******************************
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	    //  ****************************TakesScreenShot************************************
	
	public static void takesnap(String element) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\NARESHKUMAR\\Jaya-eclipseWorkspace\\Selenium_Concepts\\screenshot//"+element);
		FileUtils.copyFile(src, dest);
	}
	  
	    // ********************getOptions******************************************
	
	public static void getoptions(WebElement element) {
		Select s= new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement all : options) {
			// String text1 = all.getText();
			System.out.println(all);
		}
	}
	
	
	       // ***************************frame*****************************
	public static void frames(WebElement element, String options) {
		if (options.equalsIgnoreCase("single")) {
			driver.switchTo().frame(element);
			
		}
		else {
			System.out.println();
		}
	}

	public static void multiple_frames(String options) {

		 if (options.equalsIgnoreCase("getback")) {
			driver.switchTo().defaultContent();
			
		}
		else if (options.equalsIgnoreCase("main")) {
			driver.switchTo().parentFrame();
		}
		else {
			System.out.println();
		}
	}
	
	
	      //  ****************************isEnabled********************************
	
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	
	     // *********************************isDisplayed****************************
	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	
	     // **************************isSelected*********************************
	
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	     // **************************getAttribute******************************
	
	public static void getAttribute(WebElement element, String Type) {
		String attribute = element.getAttribute(Type);
		System.out.println(attribute);
	}
	
	     // **************************close********************************
	
	public static void close() {
		driver.close();
	}
	
	   //  **********************quit*************************
	
	public static void quit() {
		driver.quit();
	}
	
}
				
		
	