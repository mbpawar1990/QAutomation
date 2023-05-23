package multipleeementshandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flikart_Menuprint {
	static WebDriver driver;
	public static void main(String[] args) {
		setUp("Chrome","https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		List<WebElement>menulist=driver.findElements(By.cssSelector("._37M3Pb>div>a>.xtXmba"));
		System.out.println("*******Menu list size***********************");
		System.out.println(menulist.size());
		System.out.println("*******Menu list name***********************");
		for(int i=0;i<menulist.size();i++) {
			 System.out.println(menulist.get(i).getText());
		}
		
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
