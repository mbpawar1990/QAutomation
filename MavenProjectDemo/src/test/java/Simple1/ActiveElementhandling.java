package Simple1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.SeleninumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElementhandling  extends SeleninumUtility{
 
  WebDriver driver;
	@BeforeTest
	public void startUp() {
		//driver=setUp("chrome", "https://demo.actitime.com/login.do");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void testMouseFocus() {
		//get focused element from UI
		WebElement element=driver.switchTo().activeElement();
		String userNamePlaceholder=element.getAttribute("placeholder");
		String expectedPlaceholder="Username";
		Assert.assertEquals(userNamePlaceholder, expectedPlaceholder,"By default mouse pointer is not in username input field");
	}
	@Test(priority=2)
	public void loginIntoApplicationWithActiveElement() {
		//move to control to the element where mouse pointer is blinking, type admin and press TAB button
		driver.switchTo().activeElement().sendKeys("admin",Keys.TAB);
		//move to control to the element where mouse pointer is blinking, type manager and press ENTER button
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
		String actualLoginPageTitle=getPageTitle("actiTIME - Enter Time-Track");
		String expectedLoginPageTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either Home page not opened or page title got changed");
	}
}
