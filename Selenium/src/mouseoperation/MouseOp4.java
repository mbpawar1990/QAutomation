package mouseoperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleninumUtil;

public class MouseOp4 {

	public static void main(String[] args) {
		WebDriver driver = SeleninumUtil.setUp("chrome", "https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.facebook.com/");
		/* Instance of Action Class */
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
		userNameInputField.sendKeys("admin");
		//userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				//or
		action.doubleClick(userNameInputField).perform();
		userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
