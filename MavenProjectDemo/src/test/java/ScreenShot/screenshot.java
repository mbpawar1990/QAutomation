package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	 WebDriver driver;
		@Test
		public void startUp() throws IOException {
			//driver=setUp("chrome", "https://demo.actitime.com/login.do");
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.vtiger.com/vtigercrm/index.php");
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			TakesScreenshot ts=(TakesScreenshot)driver;
			//get screenshot using getScreenshotAs() of TakesScreenshot interface
			File file=ts.getScreenshotAs(OutputType.FILE);
			//store above screenshot into required location
			FileUtils.copyFile(file,new File(".\\screenshots\\vtiger2.jpg"));
		}
		
}
