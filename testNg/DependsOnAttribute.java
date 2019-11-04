package testNg;

import org.testng.annotations.Test;

public class DependsOnAttribute {
  @Test(dependsOnMethods="two")
  public void one() {
	  System.out.println("method 1");
  }
  
  @Test
  public void two() {
	  System.out.println("method 2");
  }
//  
  @Test
  public void three() {
	  System.out.println("method 3");
  }
  
}
