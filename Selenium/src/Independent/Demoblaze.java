package Independent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoblaze {

	//private static final String ExpectedConditons = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		//find pat fro sony xperia z25
		Thread.sleep(2000);
		//WebDriverWait wait=new WebDriverWait(driver,200);
		//wait.until(ExpectedConditions.elementToBeClickable((driver.findElement(By.xpath("//div[h4[a[contains(text(),'Sony xperia z5')]]]/h5")))));
		
		WebElement btn=driver.findElement(By.xpath("//div[h4[a[contains(text(),'Sony xperia z5')]]]/h5"));
		btn.click();
	}

}
