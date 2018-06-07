package Testcases;

//import general.driverInitialization;
import General.Main;
import Objects.Login_objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Login_tc extends Main {
    String email ="admin@bystored.com";
    String pwd = "storage2014";
    Boolean expected_result;

    // WebDriver driver;
    Login_objects obj;
    //Login_objects login;

    @Test
    public void loginFunc() throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver","Driver/chromedriver 6")  ;
        //driver = new ChromeDriver();
        // driver.navigate().to("http://qa-admin.bystored.com/#/login");
        // Thread.sleep(4000);

        obj = new Login_objects(driver);
        Thread.sleep(2000);
        obj.enterLoginCredentials(email,pwd);
        Thread.sleep(2000);
        expected_result = obj.clickLogin();
        System.out.print(expected_result + "");
        Thread.sleep(10000);

        Assert.assertTrue(expected_result);




    }

//    public Login_tc(WebDriver driver)
//
//    {
//        this.driver = driver;
//    }

}
