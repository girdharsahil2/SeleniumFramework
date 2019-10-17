package Linedin_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LinkedinPages.Facebook_Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {

	static WebDriver driver = null;
	public static void main(String[] args) {
		Facebooklogintest();
	}
	
	public static void Facebooklogintest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		Facebook_Test objects = new Facebook_Test(driver);
		driver.get("https://www.facebook.com/");
		
		objects.SetTextinEmailTextbox("sahil");
		objects.Settextinpasswordtextbox("sahil");
		objects.clickonloginbutton();
		
		
		
	}
}
