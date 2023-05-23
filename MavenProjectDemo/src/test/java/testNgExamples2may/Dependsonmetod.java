package testNgExamples2may;

import org.testng.annotations.Test;

public class Dependsonmetod {
@Test(priority=1,expectedExceptions=ArithmeticException.class)
public void SignIn() {
	int i=10/0;
	System.out.println(i);
	System.out.println("User sign in application.....");
	
}
@Test(description="Login method")
public void LogIn() {
	System.out.println("User lob in home page.....");
}
@Test(timeOut=1000)
public void LogOut() throws InterruptedException {
	System.out.println("Log out execute.....");
	Thread.sleep(2000);
}
}
