package LinkedinPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linkedin_Loginpage {

	static WebElement element = null;
	
	public static WebElement Signin_Textbox(WebDriver driver) 
	{
		element = driver.findElement(By.id("username"));
		return element;
	}
	
	public static WebElement Password_Searchbox(WebDriver driver)
	{
		element = driver.findElement(By.id("password"));
		return element;
	}
	
	public static WebElement Signin_Button(WebDriver driver) {
		element = driver.findElement(By.className("btn__primary--large from__button--floating"));
		return element;
	}
}
