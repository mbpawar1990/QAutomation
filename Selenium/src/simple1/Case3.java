/**
 * 1.launch browser
 * 2.open google page
 * 3.fetch current page url web page & print on console
 * 4.page source of current page
 */
package simple1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver drv=new ChromeDriver();
		//open url 
		drv.get("https://www.google.com");
		//home page title
		String title1=drv.getCurrentUrl();
		System.out.println("current page url="+title1);
		//page source of page
		String source1=drv.getPageSource();
		//System.out.println("Souce code of page="+source1);
	
		//close browser
		drv.close();

	}

}
