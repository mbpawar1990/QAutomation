package loginwindowwait1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemo {
  static WebDriver driver;
	public static void main(String[] args)throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//launch web browser
             setUp("Chrome");
             driver.manage().window().maximize();
             driver.get("https://www.saucedemo.com/");
             driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
             //for username textbox
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            //for password textbox
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            //for login button we do explicitly wait
            WebDriverWait wait=new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();
            Thread.sleep(2000);
        WebElement btn=  driver.findElement((By.id("react-burger-menu-btn")));
        btn.click();
        Thread.sleep(2000);
          driver.findElement(By.id("logout_sidebar_link")).click();
           driver.close();
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
