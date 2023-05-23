package multipleeementshandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_Names_Register 
{
	static WebDriver driver;
	public static void main(String[] args)throws InterruptedException
	{
		setUp("Chrome","https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		
		List<WebElement> samcount=driver.findElements(By.cssSelector("div[class='makers']>ul>li>a>strong>span"));
		
		System.out.println("Samsung count="+samcount.size());
		for(int i=0;i<samcount.size();i++) {
			 System.out.println(samcount.get(i).getText());
		}
		
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
