package keyboardkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleninumUtil;

public class PaeScroll1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleninumUtil.setUp("chrome", "https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		//page down to end 
		Thread.sleep(1000);
		for(int i=0;i<12;i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		for(int i=0;i<12;i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
			Thread.sleep(2000);
		}
driver.close();
	}

}
