package Testcases;

//import com.company.objects.Login_objects;
//import com.company.objects.AddRoom_objects;
import General.Main;
import Objects.Room_objects;
//import javafx.beans.property.SetProperty;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.lang.InterruptedException;
import java.util.Random;

//import static General.Initialization.room_object;
//import static General.Initialization.warehouse_object;

public class Room_tc extends Main{
    int rand = (new Random()).nextInt(9000000) + 1000000;
    String room_ID = String.valueOf(rand);
    String room_size_value = "10";
    String room_capacity_value ="20";
    String room_cost_value = "40";

    String room_size_valueEdit = "10";
    String room_capacity_valueEdit ="20";
    String room_cost_valueEdit = "40";
    String email = "admin@bystored.com";
    String passWord = "storage2014";


    //ChromeDriver driver;


    @Test

    public void addRoom() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","Driver/chromedriver 7")  ;
//        driver = new ChromeDriver();
//        driver.navigate().to("http://qa1-admin.bystored.com/#/login");
//        Login_tc login = new Login_tc(driver);
//        login.loginFunc();
//        Thread.sleep(1000);
        Room_objects room_object = new Room_objects(driver);
        Thread.sleep(5000);
        room_object.openLoginPage(email,passWord);
        //
        Thread.sleep(1000);
        room_object.clickHamburger();
        Thread.sleep(10000);
        room_object.clickWarehouse();
        Thread.sleep(10000);
        room_object.clickAddRoom();
        Thread.sleep(10000);
        room_object.roomID(room_ID);
        Thread.sleep(10000);
        room_object.warehouse();
        Thread.sleep(10000);
        room_object.roomSize(room_size_value);
        room_object.roomCapacity(room_capacity_value);
        room_object.roomCost(room_cost_value);
        Thread.sleep(1000);
        room_object.status();
        Thread.sleep(2000);
        room_object.submit();
        Thread.sleep(4000);
        room_object.applyassertionSubmit("Success");
    }

    @Test

    public void editRoom() throws InterruptedException {
        Room_objects room_object = new Room_objects(driver);
        Thread.sleep(1000);
        room_object.edit();
        Thread.sleep(1000);
        room_object.warehouseEdit();
        Thread.sleep(1000);
        room_object.roomSizeEdit(room_cost_valueEdit);
        room_object.roomCapacityEdit(room_capacity_valueEdit);
        room_object.roomCostEdit(room_cost_valueEdit);
        Thread.sleep(1000);
        room_object.statusEdit();
        Thread.sleep(1000);
        room_object.submitEdit();
        Thread.sleep(4000);
        room_object.applyassertionSubmit("Success");
    }
    @Test

    public void deleteRoom() throws InterruptedException {
        Room_objects room_object = new Room_objects(driver);
        Thread.sleep(1000);
        room_object.delete();
        Thread.sleep(10000);
        room_object.yesNo();
        Thread.sleep(10000);
        room_object.applyassertionSubmit("Success");






    }
}
