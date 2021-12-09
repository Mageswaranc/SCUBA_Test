package com.grouping.com;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups="Sports")
  public void Running() {
	  System.out.println("100 Mts Running and 1500 Mts Running");
  }
  @Test(groups="Sports")
  public void Cricket() {
	  System.out.println("Cricket SIX and Four");
  }
  @Test(groups="Sports")
  public void FoodBall() {
	  System.out.println("10 Goals and Match Win ");
  }
  @Test(groups="Hobbies")
  public void Reading() {
	  System.out.println("Reading Books");
  }
  @Test(groups="Hobbies")
  public void Writing() {
	  System.out.println("Writing Noval ");
  }
  @Test(groups="Entertainment")
  public void Movies() {
	  System.out.println("100 Mts Running and 1500 Mts Running");
  }
  @Test(groups="Entertainment")
  public void Driving() {
	  System.out.println("100 Mts Running and 1500 Mts Running");
  }
}
