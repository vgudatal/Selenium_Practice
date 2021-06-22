package guru99Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenerWithExtentReport implements ITestListener {
	ExtentSparkReporter extentSpartReporter;
	ExtentReports extentReports;
	ExtentTest extentTest;

	public void onStart(ITestContext context) {
		extentSpartReporter = new ExtentSparkReporter("./Reports//extent-report.html");
		extentSpartReporter.config().setReportName("Sample Extent Report");
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSpartReporter);
		extentReports.setSystemInfo("Author", "Vishwanath Reddy Gudatal");
	}

	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

	
	 public void onTestStart(ITestResult result) {
		 System.out.println("Test getting started from Listener");
	 }
	

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" : Test got Success from Listener");
		extentTest = extentReports.createTest(result.getName());
		extentTest.log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"//Screenshots//"+result.getName()+".PNG").build());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" : Test got failed from Listener");
		extentTest = extentReports.createTest(result.getName());
		extentTest.log(Status.FAIL,result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"//Screenshots//"+result.getName()+".PNG").build());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" : Test got Skipped from Listener");
		extentTest = extentReports.createTest(result.getName());
		extentTest.log(Status.SKIP, result.getName()+" : Test Skipped");
	}

}
