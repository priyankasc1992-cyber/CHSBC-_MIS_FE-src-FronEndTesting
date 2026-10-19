package FrontEndTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyNewPolicyPage {
	static WebDriver driver= new ChromeDriver();

	//Tc 1 .check if buy new policy button is enabled or not
		@Test(priority=1)
		public void  BuyNewPolicyEnabledOrDisabledCheck()
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
			// check if ubmit button enabled if yes then click on submit button
			if(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled())
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
			//check if buy new policy button is enabled or not
			Assert.assertTrue(	driver.findElement(By.cssSelector("(//div[@class='col-4'])[5]")).isEnabled());	
		
		}
		//TC 2 click on buy new policy btn and check  it navigate to buynew policy page
		@Test(priority=2)
		public void  OnClickOnBuyNewPolicyButton()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			// get page title and verify if page title is Buy new policy or not
			Assert.assertTrue(driver.findElement(By.xpath("//a[@class='pageTitle']"))	.getText()	.equalsIgnoreCase("BUY NEW POLICY"));
		}
		//TC_3 check if name text box is enabled 
		@Test(priority=3)
		public void CheckNameTextBoxEnabled()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			//clcik on name text box  enabled
			Assert.assertTrue(driver.findElement(By.id("root_name")).isEnabled());
	
		}
		//Tc_05 enter valid data on name text field
		@Test(priority=4)
		public void  validDataNameTexField()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			// eneter valid data in name text field
			driver.findElement(By.id("root_name")).sendKeys("Priyanka Sabannavar");
		}
		
		// 59 click on select policy and check if enabled
		@Test(priority=59)
		public void Tc_59()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			Assert.assertTrue(driver.findElement(By.id("root_policyType")).isEnabled());
		
					
		}
		//
		//Tc_79:check  calender icon is enabled
		@Test(priority=79)
		public void Tc_79()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			//check if DOB text field  has defult date format dd-mm-yyyy by getting text for dob
			Assert.assertTrue(driver.findElement(By.xpath("//input[@type='date']")).isEnabled());		 
		}
		//80send date in dd-mm-yyyy format and check if it accepting
		@Test(priority=80)
		public void Tc_80()
		{
			driver.get("https://visualivruat.canarahsbclife.com/session?sessionId=89a6dabfac68b333f59f03a5fd3df8c6");

			//click on get started button

			driver.findElement(By.xpath("//button")).click();
			// enter password
			driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("1");
			driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("2");
			driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("3");
			driver.findElement(By.xpath("(//input[@type='password'])[4]")).sendKeys("4");
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("02-05-2022");
		}
		//80send date not in dd-mm-yyyy format and check if it accepting
		@Test(priority=81)
		public void Tc_81()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2022-05-02");
			Assert.assertEquals(	driver.findElement(By.xpath("//input[@type='date']")).getText(), "");
		}
//TC_82:check if DOB test box accept only digits or other chars are allowed
		@Test(priority=82)
		public void Tc_82()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 	
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("ab--!f-   h");
			Assert.assertEquals(	driver.findElement(By.xpath("//input[@type='date']")).getText(), "");
		}
		//Tc_83:check if drop down is working
		@Test(priority=83)
		public void Tc_83()
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
			// click on submit button
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//clcik on buy new policy page 
			driver.findElement(By.xpath("(//div[@class='col-4'])[5]")).click();
			Select drpdown=new Select(driver.findElement(By.id("root_policyType")));
			drpdown.selectByVisibleText("RED");
			Assert.assertTrue(drpdown.getFirstSelectedOption().getText().equals("RED"));
		}
			
}

	