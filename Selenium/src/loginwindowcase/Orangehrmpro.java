package loginwindowcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Orangehrmpro {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp("chrome");
		//enter url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//enter user name from login window
		driver.findElement(By.name("username")).sendKeys("Admin");
		//enter password for login window
		driver.findElement(By.name("password")).sendKeys("admin123");
		//click on login button
		driver.findElement(By.className("orangehrm-login-button")).click();

	}
	public static void setUp(String b_name) {
		if(b_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
			driver=new ChromeDriver();
		}else if(b_name.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		//return null;
	}
}
