package FrontEndTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class VIVR_Menu {
	
	static WebDriver driver= new ChromeDriver();
	//Tc_2 click on previous slider  and check if  3rd slider is dispalyed or not
	@Test(priority=2)
	public void tc2()
	{
		driver.get("https://visualivruat.canarahsbclife.com/session?sessionId=89a6dabfac68b333f59f03a5fd3df8c6");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click on get started button

		driver.findElement(By.xpath("//button")).click();
		// enter password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("4");
		if(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled())
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		//	//a[@class='carousel-control-prev']
		//	//span[@class='carousel-control-prev-icon']
		//	//a[@class='carousel-control-next']
		//span[@class='carousel-control-next-icon']
		
		
		//	//button[@class='active']
		
		//	//button[@ aria-label='Slide 1']
		
		// click on previous slider  and check if  3rd slider is dispalyed or not
		driver.findElement(By.xpath("//span[@class='carousel-control-prev-icon']")).click();
	
		if(driver.findElement(By.xpath("//div[@class='active carousel-item']")).isEnabled())
		{
//			driver.navigate().to(driver.findElement(By.xpath("//div[@class='active carousel-item']//a")).getAttribute("href"));
//			String text=driver.findElement(By.xpath("//h1")).getText();
//			System.out.println(text);
//			Assert.assertTrue(text.equals("Flexi Edge"));
			System.out.println(driver.findElement(By.xpath("//div[@class='active carousel-item']/a/img")).getAttribute("alt"));
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='active carousel-item']/a/img")).getAttribute("alt").equals("Third slide"));
		}
	
	}
	//Tc_4:click on  cirlcel 1st symbole and  check wether we navigate to 1st slide
	@Test(priority=4)
	public void tc4() throws InterruptedException
	{
		driver.get("https://visualivruat.canarahsbclife.com/session?sessionId=89a6dabfac68b333f59f03a5fd3df8c6");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click on get started button

		driver.findElement(By.xpath("//button")).click();
		// enter password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("4");
		if(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled())
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		driver.findElement(By.xpath("(//button)[1]")).click();
		System.out.println(driver.findElement(By.xpath("//button[@aria-current='true']")).getAttribute("aria-label"));
		Assert.assertTrue(driver.findElement(By.xpath("//button[@aria-current='true']")).getAttribute("aria-label").equals("Slide 1"));
	}
	//click on  cirlcel 2nd symbole
	@Test(priority=5)
	public void tc5() throws InterruptedException
	{
		driver.get("https://visualivruat.canarahsbclife.com/session?sessionId=89a6dabfac68b333f59f03a5fd3df8c6");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click on get started button

		driver.findElement(By.xpath("//button")).click();
		// enter password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("4");
		if(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled())
			driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("(//button)[2]")).click();
	
	
		System.out.println(driver.findElement(By.xpath("//button[@aria-current='true']")).getAttribute("aria-label"));
		Assert.assertTrue(driver.findElement(By.xpath("//button[@aria-current='true']")).getAttribute("aria-label").equals("Slide 2"));
	}
	
	@Test(priority=6)
	public void tc6() throws InterruptedException
	{
		driver.get("https://visualivruat.canarahsbclife.com/session?sessionId=89a6dabfac68b333f59f03a5fd3df8c6");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//click on get started button

		driver.findElement(By.xpath("//button")).click();
		// enter password
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("3");
		driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("4");
		if(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled())
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//button[@aria-current='true']")).getAttribute("aria-label"));
		Assert.assertTrue(driver.findElement(By.xpath("//button[@aria-current='true']")).getAttribute("aria-label").equals("Slide 3"));
	}
}
