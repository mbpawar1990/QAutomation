package propertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationProertyFile {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\testData\\application.properties");
		Properties prop=new Properties();
		prop.load(fis);
		//getting properties file data
		String appurl=prop.getProperty("url");
		String username=prop.getProperty("uname");
		String password=prop.getProperty("pwd");
		String Exp_title=prop.getProperty("Exp_Title");
		System.out.println("Application url="+appurl);
		System.out.println("Username="+username);
		System.out.println("Password="+password);
		//set path for driver
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.titleIs(Exp_title));
		String act_Title=driver.getTitle();
		if(act_Title.equals(Exp_title)) {
			System.out.println("Login Successful....");
		}else {
			System.out.println("Page titled is changed.....");
		}
		
		
	}

}
