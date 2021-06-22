package MyTest;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import guru99Listeners.ListenerWithExtentReport;
import guru99Listeners.RetryAnalyser;
import pageObjects.Guru99HomePage;
import pageObjects.Guru99MobilePage;

//@Listeners(ListenerWithExtentReport.class)
@Listeners()
public class Guru99Demo1 extends BaseClass{	
	Guru99HomePage homePage;
	Guru99MobilePage mobilePage;
	
	//@Test(retryAnalyzer = RetryAnalyser.class)
	@Test(dataProvider = "Guru99DataProvider")
	public void guru99HomePage(String username, String password) {
		homePage = new Guru99HomePage(driver);
		log.info("Landed to Home Page");
		Assert.assertEquals(driver.getTitle(), "Home page");	
		gutils.getScreenshot(driver, "guru99HomePage");
		homePage.clickOnMibileMenu();
		  
		System.out.println(username+" : "+password);
	}
	
	@Test
	public void guru99MobilePage() {
		assertEquals(driver.getTitle(), "Mobile");
		mobilePage =new Guru99MobilePage(driver);
		mobilePage.sortByName();
		ElementHighlighter(driver, mobilePage.sortDropDown);
		gutils.getScreenshot(driver, "guru99MobilePage");
	}
	
	@DataProvider
	public Object[][] Guru99DataProvider() throws InvalidFormatException, IOException {
		String chromeDriverPath = "C:\\Users\\kiran\\eclipse-workspace\\MyMavenProject3\\src\\test\\java\\com\\testData\\LoginCredentials.xlsx";
		Object[][] gdata = ExcelUtility(chromeDriverPath);
		
		return gdata;
	}

}
