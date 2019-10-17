package LinkedinPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_Test {

	WebDriver driver = null;
	By Email_Textbox = By.id("email");
	By Password_Textbox = By.id("pass");
	By Login_button = By.id("u_0_2");
	

	public Facebook_Test(WebDriver driver) {
		this.driver = driver;
	}
	public void SetTextinEmailTextbox (String text) {
		driver.findElement(Email_Textbox).sendKeys(text);
	}
	
	public void Settextinpasswordtextbox (String text) {
		driver.findElement(Password_Textbox).sendKeys(text);
	}
	
	public void clickonloginbutton() {
		driver.findElement(Login_button).click();
	}
}
