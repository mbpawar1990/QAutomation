package HandlingDragAndDropusingframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utilities.SeleninumUtil;
import Utilities.SeleninumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropFrames extends  SeleninumUtility{
  
  WebDriver driver;
	@Test
	public void dragAndDropInsideTheFrame(){
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		// implicit wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement drop=driver.findElement(By.xpath("//a[text()='Droppable']"));
		drop.click();
		//to perform dragAndDrop first switch control inside frame
		//driver.switchTo().frame(0);//now you identify any element from frame only
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		act.moveToElement(src).dragAndDrop(src, dest).build().perform();
		//in order perform any operation on main page, dn again switch your control to main page
		driver.switchTo().defaultContent();
		WebElement logo=driver.findElement(By.cssSelector(".logo"));
		logo.click();
	}
}
