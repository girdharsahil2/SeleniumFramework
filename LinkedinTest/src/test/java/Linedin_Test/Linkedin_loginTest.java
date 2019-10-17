package Linedin_Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LinkedinPages.Linkedin_Homepage;
import LinkedinPages.Linkedin_Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkedin_loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedin_login();
	}

	public static void Linkedin_login()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		Linkedin_Homepage.Signin_button(driver).click();
		Linkedin_Loginpage.Signin_Textbox(driver).sendKeys("girdhar.sahil2@gmail.com");
		Linkedin_Loginpage.Password_Searchbox(driver).sendKeys("Welcome");
		Linkedin_Loginpage.Signin_Button(driver).sendKeys(Keys.RETURN);
	}
}
