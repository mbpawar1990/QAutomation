/**
 * 1.launch browser
 * 2.open url=https://www.facebook.com
 * 3.fetching page title
 * 4.verify actual title of the home page with the expected title
 * 5.print title on screen
 * 6.close browser
 */
package simple1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {

	public static void main(String[] args) {

		//launch browser
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				ChromeDriver drv=new ChromeDriver();
				//open url 
				drv.get("https://www.facebook.com");
				//home page title
				System.out.println("Page Title="+drv.getTitle());
				//verify home page title with actual title
				String expTitle="Facebook -log in or sign up";
				String actualTitle=drv.getCurrentUrl();
				System.out.println("actual title="+actualTitle);
				System.out.println("page url ="+actualTitle);
				if(expTitle.equalsIgnoreCase(actualTitle)) {
					System.out.println("Home page title match with expected title...");
				}else {
					System.out.println("Home page title not match with expected title...");
				}
				
				
				//close browser
				drv.close();
	}

}
