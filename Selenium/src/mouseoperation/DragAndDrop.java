package mouseoperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleninumUtil;

public class DragAndDrop {

	public static void main(String[] args)throws InterruptedException
	{
		
				WebDriver driver = SeleninumUtil.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
				// frame handling : 
				WebElement frame = driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
				driver.switchTo().frame(frame);

				// create an instance of Actions class by passing required browser instance to its constructor
				Actions act = new Actions(driver);
				// first identify source and target elements for drag and drop
				List<WebElement> sourceElements = driver.findElements(By.cssSelector("ul#gallery>li"));
				WebElement target = driver.findElement(By.id("trash"));
				// perform dragAndDrop operation
//				act.dragAndDrop(sourceElements.get(0), target).build().perform();
//				Thread.sleep(1000);
//				act.dragAndDrop(sourceElements.get(1), target).build().perform();
//				Thread.sleep(1000);
//				act.dragAndDrop(sourceElements.get(2), target).build().perform();
				
				for(int i=0;i<sourceElements.size();i++) {
					act.dragAndDrop(sourceElements.get(i), target).build().perform();
					Thread.sleep(1000);
				}

			driver.close();
			}
	}


