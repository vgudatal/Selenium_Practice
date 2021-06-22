package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99HomePage {
	WebDriver driver;
	
	public Guru99HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By mobileMenu = By.xpath("//a[text()='Mobile']");
	
	public void clickOnMibileMenu() {
		driver.findElement(mobileMenu).click();
	}
}
