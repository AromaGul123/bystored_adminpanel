package Testcases;

//import com.company.objects.Login_objects;
//import com.company.objects.AddWarehouse_objects;
import General.Main;
import Objects.Warehouse_objects;
//import javafx.beans.property.SetProperty;
//import org.hamcrest.Condition;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.lang.InterruptedException;

//import static General.Initialization.warehouse_object;

public class Warehouse_tc extends Main {

//        String name = "Mitcham";
//        String Id_value = "CR42AP";
//        String address_value = "Storage King Unit 22 Mitcham Industrial Estate Streatham Road MITCHAM CR4 2AP";
//        String parking_address = "Storage King Unit 22 Mitcham Industrial Estate Streatham Road MITCHAM CR4 2AP";

        String name = "Wandsworth";
        String Id_value = "SW185EB";
        String address_value = "249-251 Merton Rd, Wandsworth, London SW18 5EB";
        String parking_address = "249-251 Merton Rd, Wandsworth, London SW18 5EB";
//
//    String name = "Cheam";
//    String Id_value = "CHEAM_SM12NU";
//    String address_value = "92 Oldfields Road, Oldfields Trading Estate, Sutton, SM1 2NU";
//    String parking_address = "92 Oldfields Road, Oldfields Trading Estate, Sutton, SM1 2NU";

//    String name = "Battersea";
//    String Id_value = "SW113SJ";
//    String address_value = "248 York Rd, London SW11 3SJ";
//    String parking_address = "248 York Rd, London SW11 3SJ";

    String name_edit = "Acre Lane";
    // String Id_value = "SW25UA";
    String address_value_edit = "141-157 Acre Ln, Brixton, London SW2 5UA";
    String parking_address_edit = "141-157 Acre Ln, Brixton, London SW2 5UA";
    String email = "admin@bystored.com";
    String passWord = "storage2014";



    // ChromeDriver driver;

    @Test

    public void addWarehouse() throws InterruptedException {
//            System.setProperty("webdriver.chrome.driver","Driver/chromedriver 7")  ;
//            driver = new ChromeDriver();
//            driver.navigate().to("http://qa1-admin.bystored.com/#/login");
//            Login_tc login = new Login_tc(driver);
//            login.loginFunc();

        Warehouse_objects warehouse_object = new Warehouse_objects(driver);
        Thread.sleep(5000);
        warehouse_object.openLoginPage(email,passWord);


        //delete acre lane and mitcham


        Thread.sleep(5000);
        warehouse_object.clickHamburger();
        Thread.sleep(1000);
        warehouse_object.clickWarehouse();
        Thread.sleep(5000);
        warehouse_object.warehouses();
        Thread.sleep(10000);
        warehouse_object.addWarehouse();
        Thread.sleep(10000);
        warehouse_object.warehouseInfo(name, Id_value, address_value, parking_address);
        Thread.sleep(1000);
        warehouse_object.checkboxDefault();
        Thread.sleep(1000);
        warehouse_object.assetStore();
        Thread.sleep(2000);
        warehouse_object.submit();
        Thread.sleep(4000);
        warehouse_object.applyassertionSubmit("Success");
        Thread.sleep(4000);
    }

    @Test

    public void editWarehouse() throws InterruptedException {
        Warehouse_objects warehouse_object = new Warehouse_objects(driver);
        Thread.sleep(5000);
        warehouse_object.edit();
        Thread.sleep(1000);
        warehouse_object.warehouseInfoEdit(name_edit, address_value_edit, parking_address_edit);
        Thread.sleep(1000);
        warehouse_object.checkboxDefaultEdit();
        Thread.sleep(1000);
        warehouse_object.assetStoreEdit();
        Thread.sleep(1000);
        warehouse_object.submitEdit();
        Thread.sleep(1000);
        warehouse_object.applyassertionSubmit("Success");
        Thread.sleep(4000);
    }

    @Test

    public void deleteWarehouse() throws InterruptedException {
        Warehouse_objects warehouse_object = new Warehouse_objects(driver);
        Thread.sleep(1000);
        warehouse_object.delete();
        Thread.sleep(1000);
        warehouse_object.yesNo();
        Thread.sleep(1000);
        warehouse_object.applyassertionSubmit("Success");




    }
}

