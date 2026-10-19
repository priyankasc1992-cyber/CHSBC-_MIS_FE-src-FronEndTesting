package FrontEndTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OTPVerificationpage {

 static WebDriver driver=new ChromeDriver();
 

public static void getURL()
{
	 
	driver.get("https://visualivruat.canarahsbclife.com/session?sessionId=89a6dabfac68b333f59f03a5fd3df8c6");
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
}
	
	//7.click on get started button
	@Test(priority=7)
	public static void TC_7()
	{
		getURL();

	
		WebDriverWait wait=new WebDriverWait(driver, 100);

	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button")))).click();
		
	}
	//8.
	//	1.click on get started button
	//	2. clcik on backward arrow
	@Test(priority=8)
	public static void TC_8()
	{
		
	
		getURL();
	
		//click on get started button

		driver.findElement(By.xpath("//button")).click();
		// clcik on backward arrow
		driver.navigate().back();
		//check if get started button is present on page
		
	}
	//9.
	//	1.click on get started button
	//	2. clcik on backward arrow
	//  3.clcik on forward arrow button
	//  4.check if  password textbox is present on page
	@Test(priority=9)
	public static void TC_9()
	{
		
	
		getURL();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//click on get started button
		WebDriverWait wait=new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button")))).click();
		// clcik on backward arrow
		driver.navigate().back();
		//click on forward arrow
		driver.navigate().forward();
		//check if  password textbox is present on page
		
		
	}
//	TC 10 expired OTp
	@Test(priority=10)
	public static void TC_10() throws InterruptedException
	{

		driver.get("https://visualivruat.canarahsbclife.com/login");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("1");
	if(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	System.out.println("	Tc_12 without enetering datad inotp text box  check if submit button is enabled or not");
	
	}
	//Tc_11 by enetering  4 didgits  inotp text box  check if submit button is enabled or not
	@Test(priority=11)
	public static void TC_11() throws InterruptedException
	{

		driver.get("https://visualivruat.canarahsbclife.com/login");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("1");
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
	}
//	Tc_12 without enetering datad inotp text box  check if submit button is enabled or not
	@Test(priority=12)
	public static void TC_12() throws InterruptedException
	{

		driver.get("https://visualivruat.canarahsbclife.com/login");
		System.out.println("Tc_12 without enetering datad inotp text box  check if submit button is enabled or not");
		Assert.assertFalse(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
	}
	// Tc_13 . enter 1 or 2 or 3 digit  in otp text box  check if submit button is enabled or not
	@Test(priority=13)
	public static void TC_13() throws InterruptedException
	{

		driver.get("https://visualivruat.canarahsbclife.com/login");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("1");
		System.out.println("Tc_13 . enter 1 or 2 or 3 digit  in otp text box  check if submit button is enabled or not");
		Assert.assertFalse(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
	}
//	//Tc_14 check if otp resend link get activated  initiallly
//	@Test(priority=14)
//	public static void TC_18() throws InterruptedException
//	{
//
//		if(driver.findElement(By.xpath("//p[text()='OTP will expire in ']]")).isDisplayed()==false)
//		{
//			System.out.println("Tc_14 PASSED: otp resend link not activated  initiallly");
//		}
//
//	}
	//Tc_15 check if after 120 sec send otp link is enabled or not
	@Test(priority=15)
	public static void TC_15() throws InterruptedException
	{
		driver.get("https://visualivruat.canarahsbclife.com/login");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("1");
		Thread.sleep(125000);
		WebDriverWait wait=new WebDriverWait(driver, 121);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='resend-code']"))));
	
	//"/p/button[@class='resend-code']]")).isEnabled()==true)
	if(driver.findElement(By.xpath("//button[@class='resend-code']")).isDisplayed()==true)
			System.out.println("Tc_15 PASSED: after 120 sec send otp link is enabled");

	}
	//Tc_16:check if otp  text box accept  other char then digits
	@Test(priority=16)
	public static void TC_16() throws InterruptedException
	{

		driver.get("https://visualivruat.canarahsbclife.com/login");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		String textbox1data=driver.findElement(By.xpath("(//input[@type='password'])[1]")).getText();
		System.out.println(textbox1data);
		if(textbox1data.isEmpty())
		{
			System.out.println("Tc_16 PASSED:for password text box only integer data are acceptable");
		}
	}
	@Test(priority=17)
	public void TC_17() throws Exception
	{
		driver.get("https://visualivruat.canarahsbclife.com/login");
		Thread.sleep(120000);

		
		if(driver.findElement(By.xpath("//button[@class='resend-code']")).isDisplayed())
			driver.findElement(By.xpath("//button[@class='resend-code']")).click();
			
			
		Thread.sleep(120000);
		if(driver.findElement(By.xpath("//button[@class='resend-code']")).isDisplayed())
			driver.findElement(By.xpath("//button[@class='resend-code']")).click();
		
		
		Thread.sleep(120000);
		if(driver.findElement(By.xpath("//button[@class='resend-code']")).isDisplayed())
			driver.findElement(By.xpath("//button[@class='resend-code']")).click();
			
		
//				<div role="progressbar" aria-hidden="true" aria-label="notification timer"
//				class="Toastify__progress-bar Toastify__progress-bar--animated Toastify__progress-bar-theme--dark Toastify__progress-bar--success"
//				style="animation-duration: 5000ms; animation-play-state: running; opacity: 0;"></div>
		
//				<div class="Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter">
//				<svg viewBox="0 0 24 24" width="100%" height="100%" fill="var(--toastify-icon-color-error)">
//				<path d="M11.983 0a12.206 12.206 0 00-8.51 3.653A11.8 11.8 0 000 12.207 11.779 11.779 0 0011.8 24h.214A12.111 12.111 0 0024 11.791 11.766 11.766 0 0011.983 0zM10.5 16.542a1.476 1.476 0 011.449-1.53h.027a1.527 1.527 0 011.523 1.47 1.475 1.475 0 01-1.449 1.53h-.027a1.529 1.529 0 01-1.523-1.47zM11 12.5v-6a1 1 0 012 0v6a1 1 0 11-2 0z"></path>
//				</svg></div>
//				<div>Maximum Resend OTP attempts reached</div>
		
		
//	Locatore:	div[@aria-label='notification timer']
		
		Thread.sleep(2000);
	System.out.println(" ----"+""+driver.findElement(By.xpath("//div[text()='Maximum Resend OTP attempts reached']")).getText());
	}
	//TC_23:click on get started button  after 30 minutes
	@Test(priority=23)
	public static void TC_23() throws Exception
	{
		
	
		getURL();
		Thread.sleep(1800000);

		//click on get started button

		driver.findElement(By.xpath("//button")).click();
	}
	//Tc_24:check title
	@Test(priority=24)
	public static void TC_24() throws Exception
	{
		driver.get("https://visualivruat.canarahsbclife.com/login");
	
		Assert.assertEquals(driver.getTitle(), "VIVR");
	}
	//Tc_25:click on logout on any page and navigate back
	@Test(priority=25)
	public static void TC_25() throws Exception
	{
		
		driver.get("https://visualivruat.canarahsbclife.com/login");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("1");
	if(driver.findElement(By.xpath("//button[@type='button']")).isEnabled());
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//click on logout
	driver.findElement(By.xpath("//span[text()='Logout']")).click();
	driver.navigate().back();
	//get Logout Success message
	Assert.assertEquals(driver.findElement(By.xpath("//h3")).getText(),"Logout Success");
	}
}
