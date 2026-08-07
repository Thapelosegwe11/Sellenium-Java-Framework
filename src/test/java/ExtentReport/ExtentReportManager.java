package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener {

    //Global variables.

    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;
    private static ExtentTest test;

    // Create the Report UI.

    public void onStart(ITestContext context){
        sparkReporter = new ExtentSparkReporter(System.getProperty("user-dir") + "Reports/NdosiTestReport.xml"); //SET REPORT PATH
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Ndosi-Web Automation");
        sparkReporter.config().setReportName("Functional Test");

    // Populate common info in the report.

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("OS",System.getProperty("os.name"));
        extent.setSystemInfo("Execution Machine",System.getProperty("user-name"));
        extent.setSystemInfo("Browser","Chrome");
        extent.setSystemInfo("Test Environment","Staging");

    }

    @Override
    public void onTestFailure(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.FAIL,"Test Case " + result.getMethod().getMethodName());
        test.log(Status.FAIL,result.getThrowable());
    }

    @Override
    public void  onTestSuccess(ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Case " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        test = extent.createTest(result.getName());
    }

    @Override
    public void onFinish(ITestContext context){
        extent.flush();
    }
}
