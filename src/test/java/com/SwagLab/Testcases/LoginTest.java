package com.SwagLab.Testcases;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseClass {
  @Test(priority=1)
  public void validateurl() {
	 String actUrl= lp.geturl();
	 Assert.assertTrue(actUrl.contains("saucedemo"));
	 System.out.println("Test Passed..Url Matched");
	  
  }
  @Test(priority=2)
  public void validateTilte()
  {
	  String actTitle=lp.gettitle();
	  Assert.assertTrue(actTitle.contains("Swag Labs"));
	  System.out.println("Test Passed...Title matched");
  }
  @Test(priority=3)
  public void validateLogin()
  {
	  lp.dologin(p1.getData("un"),p1.getData("pwd"));
	  Assert.assertTrue(lp.geturl().contains("inventory"));
	  System.out.println("Test Passed..Login Successful");
	  driver.navigate().to(lp.geturl());;
  }
  
}
