package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriver1 {

	public static void main(String[] args) {
	
		
		//set property to driver path
		System.setProperty("webdriver.chrome.drive", "E:\\Automation\\Workspace\\SeleniumBasics\\executables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
	

	}

}
