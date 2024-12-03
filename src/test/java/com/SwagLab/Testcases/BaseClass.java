package com.SwagLab.Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.PropertiesUtil;


public class BaseClass {
	public WebDriver driver;
	public PropertiesUtil p1;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public CheckoutPage ckp;
	public ChekoutoverviewPage cop;
	public FinishPage fp;
	@BeforeClass
	public void setUp()
	{
		
		driver=new ChromeDriver();
		p1=new PropertiesUtil();
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		ckp=new CheckoutPage(driver);
		cop=new ChekoutoverviewPage(driver);
		fp=new FinishPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p1.getData("url"));
		
		
		}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
}

