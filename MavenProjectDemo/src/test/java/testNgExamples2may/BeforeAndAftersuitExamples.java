package testNgExamples2may;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAndAftersuitExamples {
	@BeforeSuite 
	public void Test11() {
System.out.println("Test case execute before suit.....");
}
	/*@Test
	public void Test33() {
		System.out.println("Hi....");
	}*/
	@AfterSuite 
	public void Test22() {
		System.out.println("Test case execute after suit...");
	}
	
}
