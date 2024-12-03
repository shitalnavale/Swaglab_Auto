package com.SwagLab.Testcases;

import org.testng.Assert;
import org.testng.annotations.*;

public class InventoryTest extends BaseClass {
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.dologin(p1.getData("un"),p1.getData("pwd"));
	}
@Test(priority=1)	
 public void validateTotalProduct()
 {
	int totalcount=ip.getProductCount();
	Assert.assertEquals(totalcount, 6,"Test Fail ..Count not matched");
	System.out.println("Test Passed ..Total count match");
 }
	@Test(priority=2)
	  
	  public void validateAddTocartFeature()
	  {
		  ip.addProductToCart(p1.getData("pname"));
	  }
	
	 @Test(priority=3)
	  public void validateLaunchingOfCartPage()
	  {
		  ip.openCartPage();
	  }
}
