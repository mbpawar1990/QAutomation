/**
 * 1.launch browser
 * 2.open url=//demo.actitime.com/
 * 3.get page title & title length
 *  4.verify page opened is correct 
 *  5.get page source & length
 *  6.print page length
 *  7.close browser . 
 */
package simple1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

	public static void main(String[] args) {
		//launch browser
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		ChromeDriver drv=new ChromeDriver();
		//open url 
		drv.get("https://www.actitime.com");
		//print page title & length
		String title=drv.getTitle();
		System.out.println("page title="+title);
		//page source and length
		String p_Source=drv.getPageSource();
		System.out.println("Length ="+p_Source.length());
		//verify page is opened is correct or not
		String actualurl="Actitime.com";
		String url=drv.getCurrentUrl();
		System.out.println("page url="+url);
		if(actualurl.equals(url))
		{
			System.out.println("page is opened is correct");
		}else {
			System.out.println("page opened is not correct....");
		}
		
		//close browser
		drv.close();

	}

}
