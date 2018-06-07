package Testcases;

//import com.company.objects.Login_objects;
//import com.company.objects.AddDiscountCode_objects;
import General.Main;
import Objects.DiscountCode_objects;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.InterruptedException;
import java.util.Random;

//import static General.Initialization.discount_object;

public class DiscountCode_tc extends Main {

    //  WebDriver driver;
    int rand = (new Random()).nextInt(9000000) + 1000000;
    String code_name = String.valueOf(rand);
    String description_value = "This is description of discount code";
    String amount = "20";
    String max_redemption = "10";
    String desc_value = "This is a NEW description";
    String max_value = "100";
    String email = "admin@bystored.com";
    String passWord = "storage2014";


    @Test

    public void addDiscount() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","Driver/chromedriver 7")  ;
//        driver = new ChromeDriver();
//        driver.navigate().to("http://qa1-admin.bystored.com/#/login");
//        Login_tc login = new Login_tc();
//        login.loginFunc();
        // Thread.sleep(5000);
        DiscountCode_objects discount_object = new DiscountCode_objects(driver);
        Thread.sleep(5000);
        discount_object.openLoginPage(email,passWord);

        Thread.sleep(10000);
        discount_object.clickHamburger();
        Thread.sleep(5000);

        discount_object.clickDiscountCodes();
        Thread.sleep(5000);

        discount_object.clickAddDiscountCode();
        Thread.sleep(5000);

        discount_object.codeInfo(code_name, description_value);
        Thread.sleep(1000);

        discount_object.validFrom();
        Thread.sleep(1000);
        discount_object.validTill();
        Thread.sleep(1000);
        discount_object.discount_Type();
        discount_object.percent_amount();
        discount_object.amount_value(amount);
        discount_object.maxRedemption(max_redemption);
        Thread.sleep(1000);
        discount_object.submit();
        Thread.sleep(1000);
        discount_object.applyassertionSubmit("Success");
    }

    @Test

    public void viewDetails() throws InterruptedException {
        DiscountCode_objects discount_object = new DiscountCode_objects(driver);
        Thread.sleep(5000);
        //
        Thread.sleep(1000);
        discount_object.details();
        Thread.sleep(5000);
        discount_object.close();
        Thread.sleep(1000);
    }

    @Test
    public void editDiscount() throws InterruptedException {
        DiscountCode_objects discount_object = new DiscountCode_objects(driver);
        Thread.sleep(5000);
        discount_object.edit();
        Thread.sleep(1000);
        discount_object.fillEdit(desc_value);
        Thread.sleep(1000);
        discount_object.validFrom();
        Thread.sleep(1000);
        discount_object.validTill();
        Thread.sleep(1000);
        discount_object.redemptionMax(max_value);
        Thread.sleep(1000);
        discount_object.submitEdit();
        Thread.sleep(5000);
        discount_object.applyassertionSubmit("Success");
        Thread.sleep(4000);
    }

    @Test

    public void deleteDiscount() throws InterruptedException {
        DiscountCode_objects discount_object = new DiscountCode_objects(driver);
        Thread.sleep(5000);
        discount_object.delete();
        Thread.sleep(10000);
        discount_object.yesNo();
        Thread.sleep(1000);
        discount_object.applyassertionSubmit("Success");
        Thread.sleep(2000);


    }
}
