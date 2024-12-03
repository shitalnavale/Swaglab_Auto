package com.SwagLab.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckoutoverviewTest extends BaseClass {
	
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
		ckp.fillData(p1.getData("fname"), p1.getData("lname"), p1.getData("pcode"));
		addWait();
		ckp.launchCheckoutview();
		addWait();
	}	
	
  @Test(priority=1)
  public void Validateprodquantity() 
  
  {
	String actquan= cop.getquantity();
	String expquan=p1.getData("qunatity");
	Assert.assertEquals(actquan, expquan);
	System.out.println("Test Passed..."+actquan +"  and  " +expquan +"   is matching");
	  
  }
  @Test(priority=2)

  
  public void Validategetpayinfo()
  {
	  String actpinfo=cop.getpayinfo();
	  System.out.println(actpinfo);
	  String exppinfo=p1.getData("paymentinfo");
	  System.out.println(exppinfo);
	  Assert.assertTrue(actpinfo.contains(exppinfo));
	  System.out.println("Test Passed...");

		  
  }
  @Test(priority=3)

  public void validatelaunchfinishpage()
  {
	  cop.launchfinishpage();
  }
}
