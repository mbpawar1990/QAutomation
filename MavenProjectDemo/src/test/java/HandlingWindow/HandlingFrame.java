package HandlingWindow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame {
  @Test
  public void frame() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		//Draggable element is present inside the frame, so first switch into frame
		//driver.switchTo().frame(0);	
		
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement src=driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, 100, 0).perform();
		//once you done with all the action in innerpage and want to perform any operation on main page, dn use
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();
  }
}
