package multipleeementshandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterHTml {
	static WebDriver driver;
	public static void main(String[] args)
	{
		setUp("Chrome","https://demo.automationtesting.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
			List<WebElement> menucount=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		System.out.println("Size="+menucount.size());
		System.out.println("*********Menu of page ***************");
		for(int i=0;i<menucount.size();i++) {
			 System.out.println(menucount.get(i).getText());
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
