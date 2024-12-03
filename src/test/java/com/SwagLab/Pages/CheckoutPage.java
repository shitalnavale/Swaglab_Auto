package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement pcode;
	
	@FindBy(xpath="//input[@value='CONTINUE']")
	WebElement CntBtn;
	
	public void fillData(String Fname,String Lname,String Pcode)
	{
		if(fname.isEnabled())
		{
			fname.sendKeys(Fname);
		}
		
		lname.sendKeys(Lname);
 		pcode.sendKeys(Pcode);
		
	}
	
	public ChekoutoverviewPage launchCheckoutview()
	{
		CntBtn.click() ;
		return new ChekoutoverviewPage(driver);
	}
}
