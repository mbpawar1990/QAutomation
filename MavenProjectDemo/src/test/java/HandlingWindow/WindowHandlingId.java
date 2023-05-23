package HandlingWindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.SeleninumUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingId extends SeleninumUtility {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://etrain.info/in");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Home page current URL: "+driver.getCurrentUrl());
		System.out.println("Home page current title: "+driver.getTitle());
		
		//Get current window unique id
		String homeWinId=driver.getWindowHandle();
		System.out.println("Home window id: "+homeWinId);
		driver.findElement(By.cssSelector(".icon-twitter")).click();
		Thread.sleep(1000);
		//after click on twitter click, get all windows id
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All windows id: "+allWinIds);
		//get child window id
		allWinIds.remove(homeWinId);
		System.out.println("After removing homeWinId from allWinIds, now allWinIds are "+allWinIds);//[210D71947F962864FADADCF89553CDF9]
		
//		Iterator<String> itr=allWinIds.iterator();
//		String childWinId=itr.next();
				//OR
		String childWinId=allWinIds.iterator().next();
		
		//once you get child window id, you can move your control from Home window to child window
		driver.switchTo().window(childWinId);		
		System.out.println("child page current URL: "+driver.getCurrentUrl());
		System.out.println("child page current title: "+driver.getTitle());
		//if you want child window later as well, dn don't close it else close it
		//driver.close();//even after closing child window control won't move to parent window automatically
		Thread.sleep(1000);
		//now, if you want to perform any operation on Home window, dn move to home window
		driver.switchTo().window(homeWinId);
		System.out.println("Home page current URL: "+driver.getCurrentUrl());
		System.out.println("Home page current title: "+driver.getTitle());
		//if you want to close all the windows opened by WebDriver dn use
		driver.quit();
		//driver.close();
		
		
  }
}
