package com.Dataprovider.com;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprovider {
  @Test(dataProvider = "dp")
  public void getData(Integer rNO, String Name) {
	  System.out.println("RollNumber :" +rNO +"  Name:" +Name);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 123, "RAM" },
      new Object[] { 672, "BEEM" },
    };
  }
}
