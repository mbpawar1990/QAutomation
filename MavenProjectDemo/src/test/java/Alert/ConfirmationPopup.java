package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationPopup {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//get text from confirmation popup
		String alertText=driver.switchTo().alert().getText();
		System.out.println("Alert pop msg: "+alertText);
		//Thread.sleep(1000);
		//click on OK button of Alert
		driver.switchTo().alert().accept();
		
		//click on Cancel button
		//driver.switchTo().alert().dismiss();
  }
}
