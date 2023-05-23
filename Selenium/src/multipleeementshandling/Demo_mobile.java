package multipleeementshandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_mobile {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		setUp("Chrome","https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement>mobilelist=driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h4>a"));
		List<WebElement>mobilelistprice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		System.out.println("*******Dvice name********************");
		System.out.println("Size="+mobilelist.size());
		for(int i=0;i<mobilelist.size();i++) {
			 System.out.println(mobilelist.get(i).getText());
		}
		System.out.println("Size="+mobilelistprice.size());
		System.out.println("*******Dvice price********************");
		  for(int i=0;i<mobilelistprice.size();i++) {
			 System.out.println(mobilelistprice.get(i).getText());
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
