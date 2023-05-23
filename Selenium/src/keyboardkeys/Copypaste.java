package keyboardkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleninumUtil;

public class Copypaste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleninumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		WebElement Fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Fname.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		Fname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		

	}

}
