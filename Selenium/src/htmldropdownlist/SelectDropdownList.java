package htmldropdownlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownList 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		setUp("Chrome","https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//identify htmldropdown list using locator
		WebElement drop=driver.findElement(By.id("Skills"));
		//pass list object to select class constrcuctor
		Select skill=new Select (drop);
		//to check dropdown is multiselected or not?
		System.out.println("*** Drop down multiselected or not*****"+skill.isMultiple());
		//get default value
		WebElement dtvalue=skill.getFirstSelectedOption();
		String selectName=dtvalue.getText();
		System.out.println("Selected oR deafult value="+selectName);
		//retrieve all options from dropdownlist
		List<WebElement> options=skill.getOptions();
		System.out.println("*****Option size********"+options.size());
		System.out.println("******Option Name***************");
		for(int i=0;i<options.size();i++) {
			System.out.println("Option"+i+" :"+options.get(i).getText());
		}
		//skill.selectByIndex(5);
		//System.out.println("Selected option name="+skill.getFirstSelectedOption().getText());
		//days Ascending order Validation
		Select daydrop=new Select(driver.findElement(By.id("daybox")));
		List<Integer> days=new ArrayList<Integer>();
		for(int i=1;i<daydrop.getOptions().size();i++) {
			String day=daydrop.getOptions().get(i).getText();
			days.add(Integer.parseInt(day));
		}
		
		List<Integer> dupdays=new ArrayList<Integer>(days);
		dupdays.addAll(days);
		Collections.sort(dupdays);
		System.out.println(days.equals(dupdays));
		Thread.sleep(2000);
		//year validation 
		Select year=new Select(driver.findElement(By.id("yearbox")));
		System.out.println("*****Year size*******");
		List<WebElement> yearoption=year.getOptions();
		System.out.println(yearoption.size());
		ArrayList<Integer>yearvalue=new ArrayList<Integer>();
		for(int i=0;i<yearoption.size();i++) {
			//int year1=year.getOptions().get(i);
			//yearvalue.add(year1);
		}
		List<Integer> year3=new ArrayList<Integer>(yearvalue);//copy years to year3
		year3.addAll(yearvalue);
		Collections.sort(year3);
		System.out.println(yearvalue.equals(year3));
		
	}
	public static void setUp(String b_name,String appurl) {
		if(b_name.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
			driver=new ChromeDriver();
		}else if(b_name.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	}
}
