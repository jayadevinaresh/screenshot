package com.yaj;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Browser_Exten extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		driver=Base_Class("chrome");
		geturl("http://automationpractice.com/index.php");
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		actionsmethods(signin, "click");
		impWait(20);
		WebElement id = driver.findElement(By.xpath("//input[@id='email']"));
		getInputs(id, "jayadevinaresh@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		getInputs(password, "yajjas21");
		WebElement subtbtn = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(subtbtn);
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		String text = dress.getText();
		System.out.println(text);
		actionsmethods(dress, "move");
		impWait(20);
		WebElement eve_dress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		actionsmethods(eve_dress, "click");
		WebElement findele = driver.findElement(By.xpath("(//div[@class='product-count'])[1]"));
		scrol(findele);
		Thread.sleep(2000);
		WebElement fr = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		actionsmethods(fr, "move");
		WebElement quicl_view = driver.findElement(By.xpath("//a[@class='quick-view']"));
		actionsmethods(quicl_view, "click");
		impWait(20);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		frames(iframe, "single");
		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 0; i < 9; i++) {
			actionsmethods(plus, "click");
		}
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		actionsmethods(size, "click");
		robotClass(size, "down");
		robotClass(size, "down");
		robotClass(size, "enter");
		impWait(20);
		WebElement color = driver.findElement(By.xpath("//a[@name='Pink']"));
		actionsmethods(color, "click");
		WebElement addToCart = driver.findElement(By.name("Submit"));
		clickOnElement(addToCart);
		impWait(20);
		multiple_frames("getback");
		WebElement findele2 = driver.findElement(By.xpath("//span[contains(text(),'There are')]"));
		scrol(findele2);
		impWait(20);
		WebElement pro = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(pro);

		WebElement findele3 = driver.findElement(By.xpath("//h1[@id='cart_title']"));
		scrol(findele3);
		impWait(20);
		
		takesnap("snap1.png");
		
		WebElement proceed1 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickOnElement(proceed1);
		
		WebElement findele4 = driver.findElement(By.xpath("//h1[text()='Addresses']"));
		scrol(findele4);
		
		takesnap("snap2.png");
		
		WebElement proceed2 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		clickOnElement(proceed2);
		
		WebElement findele5 = driver.findElement(By.xpath("(//h1[normalize-space()='Shipping'])[1]"));
		scrol(findele5);
		
		WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
		actionsmethods(agree, "click");
		
		takesnap("snap3.png");
		
		WebElement proceed3 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
		clickOnElement(proceed3);
		
		WebElement findele6 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		scrol(findele6);
		
		takesnap("snap4.png");
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickOnElement(payment);
		
		WebElement findele7 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		scrol(findele7);
		
		takesnap("snap5.png");
		
		impWait(20);
		
		WebElement confirm = driver.findElement(By.xpath("//span[normalize-space()='I confirm my order']"));
		clickOnElement(confirm);
		
		WebElement order_confirm = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
		scrol(order_confirm);
		
		takesnap("snap6.png");
		
		impWait(20);
		
		// *****************ORDER AGAIN***************************************
		
		WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		actionsmethods(back, "click");
		
		WebElement new_order = driver.findElement(By.xpath("//a[@title='Women']"));
		actionsmethods(new_order, "move");
		
		impWait(20);
		
		WebElement casual = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[1]"));
		actionsmethods(casual, "click");
		
		WebElement findelem = driver.findElement(By.xpath("//span[@class='cat-name']"));
		scrol(findelem);
		
		impWait(20);
		
		WebElement move = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		actionsmethods(move, "move");
		
		WebElement quick_view = driver.findElement(By.xpath("//a[@class='quick-view']"));
		actionsmethods(quick_view, "click");
		
		impWait(20);
		
		WebElement frm = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		frames(frm, "single");
		
		WebElement quty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		
		for (int i = 0; i < 5; i++) {
			clickOnElement(quty);
		}
		
		WebElement size1 = driver.findElement(By.xpath("//select[@id='group_1']"));
		actionsmethods(size1, "click");
		
		robotClass(size1, "down");
		robotClass(size1, "enter");
		
		WebElement colour = driver.findElement(By.xpath("//a[@name='Orange']"));
		clickOnElement(colour);
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		actionsmethods(cart, "click");
		
		multiple_frames("getback");
		
		WebElement proce = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(proce);
		
		WebElement tex = driver.findElement(By.xpath("//h1[@id='cart_title']"));
		scrol(tex);
		
		takesnap("snap7.png");
		
		WebElement proce1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		actionsmethods(proce1, "click");
		
		WebElement tex1 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		scrol(tex1);
		
		takesnap("snap8.png");
		
		WebElement proce2 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		actionsmethods(proce2, "click");
		
		WebElement tex2 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		scrol(tex2);
		
		WebElement checkx = driver.findElement(By.xpath("//input[@name='cgv']"));
		clickOnElement(checkx);
		
		takesnap("snap9.png");
		
		WebElement proce3 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		actionsmethods(proce3, "click");
		
		WebElement tex3 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		scrol(tex3);
		
		takesnap("snap10.png");
		
		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		clickOnElement(pay);
		
		WebElement tex4 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		scrol(tex4);
		
		WebElement conf = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		actionsmethods(conf, "click");
		
		WebElement tex5 = driver.findElement(By.xpath("//h1[@class='page-heading']"));
		scrol(tex5);
		
		takesnap("snap11.png");
		
		quit();
		
		
	}

}
