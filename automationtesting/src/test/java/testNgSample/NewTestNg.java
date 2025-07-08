package testNgSample;

import org.testng.annotations.Test;

public class NewTestNg {
	
  @Test(priority = 2)
  public void firstTest() {
	  System.out.println("Hello");
  }
  
  @Test(priority = 1)	
  public void secondTest() {
	  System.out.println("Java");
  }
}
