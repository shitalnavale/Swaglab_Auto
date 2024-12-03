package com.SwagLab.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseClass{
	
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.dologin(p1.getData("un"),p1.getData("pwd"));
		addWait();
		ip.addProductToCart(p1.getData("pname"));
		addWait();
		ip.openCartPage();
		addWait();
		cp.launchCheckoutPage();
		addWait();
		
	}	
	
  @Test
  public void validatefilldata() {
	  
	  ckp.fillData(p1.getData("fname"), p1.getData("lname"), p1.getData("pcode"));
	  System.out.println("Data filled Successfully...");
  }
  
  public void validatelaunchCheckoutview()
  {
	  ckp.launchCheckoutview();
	  
  }
}
