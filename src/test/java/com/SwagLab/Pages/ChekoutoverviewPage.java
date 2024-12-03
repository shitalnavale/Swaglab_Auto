package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChekoutoverviewPage {
	private WebDriver driver;
	
	public ChekoutoverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()='FINISH']")
	WebElement finishBtn;
	
	@FindBy(xpath="//div[@class='summary_quantity']")
	WebElement quntity;
	
	@FindBy(xpath="(//div[@class='summary_value_label'])[1]")
	WebElement paymentinfo;
	
	
	public String getquantity()
	{
		return quntity.getText();
		
		
	}
	
	public String getpayinfo()
	{
		return paymentinfo.getText();
	}
	
	public FinishPage launchfinishpage()
	{
		finishBtn.click();
		return new FinishPage(driver);
	}
	
}
