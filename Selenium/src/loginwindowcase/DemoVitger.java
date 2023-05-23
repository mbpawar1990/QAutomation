
/**
 * 1.launch browser
 * 2.enter apllication url
 * 3.enter username as admin
 * 4.pwd=Test@123
 * 5.clcik on sign button
 * 6.validate home page
*/
package loginwindowcase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoVitger {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
              setUp("Chrome");
              //enter url of an application
              
              driver.get("https://demo.vtiger.com/vtigercrm/index.php");
             
             driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
              //get title to validate
              String exptitle=driver.getTitle();
              System.out.println("Titl eof page="+exptitle);
              //user name action
              WebElement user= driver.findElement(By.id("username"));
              user.clear();
              user.sendKeys("Admin");
           //pwd action
          WebElement pwd=driver.findElement(By.id("password"));
          pwd.clear();
          pwd.sendKeys("Test@123");
              //button click & code for explicitly wait
              WebDriverWait wait=new WebDriverWait(driver,20);
              WebElement btn= wait.until(ExpectedConditions.elementToBeClickable(By.className("buttonBlue")));
              btn.click();
             //validation of page with title
              String actualtitle="Demo of Vitger";
              if(actualtitle.equals(exptitle)) {
            	  System.out.println("Page is opened correct...");
              }else {
            	  System.out.println("Page not opened correct.....");
              }
	}
	public static void setUp(String b_name) {
		if(b_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
			driver=new ChromeDriver();
		}else if(b_name.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
}
