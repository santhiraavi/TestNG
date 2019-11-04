package testNg;

import org.testng.annotations.Test;
public class AttributeGroup {
	@Test(groups="san")
	public void testCaseTwo()
	{
	System.out.println("Im in san -  Group1");
	}
	@Test(groups="san")
	public void testCaseOne(){
	System.out.println("Im in san -  Group12");
	}
	@Test(groups="mk")
	public void testCaseThree(){
	System.out.println("Im in  mk-  Group1");
	}
	@Test(groups="mk")
	public void testCaseFour(){
	System.out.println("Im in mk -  Group12");
	}
}