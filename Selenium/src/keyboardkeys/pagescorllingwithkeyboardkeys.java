package keyboardkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleninumUtil;

public class pagescorllingwithkeyboardkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=SeleninumUtil.setUp("chrome", "https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		//page down to end 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));
		Thread.sleep(1000);
		driver.close();
	}

}
