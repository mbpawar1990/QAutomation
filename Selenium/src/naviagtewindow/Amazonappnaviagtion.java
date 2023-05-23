/**
 * 1.launch browser
 * 2.url=amazon.in
 * 3.max window
 * 4.get page title & print title
 * 5.select first menu
 * 6.get the page title title & print title
 * 7.navigate back to home page
 * 8.again page title print & verify with step 4;
 * 9.close browser
 */
package naviagtewindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonappnaviagtion {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		setUp("Chrome","https://www.amazon.in/");
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// enter the required URL
		driver.get("https://www.amazon.in/");	
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(800,800));
		//get page title &print it
		String s1=driver.getTitle();
		System.out.println("Page Title after 1 login to webside="+s1);
		driver.manage().window().maximize();
		//select any menu
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.cssSelector("#nav-link-amazonprime"));
		Thread.sleep(500);
		ele.click();
		Thread.sleep(1000);
		//after select any menu get page title & print it
		String s2=driver.getTitle();
		System.out.println("After select prime menu page title ="+s2);
		//navigate to again home page
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/");
		String s3=driver.getTitle();
		System.out.println("After naviagte to home page title="+s3);
		//valiadation of page Title
		if(s1.equals(s3)) {
			System.out.println("page Title validation sucessful.....");
		}else
		{
			System.out.println("Page Title validation not sucessful....");
		}
		//close browser
		driver.close();

	}

	
	public static void setUp(String b_name,String appurl) {
		if(b_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
			driver=new ChromeDriver();
		}else if(b_name.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	}
}
