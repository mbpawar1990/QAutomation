package position;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement check1=driver.findElement(By.id("checkbox1"));
		WebElement btn1=driver.findElement(By.id("submitbtn"));
		///get position means X & Y co-ordinate
		org.openqa.selenium.Point pointofcheckbox=check1.getLocation();
		int xc=pointofcheckbox.getX();
		int yc=pointofcheckbox.getY();
		System.out.println("X co-ordinate of checkbox="+xc);
		System.out.println("Y co-ordinate of checkbox="+yc);
		org.openqa.selenium.Point pointofbutton=btn1.getLocation();
		int xb= pointofbutton.getX();
		int yb=pointofbutton.getY();
		System.out.println("X co-ordinate of button="+xb);
		System.out.println("Y co-ordinate of button="+yb);
		System.out.println("chcekbox is over button="+(xc<xb));
		System.out.println("Button is below checkbox="+(yc<yb));
		
	}

}
