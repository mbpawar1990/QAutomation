package keyboardkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleninumUtil;

public class Refreshpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=SeleninumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		

	}

}
