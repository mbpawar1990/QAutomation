package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleninumUtil {
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static WebDriver setUp(String bname,String appurl) {
		if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(appurl);
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,20);
		return driver;
	}

}
