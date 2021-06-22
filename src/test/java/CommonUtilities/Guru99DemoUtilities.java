package CommonUtilities;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Guru99DemoUtilities {
	FileInputStream fis;
	String configFilePath="./ConfigurationFile\\Guru99ConfigFile.properties";
	
	public Properties getConfigPropertry() {
		try {
			fis = new FileInputStream(configFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		
		
	}
	
	public void getScreenshot(WebDriver driver,String testName) {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", new File("./Screenshots/"+testName+".PNG"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void ElementHighlighter(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background : yellow;border :2px solid red')", ele);
	}
	
	public Object[][] ExcelUtility(String ExcelFilePath) throws InvalidFormatException, IOException {
		//File file = new File("C:\\Users\\kiran\\eclipse-workspace\\MyMavenProject3\\src\\test\\java\\com\\testData\\LoginCredentials.xlsx");
		File file = new File(ExcelFilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount= sheet.getLastRowNum();
		int cellCount =sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount][cellCount];
		
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				//DataFormatter formatter = new DataFormatter();
				//String strValue = formatter.formatCellValue(sheet.getRow(i+1).getCell(j));
				String strValue = String.valueOf(sheet.getRow(i+1).getCell(j));
				data[i][j] = strValue;
				System.out.println(data[i][j]);
			}
		}
		System.out.println(Arrays.toString(data));
		return data;
	}

}
