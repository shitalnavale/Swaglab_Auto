package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.SwagLab.Utility.PropertiesUtil;

public class FinishPage {
	
	private WebDriver driver;
	public FinishPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
	WebElement mssg;
	
	public String finishpagemsg()
	{
		return mssg.getText();
	}
}
