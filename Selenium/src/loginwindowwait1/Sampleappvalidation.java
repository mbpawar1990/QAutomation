package loginwindowwait1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sampleappvalidation {
static WebDriver driver;
	public static void main(String[] args) {
		setUp("Chrome");
		//launch browser
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		String s2=driver.getTitle();
		System.out.println("after first login title="+s2);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement enterveh=driver.findElement(By.id("entervehicledata"));
		System.out.println("Vehicle data is visible or not?="+enterveh.isDisplayed());
		String s1=enterveh.getAttribute("id");
		System.out.println("S1 by getattribute()="+s1);
		WebElement autosection=driver.findElement(By.id("nav_automobile"));
		System.out.println("To check that automation section is visiable="+autosection.isDisplayed());
		System.out.println("To check that automation section is enable ="+autosection.isEnabled());
		System.out.println("To het inner html text="+autosection.getText());
		//automobile section vehicle details
		//explicit wait for elements to be clickable
		 WebDriverWait wait=new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("make"))).click();
		 //select second textbox
		 WebElement txt2=driver.findElement(By.id("engineperformance"));
		 txt2.click();
		 System.out.println("To check Eningne field is enabled or not?="+txt2.isEnabled());
		 System.out.println("to check engine field is selected or not?="+txt2.isSelected());
		 //select next text box
		 WebElement txt3=driver.findElement(By.id("dateofmanufacture"));
		 txt3.clear();
		 System.out.println("Date manufacture feild is cliclable or not="+txt3.isSelected());
		
		//select next textbox
		 driver.findElement(By.id("numberofseats")).click();
		 driver.findElement(By.id("fuel")).click();
		 driver.findElement(By.id("listprice")).click();
		 driver.findElement(By.id("licenseplatenumber")).click();
		 driver.findElement(By.id("annualmileage")).click();
		 //explicit wait
		// WebDriverWait wait=new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("nextenterinsurantdata"))).click();
		// driver.close();
		

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
