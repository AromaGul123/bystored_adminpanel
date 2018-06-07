package General;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.lang.reflect.Method;

/**
 * Created by VenD on 4/16/2018.
 */



public class Main {

    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public  static WebDriver driver;


    @BeforeSuite


    public  static void getDriver()
    {
        //Thread.sleep(1000);
        //


        extentReports = new ExtentReports(System.getProperty("user.dir") + "/test-output/BystoredAutomation.html", true);

        extentReports
                .addSystemInfo("Host Name", "Bystored")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Aroma Gul");
        extentReports.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));

    }

    @BeforeTest

    public static WebDriver gettingDriver() throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.navigate().to("http://qa1.bystored.com/");
        driver.navigate().to("http://qa1-admin.bystored.com/#/");
        Thread.sleep(5000);
        return driver;
    }

    @BeforeMethod

    public static void beforeMethodCode(Method method)

    {
        extentTest = extentReports.startTest(method.getName(), "");
    }

    @AfterMethod(alwaysRun = true)
    public void QuitDriver(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest.log(LogStatus.FAIL, "Test Case Failed reason is: " + result.getThrowable());
            // extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(Screenshots.takeScreenshot(result.getMethod().getMethodName())));

        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.log(LogStatus.SKIP, "Test Case Skipped is: " + result.getName());
        } else {
            extentTest.log(LogStatus.PASS, result.getMethod().getMethodName() + " is Passed");
        }

        extentReports.endTest(extentTest);
        // driver.quit();
    }

    @AfterTest

    public static void closedDriver()
    {
        driver.close();
    }

    @AfterSuite
    public static  void closeDriver()

    {
        extentReports.flush();
        extentReports.close();

    }



}
