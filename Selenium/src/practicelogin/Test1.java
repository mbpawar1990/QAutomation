/**
 * Test case 1: Positive LogIn test
1.Open page
2.Type username student into Username field
3.Type password Password123 into Password field
4.Puch Submit button
5.Verify new page URL contains practicetestautomation.com/logged-in-successfully/
6.Verify new page contains expected text ('Congratulations' or 'successfully logged in')
7.Verify button Log out is displayed on the new page
 */
package practicelogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		
		

	}

}
