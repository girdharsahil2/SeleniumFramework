package LinkedinPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linkedin_Homepage {

	public static WebElement Signin_button(WebDriver driver) {
		
		//locate Signin button
		WebElement element = driver.findElement(By.xpath("//a[@class='nav__button-secondary']"));
		return element;
	}
	
}
