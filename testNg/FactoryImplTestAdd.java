package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactoryImplTestAdd {
	   int op1;
	      int op2;
	      int expResult;

	      public FactoryImplTestAdd(int op1, int op2, int expResult) {
	            this.op1=op1;
	            this.op2=op2;
	            this.expResult=expResult;
	      }
	 
	      @Test
	      public final void testAdd() {
	            Calculator cal = new Calculator();
	            cal.add(op1, op2);
//	            Assert.assertThrows(cal.add(op1,op2),expResult);
	      }
}
