package testNg;

import org.testng.annotations.Factory;

public class FactoryTest 

{

	
	  @Factory
      public Object[] createTest() {
            Object[] res = new Object[5];
            res[0] = new FactoryImplTestAdd(2,3,5);
            res[1] = new FactoryImplTestAdd(2,3,5);
            res[2] = new FactoryImplTestAdd(2,3,5);
//            res[3] = new FactoryImplTestSubtract(4,2,2);
//            res[4] = new FactoryImplTestSubtract(4,2,2);
            return res;
      }
}
