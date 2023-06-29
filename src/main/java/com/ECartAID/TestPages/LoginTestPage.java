package com.ECartAID.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ECartAID.TestBase.TestBase;

public class LoginTestPage extends TestBase
{
  public LoginTestPage()
  {
	  super();
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy (xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")
  WebElement unametextfield;
  
  @FindBy (xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")
  WebElement pswtextfield;
  
  @FindBy(xpath = "//button[contains(text(),'Login')]")
  WebElement loginbutton;
  
  public void username(String uname)
  {
	  unametextfield.sendKeys(uname);
  }
  
  public void password(String psw)
  {
	  pswtextfield.sendKeys(psw);
  }
  
  public void clickonloginbutton()
  {
	  loginbutton.submit();
  }
  
  
}
