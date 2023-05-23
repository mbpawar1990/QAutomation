/**
 *Print all te device count and name from gsmarena
 */
package multipleeementshandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CountAnd_namprint {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		setUp("Chrome","https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximize browser window
		driver.manage().window().maximize();
		// enter the required URL
		driver.get("https://www.gsmarena.com/");
		List<WebElement> phonecount=driver.findElements(By.cssSelector("div[class='brandmenu-v2 light l-box clearfix']>ul>li>a"));
		
System.out.println("size="+phonecount.size());
for(int i=0;i<phonecount.size();i++) {
	 System.out.println(phonecount.get(i).getText());
}
Thread.sleep(2000);
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
