package Simple1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDown {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bing.com/");
	driver.manage().window().maximize();
	// implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	//to get all options available
	List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg as_extra_pad']//span"));
	System.out.println("Option available size="+list.size());
	for(int i=0;i<list.size();i++) {
		System.out.println("Option name="+list.get(i).getText());
	}
	for(WebElement item:list) {
		if(item.getText().equals("selenium download ")) {
			item.click();
			break;
			
		}
	}
	

}
}