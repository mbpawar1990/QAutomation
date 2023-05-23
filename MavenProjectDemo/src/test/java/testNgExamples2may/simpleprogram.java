package testNgExamples2may;

import org.testng.annotations.Test;

public class simpleprogram {
  @Test(priority=2)
  public void tc1() {
	  System.out.println("This is Test case 1 ");
  }
  @Test(priority=1)
  public void tc2() {
	  System.out.println("This is Test case 2 ");
	  tc3();
  }
  public void tc3() {
	  System.out.println("This test case without @ test Annotation....called in another method had @ test annotation..");
  }
  @Test(priority=3,enabled=false)
  public void tc4() {
	  System.out.println("test case 4...");
  }
}