package MyTest;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import CommonUtilities.Guru99DemoUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Guru99DemoUtilities{
   WebDriver driver;
   Properties prop = getConfigPropertry();
   String chromeDriverPath=prop.getProperty("ChromeDriverPath");
   String guru99DemoURL=prop.getProperty("Guru99DemoURL");
   Guru99DemoUtilities gutils = new Guru99DemoUtilities();
   Logger log;
      
   
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		//WebDriverManager.chromedriver().setup();//this will do setup of drvivers and no need to install drivers 
		log = Logger.getLogger("My Demo logger");
		PropertyConfigurator.configure("C:\\Users\\kiran\\eclipse-workspace\\MyMavenProject3\\ConfigurationFile\\log4j.properties");
		ChromeOptions cops = new ChromeOptions();
		cops.addArguments("--headless");
		driver = new ChromeDriver(cops);
		driver.get(guru99DemoURL);
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
