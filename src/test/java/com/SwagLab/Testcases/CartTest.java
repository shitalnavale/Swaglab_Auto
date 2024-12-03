package com.SwagLab.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CartTest extends BaseClass {
	
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.dologin(p1.getData("un"),p1.getData("pwd"));
		addWait();
		ip.addProductToCart(p1.getData("pname"));
		addWait();
		ip.openCartPage();
		addWait();
	}
	
	
	
  @Test (priority=1)
  public void validateProductRemove()
  	{ 	cp.removeProduct();
	  
  	}
  
  @Test (priority=2)
  public void validateContinueShopping()  
  {
	  cp.continueShopping();
	  ip.addProductToCart(p1.getData("pname2"));
	  addWait();
	  ip.openCartPage();
	  addWait();
  }
  
  @Test (priority=3)
  public void validateLaunchingOfCheckOutPage()  
  {
	  cp.launchCheckoutPage();
	  
  }
}
