package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Guru99MobilePage {
	WebDriver driver;
	
	public Guru99MobilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@title='Sort By'][1]")
	public
	WebElement sortDropDown;
	
	public void sortByName() {
		Select sortDropdownSel = new Select(sortDropDown);
		sortDropdownSel.selectByVisibleText("Name");
	}

}
