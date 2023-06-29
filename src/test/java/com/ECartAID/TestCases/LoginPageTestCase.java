package com.ECartAID.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ECartAID.TestBase.TestBase;
import com.ECartAID.TestPages.HomePage;
import com.ECartAID.TestPages.LoginTestPage;

public class LoginPageTestCase extends TestBase
{
	
	HomePage hpage;
	LoginTestPage lpage;
	
	LoginPageTestCase()
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
	
	
	@Test(priority = 1)
	public void login()
	{
		lpage=hpage.loginlink();
		lpage.username(prop.getProperty("Uname"));
		lpage.password(prop.getProperty("psw"));
		lpage.clickonloginbutton();
		
	}
}
