package day9;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Task1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void add(Integer a,Integer b) {
	  c=a+b;
	  System.out.println("Sum = "+c);
	  Assert.assertEquals(c,15);
  }

  @Test(dataProvider = "dp")
  public void sub(Integer a,Integer b) {
	  c=a-b;
	  System.out.println("Diff = "+c);
	  Assert.assertEquals(c,5);
  }
  
  @Test(dataProvider = "dp")
  public void mul(Integer a,Integer b) {
	  c=a*b;
	  System.out.println("Mul = "+c);
	  Assert.assertEquals(c,50);
  }
  
  @Test(dataProvider = "dp")
  public void div(Integer a,Integer b) {
	  c=a/b;
	  System.out.println("div = "+c);
	  Assert.assertEquals(c,2);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5 },
      new Object[] { 18, 6 },
    };
  }
  
}
