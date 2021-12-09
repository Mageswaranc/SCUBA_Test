package com.classname.testng;

import org.testng.annotations.Test;

public class MyFirstNG {
  @Test(priority=1,description="Run First")
  public void MyFirstPgm1() {
	  System.out.println("Hello TestNG.. TC1");
	  
  }
  @Test(priority=2,description="Run 2nd")
  public void MySecondpgm() {
	  System.out.println("Hello TestNG.. TC2");
	  
  }
  @Test(priority=4,description="Run 4th")
  public void MyThirdPgm() {
	  System.out.println("Hello TestNG.. TC4");
	  
  }
  @Test(priority=3,description="Run 3rd")
  public void MyFourthPgm() {
	  System.out.println("Hello TestNG.. TC3");
	  
  }
  @Test(priority=5,description="Run Fifth")
  public void MyFirstPgm() {
	  System.out.println("Hello TestNG..TC5");
	  
  }
  
}
