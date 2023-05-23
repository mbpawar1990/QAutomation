package muliselectdropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropDown {

	public static void main(String[] args) {
		String dpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", dpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		WebElement cardrop=driver.findElement(By.id("multiselect1"));
		Select selectskill=new Select(cardrop);
		System.out.println("Is dropdown multiselecetd="+selectskill.isMultiple());
		List<WebElement> opt=selectskill.getOptions();
		System.out.println("Size="+opt.size());
		for(int i=0;i<opt.size();i++) {
			System.out.println("Option"+i+":"+opt.get(i).getText());
		}
		
		//select by dropdown method
		selectskill.selectByIndex(0);
		//select all option
		List<WebElement> selectcars=selectskill.getAllSelectedOptions();
		System.out.println("Select car options="+selectcars.size());
		//deselect values
		selectskill.deselectByIndex(1);
		

	}

}
