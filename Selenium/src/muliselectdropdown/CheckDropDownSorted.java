package muliselectdropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSorted {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();//click on live posting
		WebElement drp=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drp);
		List<WebElement>options=drpselect.getOptions();//getting all options
		ArrayList originlList=new ArrayList();
		ArrayList dupList=new ArrayList();
		for(WebElement opt:options) {
			originlList.add(opt.getText());
			dupList.add(opt.getText());
		}
		
		System.out.println("Original list="+originlList);
		System.out.println("Duplicate  list="+dupList);
		Collections.sort(dupList);
		if(originlList.equals(dupList)) {
			System.out.println("Dropdown Sorted....");
		}else {
			System.out.println("Dropdown not sorted......");
		}
	}

}
