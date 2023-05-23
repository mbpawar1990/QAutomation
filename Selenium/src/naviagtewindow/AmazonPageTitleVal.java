/**
 * 1.launch browser
 * 2.open url
 * 3.max d window
 * 4.get pag etitle & print it
 * 5.click on any menu
 * 6.get page title & verify title with step 4.
 * 7.navigate to back to home page
 * 8.repeat step 5 to 8 with other menu
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

public class AmazonPageTitleVal {
static WebDriver driver;
	public static void main(String[] args)  throws InterruptedException
	{
		setUp("Chrome","https://www.amazon.in/");
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
				if(s2.equals(s3)) {
					System.out.println("page Title validation sucessful.....");
				}else
				{
					System.out.println("Page Title validation not sucessful....");
				}
//select another menu
				Thread.sleep(2000);
				
		

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
