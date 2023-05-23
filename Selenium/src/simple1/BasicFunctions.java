package simple1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicFunctions {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               setUp("Chrome");
               //opened url in browser using get method
               driver.get("https://www.google.com");
               //get current page source code
               String pageSource=driver.getPageSource();
               //print length of source page
               System.out.println("page source lentgh="+pageSource.length());
               //print current page title
               System.out.println("Current page title="+driver.getTitle());
               //print current page url
               System.out.println("Current page url="+driver.getCurrentUrl());
               //close browser
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
		//return null;
	}

}
