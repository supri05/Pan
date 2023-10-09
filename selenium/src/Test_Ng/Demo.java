package Test_Ng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Demo {
	@Test(priority = 3,enabled = true,dependsOnMethods = "demoB")
public  void demoA() {
		 
	System.out.println("from demoA");
}
@Test(priority = 1,dependsOnMethods = "demoA",enabled = true,invocationCount = 2)
public  void demoB() {
	System.out.println("from demoB");
}
@Test(priority = 2,invocationCount = 2)
public  void demoC() {
  
	System.out.println("from demoC");
}

}
