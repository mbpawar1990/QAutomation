package Simple1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiveElement1 {
 
  WebDriver driver;
	@BeforeTest
	public void startUp() {
		//driver=setUp("chrome", "https://demo.actitime.com/login.do");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=1)
	public void testMouseFocus() {
		//get focused element from UI
		WebElement element=driver.switchTo().activeElement();
		String userNamePlaceholder=element.getAttribute("name");
		String expectedPlaceholder="Username";
		Assert.assertEquals(userNamePlaceholder, expectedPlaceholder,"By default mouse pointer is not in username input field");
	}
	@Test(priority=2)
	public void loginIntoApplicationWithActiveElement() {
		//move to control to the element where mouse pointer is blinking, type admin and press TAB button
		driver.switchTo().activeElement().sendKeys("Admin",Keys.TAB);
		//move to control to the element where mouse pointer is blinking, type manager and press ENTER button
		driver.switchTo().activeElement().sendKeys("admin123",Keys.ENTER);
		String actualLoginPageTitle=driver.getTitle();
		String expectedLoginPageTitle="actiTIME - Enter Time-Track";
		Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle,"Either Home page not opened or page title got changed");
	}
}
