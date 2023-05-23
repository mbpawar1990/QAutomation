import org.openqa.selenium.chrome.ChromeDriver;

public class CD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create an instance of browers
		ChromeDriver cd=new ChromeDriver();
		//set property to driver path
		System.setProperty("webdriver.chrome.drive", ".\\executables\\chromedriver.exe");
	}

}
