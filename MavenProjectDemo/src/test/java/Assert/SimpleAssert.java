package Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.SeleninumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class SimpleAssert  {
  
  public WebDriver driver;
  public WebDriverWait wait;
       @Test(priority=1)
	public void openBrowserAndAppURL() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//validation login page opened or not
		String actualLoginPageTitle=driver.getTitle();
		//System.out.println(actualLoginPageTitle);
		String expectedLoginPageTitle="actiTIME - Login";
		//System.out.println("Login page validation: "+actualLoginPageTitle.equals(expectedLoginPageTitle));
	Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either login page not opened or page title got changed");
	}
	/*@Test(priority=2)
	public void validateLoginPageComponent() {
		WebElement userNameInputField=driver.findElement(By.id("username"));
		Assert.assertTrue(userNameInputField.isDisplayed(), "Username field is not displayed");
	}*/
	@Test(priority=2)
	public void loginInToApplication()  {
	//	driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).clear();
	driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		String actualLoginPageTitle=driver.getTitle();
		wait.until(ExpectedConditions.titleContains(actualLoginPageTitle));
		String expectedLoginPageTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either Home page not opened or page title got changed");
	}
}
