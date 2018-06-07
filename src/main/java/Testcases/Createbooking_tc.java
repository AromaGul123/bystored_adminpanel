package Testcases;


//import com.company.objects.Login_objects;
//import com.company.objects.Createbooking_objects;
import General.Main;
import Objects.Createbooking_objects;
//import javafx.beans.property.SetProperty;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import static General.Initialization.login;
//import static General.Initialization.create;

import javax.swing.*;
import java.lang.InterruptedException;

public class Createbooking_tc extends Main {

    String firstname = "aroma";
    String lastname = "gul";
    String password = "Aroma123";
    String confpassword = "Aroma123";
    String emailaddress = "aroma.gul+180@venturedive.com";
    String phonenum = "03345789926";
    String m_campaign = "Discount Code";
    String firstname_card = "Aroma";
    String lastname_card ="Gul";
    String cardnumber = "4242424242424242";
    String cvv = "123";
    String discount_code = "SOUTHBANKSTORAGE";
    String notes_value = "Notes reagarding the booking";
    String parking_info = "In the street.  I will try and block a space, but it’s difficult.";
    String restricted_info= "No, I will bring the items to the ground floor";
    String driver_info = "I may need you to collect other items on another day.";
    String email = "admin@bystored.com";
    String passWord = "storage2014";


    // ChromeDriver driver;

    @Test
    public void createBooking () throws InterruptedException
//
    {
////    { System.setProperty("webdriver.chrome.driver","Driver/chromedriver 7")  ;
////        driver = new ChromeDriver();
////        driver.navigate().to("http://qa1-admin.bystored.com/#/login");
////        Login_tc login = new Login_tc(driver);
////        login.loginFunc();
//    {
//        Thread.sleep(1000);
//



Createbooking_objects create = new Createbooking_objects(driver);

        create.openLoginPage(email,passWord);

        Thread.sleep(10000);
        create.clickHamburger();
        Thread.sleep(10000);
        create.clickBooking();
        Thread.sleep(10000);
        create.clickCustomer();
        Thread.sleep(10000);
        create.customerInfo(firstname, lastname, password, confpassword, emailaddress, phonenum);
        Thread.sleep(1000);


    }

    @Test

    public void categorySelection () throws InterruptedException {

        Createbooking_objects create = new Createbooking_objects(driver);
        create.category();
        Thread.sleep(1000);
        create.marketingSource();
        Thread.sleep(1000);
        create.marketingCampaign(m_campaign);
        Thread.sleep(1000);
    }


    @Test

    public void creditCard () throws InterruptedException {

        Createbooking_objects create = new Createbooking_objects(driver);
        create.clickCard();
        Thread.sleep(1000);
        create.cardInfo(firstname_card, lastname_card, cardnumber, cvv);
        Thread.sleep(1000);
        create.selectexpiryMonth();
        Thread.sleep(1000);
        create.selectexpiryYear();
        Thread.sleep(1000);
    }

    @Test

    public void storageUnitSelection () throws InterruptedException {

        Createbooking_objects create = new Createbooking_objects(driver);
        create.storageUnit();
        Thread.sleep(1000);
        create.promotions();
        Thread.sleep(1000);
        create.standardLiability();
        Thread.sleep(1000);
        create.discount(discount_code);
        Thread.sleep(1000);
    }

    @Test

    public void bookingTypeSelection () throws InterruptedException {

        Createbooking_objects create = new Createbooking_objects(driver);
        create.bookingType();
        Thread.sleep(4000);
        create.parking();
        Thread.sleep(4000);
        create.stairs();
        Thread.sleep(2000);

    }

    @Test

    public void providingInfo () throws InterruptedException {

        Createbooking_objects create = new Createbooking_objects(driver);
        create.importantInfo(notes_value, parking_info, restricted_info, driver_info);
        Thread.sleep(10000);
    }

    @Test
    public void addressSelection() throws InterruptedException {
        Createbooking_objects create = new Createbooking_objects(driver);
        create.address();
        Thread.sleep(10000);

    }

    @Test
    public void dateSelection() throws InterruptedException {
        Createbooking_objects create = new Createbooking_objects(driver);
        create.selectDate();
        Thread.sleep(5000);
    }

    @Test
    public void timeSelection() throws InterruptedException {
        Createbooking_objects create = new Createbooking_objects(driver);
        create.selectTime();
        Thread.sleep(1000);
        create.estimatedTimeLocal();
        Thread.sleep(1000);
    }

    @Test

    public void submitCreateBookingForm() throws InterruptedException {
        Createbooking_objects create = new Createbooking_objects(driver);
        create.submitForm();
        Thread.sleep(10000);
        create.applyassertionSubmit1("Success");
        Thread.sleep(500);
        create.applyassertionSubmit2("Success");
        Thread.sleep(500);
        //create.dismiss1();
        //create.dismiss2();

    }





}
