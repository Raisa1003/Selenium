package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTestcase {
	@Test(priority=-1,enabled=false)//test case will not work if enabled is false
	public void testcase9() {
		System.out.println("Test case 9");
	}

	@Test(priority=0,enabled=true) //by default enabled is true
	public void testcase2() {
		System.out.println("Test case 2");
	}

	@Test(priority=-1,groups="smoke")
	public void testcase3() {
		System.out.println("Test case 3");
	}

	@Test(priority=-2,groups="smoke")
	public void testcase4() {
		System.out.println("Test case 4");
	}

	@Test(priority=-3,groups="smoke")
	public void testcase5() {
		System.out.println("Test case 5");
	}
	 @DataProvider(name="dataprovider1")
	  public Object[][] dataProv()
	  {
		  return new Object[][]
				  {{2,10},{4,5},{3,7},{6,8}};
	  }
}
