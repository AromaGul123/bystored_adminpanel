package Testcases;

import General.Main;
import Objects.UserDiscountEmail_objects;
//import com.company.objects.Login_objects;
//import com.company.objects.UserDiscountEmail_objects;
//import javafx.beans.property.SetProperty;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.lang.InterruptedException;

//import static General.Initialization.email_object;


public class UserDiscountEmail_tc extends Main {


    String email_id = "aroma.gul@venturedive.com";
    String name = "Aroma Gul";
    String return_fee = "1000";
    String free_loading_time = "30";
    String discount_percent = "10";
    String free_min_loading_time = "20";
    String free_min_packing = "45";
    String email = "admin@bystored.com";
    String passWord = "storage2014";

    // ChromeDriver driver;

    @Test
    public void userDiscount() throws InterruptedException
    {
//        System.setProperty("webdriver.chrome.driver","Driver/chromedriver 7")  ;
//        driver = new ChromeDriver();
//        driver.navigate().to("http://stage-admin.bystored.com/#/login");
//        Login_tc login = new Login_tc(driver);
//        login.loginFunc();
//        Thread.sleep(1000);
        UserDiscountEmail_objects email_object = new UserDiscountEmail_objects(driver);
        email_object.openLoginPage(email,passWord);

        Thread.sleep(10000);

        Thread.sleep(1000);
        email_object.clickHamburger();
        Thread.sleep(1000);
        email_object.clickUserDiscountEmail();
        Thread.sleep(10000);
        email_object.basicInfo(email_id,name);
        Thread.sleep(5000);
        email_object.storageUnit();
        Thread.sleep(1000);
        email_object.discountCode();
        Thread.sleep(1000);
        email_object.otherInfo(return_fee,free_loading_time,discount_percent,free_min_loading_time,free_min_packing);
        Thread.sleep(1000);
        email_object.submit();
        Thread.sleep(1000);
        email_object.sendEmail();
        Thread.sleep(1000);
        email_object.applyassertionSubmit("Success");
        Thread.sleep(1000);


    }

}

