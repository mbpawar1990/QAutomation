package keyboardkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleninumUtil;

public class PressEnterkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=SeleninumUtil.setUp("chrome", "https://integrator.actitime.com/auth/at");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("/input[@name='password']")).sendKeys("manager",Keys.ENTER);
	}

}
