package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatapProviderTest {
  @Test(dataProvider="dataprovider1")
  public void testcase(int a, int b) {
	  System.out.println(a+b);
  }
  
  @DataProvider(name="dataprovider1")
  public Object[][] dpmethod()
  {
	  return new Object[][]
			  {{2,10},{4,5},{3,7},{6,8}};
  }
  
	  @Test(dataProvider="dataprovider2")
	  public void testcase1(String a, int b) {
		  System.out.println(a+" "+b);
		 
	  }
	  
	  @DataProvider(name="dataprovider2")
	  public Object[][] dpmethod1()
	  {
		  return new Object[][]
				  {{"hello",10},{"Hi",5},{"demo",7},{"test",8}};
	  }
	  
	 
		  @Test(dataProvider="dataprovider3")
		  public void testcase2(float a, float b) {
			  System.out.println(a+b);
		  }
		  
		  @DataProvider(name="dataprovider3")
		  public Object[][] dpmethod2()
		  {
			  return new Object[][]
					  {{2.2f,10.2f},{4.1f,5.1f},{3.4f,7.4f},{6.3f,8.2f}};
		  }
		  
		  @Test(dataProvider="dataprovider1",dataProviderClass=BasicTestcase.class)
		  public void testcase10(int a,int b)
		  {
			  System.out.println(a+b);
		  }
		  
		  
		  
		  
}
