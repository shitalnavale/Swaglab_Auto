package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
private WebDriver driver;
	
	public LoginPage(WebDriver driver)//base class
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="user-name")
	WebElement uname;
	@FindBy(id="password")
	WebElement paswrd;
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public InventoryPage dologin(String un,String pwd)
	{
		uname.sendKeys(un);
		paswrd.sendKeys(pwd);
		loginBtn.click();
		//navigate to inventory page
		return new InventoryPage(driver);
		
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	public String geturl()
	{
		 return driver.getCurrentUrl();
	}
	public void navigateToUrl()
	{
		driver.navigate().to(geturl());
	}
	}
	


