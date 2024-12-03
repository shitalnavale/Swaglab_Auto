package com.SwagLab.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FinishTest extends BaseClass {
	
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
		cop.launchfinishpage();
	}	
	@Test
	public void validateFinishpage()
	{
		String actmsg=fp.finishpagemsg();
		System.out.println(actmsg);
		String expmsg=p1.getData("msg");
		System.out.println(expmsg);
		Assert.assertEquals(actmsg, expmsg);
		System.out.println("Last test Passed....");
		
		
	}
	

}
