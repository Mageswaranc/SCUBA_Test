package com.listener.tesng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
  @Test
  public void TestToFail() {
	  System.out.println("This method to test fail");					
	    Assert.assertTrue(false);
  }
  public void TestToPass() {
	  System.out.println("This method to test fail");					
	    Assert.assertTrue(true);
  }
}
