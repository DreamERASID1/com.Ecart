package com.ECartAID.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ECartAID.TestBase.TestBase;
import com.ECartAID.TestPages.HomePage;
import com.ECartAID.TestPages.LoginTestPage;


public class HomePageTestCases extends TestBase 
{
	HomePage hpage;
	LoginTestPage lpage;
	
	HomePageTestCases()
	{
		super();
	}
	
	@BeforeMethod
	public void init()
	{
		Initilization();
		hpage=new HomePage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
 
	@Test (priority = 0) //Automation Exercise
	public void verifytile()
	{
		String title="Automation Exercise";
		
		String actultitle=driver.getTitle();
		
		Assert.assertEquals(title, actultitle);
	}
	
	@Test(priority = 1)
	public void veirycategoryvisiblity()
	{
		boolean status1=hpage.categoryvisble();
		
		System.out.println(status1);
		
		Assert.assertEquals(status1, true);
	}
	
	
	
}
