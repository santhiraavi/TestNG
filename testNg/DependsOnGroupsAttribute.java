package testNg;

import org.testng.annotations.Test;

public class DependsOnGroupsAttribute {
  @Test(dependsOnGroups="one")
  public void groupstestOne() {
	  System.out.println("one");
  }
  
  @Test(groups="one")
  public void groupstesttwo() {
	  System.out.println("two");
  }
  @Test(groups="one")
  public void groupstestthree() {
	  System.out.println("three");
  }
}
