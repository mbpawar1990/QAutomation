package mouseoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleninumUtil;

public class MouseOp3 {

	public static void main(String[] args) {
		SeleninumUtil m1=new SeleninumUtil();
		WebDriver driver = SeleninumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		WebElement firstNameInputField=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		//m1.typeInput(firstNameInputField, "admin");
		
//		m1.copyTextFromField(firstNameInputField);
//		
		WebElement lastNameInputField=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//		m1.pasteTextInToField(lastNameInputField);
		
		//m1.copyPasteText(firstNameInputField, lastNameInputField);
	}

}
