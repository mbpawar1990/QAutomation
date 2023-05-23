/**
 1.launch browser
 2.open url
 3.max or set size of window
 4.click on Automation Tools & validation page title
 5.navigate back to home page
 6.click on Manual testing & validate page Title
 7.navigate back to home page
 8.click on Interview  & validate page title
 9.naviagte back to home page
 10.click on Coding practice & validate page title
 11.close browser
 */
package naviagtewindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TechlisticDemo {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		setUp("Chrome","https://www.techlistic.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open url
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/");
		Thread.sleep(1000);
		String s1=driver.getTitle();
		System.out.println("After first login page title ="+s1);
		//set size of window
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(800,800));
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//select Automation tools & validate page title
		//WebElement manual=driver.findElement(by.)
		Thread.sleep(2000);
		String s3=driver.getTitle();
		System.out.println("After selection manual testing title="+s3);
		

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
