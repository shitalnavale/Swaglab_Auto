package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	private WebDriver driver;
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='CHECKOUT']")
	WebElement checkOutBtn;
	
	@FindBy(xpath="//a[text()='Continue Shopping']")
	WebElement continueSHoppingBtn;
	
	@FindBy(xpath="//button[text()='REMOVE']")
	WebElement removeBtn;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement product;
	
	public void removeProduct()
	{
		String productText=product.getText();
		System.out.println("Product to be remove: "+productText);
		removeBtn.click();
		System.out.println("Product removed: "+productText);
	}
	
	public InventoryPage continueShopping()
	{
		continueSHoppingBtn.click();
		return new InventoryPage(driver);
		
	}
	
	
	
	public CheckoutPage launchCheckoutPage()
	{
		checkOutBtn.click();
		//navigating to check out page
		return new CheckoutPage(driver);
	}
	
	
}

