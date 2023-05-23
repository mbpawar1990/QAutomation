package TestNgAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethod {
  
  @BeforeMethod
	public void beforeMethodExample() {
		System.out.println("User logged in successfully and navigated to PMI home");
	}

	@Test
	public void testPMICreation() {
		System.out.println("PIM created successfully");
	}

	@Test
	public void testPMIDeletion() {
		System.out.println("PIM deleted successfully");
	}

	@AfterMethod
	public void afterMethodExample() {
		System.out.println("User successfully logged out from application and closed the browser");
	}
}
