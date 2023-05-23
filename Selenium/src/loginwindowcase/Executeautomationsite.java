/**
 * 1.launch browser
 * 2.enter application
 * 3.username=admin
 * 4.pwd=admin
 * 5.click on login button
 * 6.validate home page
 * 7.logout
 * */
package loginwindowcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Executeautomationsite {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		setUp("Chrome");
		//application
		driver.get("https://demosite.executeautomation.com/Login.html");
		//enter value for username
		driver.findElement((By.name("UserName"))).sendKeys("admin");
		//enter value for password
		driver.findElement(By.name("Password")).sendKeys("admin");
		//click on button
		driver.findElement(By.name("Login")).click();

	}
	public static void setUp(String b_name) {
		if(b_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
			driver=new ChromeDriver();
		}else if(b_name.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
}
