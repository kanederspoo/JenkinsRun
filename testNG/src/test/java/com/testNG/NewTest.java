package com.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Prateek");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("hi");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("spoorthi");
  }

}
