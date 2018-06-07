package Objects;

import org.openqa.selenium.*;
//import com.company.objects.Createbooking_objects;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.lang.String;
import java.lang.Object;
import java.util.List;

//import static General.Initialization.login;


public class Createbooking_objects {

    public static By byHamburger = By.cssSelector("#reactAdmin > div > div:nth-child(3) > header > div.background > button");
    public static By byBooking = By.cssSelector("#reactAdmin > div > div:nth-child(3) > header > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > a");
    public static By byCustomer = By.xpath("//*[@id=\"bookingForm\"]/div[2]/button");

    public static By firstName = By.name("firstName");
    public static By lastName = By.name("lastName");
    public static By passWord = By.name("password");
    public static By confirmPass = By.name("confirmpassword");
    public static By Email = By.name("email");
    public static By byPhone = By.name("phoneNumber");

    public static By campaignValue = By.name("marketingCampaign");
    public static By byCard = By.cssSelector("#bookingForm > div:nth-child(3) > div:nth-child(22) > div > div > input[type=\"checkbox\"]");

    public static By firstnameCard = By.name("cardFirstName");
    public static By lastnameCard = By.name("cardLastName");
    public static By cardNumber = By.name("cardNumber");
    public static By cardCVV = By.name("cardCVV");



    // Login_objects login;
    //public static By expiryMonth = By.xpath("//*[@id=\"undefined--undefined-64990\"]/div[1]/div[2]");
    // public static By byTitle = By.xpath("//*[@id=\"undefined--undefined-19800\"]/div[1]/div[2]");
    // public static By selectbooking = By.xpath("//*[@id=\"react-select-4--value\"]/div[1]");


    public static By discountValue = By.name("discountOrVoucher");

    public static By notes = By.name("notes");
    public static By parkinginfo = By.name("parkingInfo");
    public static By restrictedproperty = By.name("addressRestriction");
    public static By driverinfo = By.name("infoForDriver");
    //public static By trying = By.cssSelector("ul[id='inquiry-options']").findElements(By.tagName("li")).get(1).click();

    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    public Createbooking_objects(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHamburger() {
        driver.findElement(byHamburger).click();
    }

    public void clickBooking() {
        driver.findElement(byBooking).click();
    }

    public void clickCustomer() {
        driver.findElement(byCustomer).click();
    }

    public void customerInfo(String fn, String ln, String pw, String cw, String e, String p) throws InterruptedException {
        driver.findElement(firstName).sendKeys(fn);
        driver.findElement(lastName).sendKeys(ln);
        driver.findElement(passWord).sendKeys(pw);
        driver.findElement(confirmPass).sendKeys(cw);
        driver.findElement(Email).sendKeys(e);
        driver.findElement(byPhone).sendKeys(p);

    }

    public void category() {

        //WebElement mySelectElement = driver.findElement(By.id("react-select-7--value"));
        // driver.findElement(By.id("react-select-7--value")).click();
        // driver.findElement(By.cssSelector("span[id='react-select-7--value-item']")).findElements(By.tagName("span"))..click();
        // driver.findElement(By.xpath("//*[@id=\"bookingForm\"]/div[2]/div[7]")).click();
        //driver.findElement(By.cssSelector("ul[id='inquiry-options']")).findElements(By.tagName("li")).get(1).click();
        //driver.findElement(By.id("react-select-7--value"

       /* Actions action = new Actions(driver);
        WebElement optionsList = driver.findElement(By.xpath("//*[@id=\"react-select-7--value-item\"]"));
        action.moveToElement(optionsList);
        System.out.println(""+optionsList);
        List<WebElement> options = optionsList.findElements(By.xpath("//*[@id=\"react-select-7--value-item\"]"));
        for(WebElement option : options) {
            if (option.getText().equals("Students")) {
                option.click();
            }
        }*/
        //  WebElement mySelectElement = driver.findElement(By.id("react-select-7--value"));
        WebElement selectcategory = driver.findElement(By.id("react-select-7--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectcategory, "Students").build().perform();
        action.sendKeys(selectcategory, Keys.ENTER).build().perform();


    }

    public void marketingSource() {
        //   WebElement mySelectElement = driver.findElement(By.id("react-select-8--value"));
        WebElement selectsource = driver.findElement(By.id("react-select-8--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectsource, "Facebook").build().perform();
        action.sendKeys(selectsource, Keys.ENTER).build().perform();
    }

    public void marketingCampaign(String campaign) {
        driver.findElement(campaignValue).sendKeys(campaign);
    }

    public void clickCard() {
        driver.findElement(byCard).click();
    }

    public void cardInfo(String fn, String ln, String num, String cvv) {
        driver.findElement(firstnameCard).sendKeys(fn);
        driver.findElement(lastnameCard).sendKeys(ln);
        driver.findElement(cardNumber).sendKeys(num);
        driver.findElement(cardCVV).sendKeys(cvv);

    }

    public void selectexpiryMonth() throws InterruptedException

    {
      /*  WebElement mySelectElement = driver.findElement(By.id("undefined--undefined-57745"));
        //WebElement byTitle =  driver.findElement(By.xpath("//*[@id=\"undefined--undefined-19800\"]/div[1]/div[2]"));
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
*/
        WebElement mySelectElement = driver.findElements(By.cssSelector("div[id^='undefined--undefined']")).get(0);
        //WebElement byTitle =  driver.findElement(By.xpath("//*[@id=\"undefined--undefined-19800\"]/div[1]/div[2]"));
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();
        for(int i = 0; i<11; i++) {
            action.sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);

    }

    public void selectexpiryYear() throws InterruptedException {
        //  WebElement mySelectElement = driver.findElement(By.cssSelector("div[id^='undefined--undefined']")).findElements(By.tagName("div")).get(1);
        //driver.findElement(By.cssSelector("div[id^='undefined--undefined']")).findElements(By.tagName("div")).get(1).click();

        //WebElement byTitle =  driver.findElement(By.xpath("//*[@id=\"undefined--undefined-19800\"]/div[1]/div[2]"));
        //Actions action = new Actions(driver);
        //action.click(mySelectElement).build().perform();
        //for(int i = 0; i<11; i++) {
        //action.sendKeys(Keys.ARROW_DOWN).build().perform();
        // }
        //action.sendKeys(Keys.ENTER).build().perform();



        /*WebElement mySelectElement = driver.findElement(By.cssSelector("div[id^='undefined--undefined']"));
        //WebElement byTitle =  driver.findElement(By.xpath("//*[@id=\"undefined--undefined-19800\"]/div[1]/div[2]"));
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();
        for(int i = 0; i<12; i++) {

            action.sendKeys(Keys.ARROW_DOWN).build().perform();
        }

            action.sendKeys(Keys.ENTER).build().perform();
        }*/


        //   WebElement byTitle = driver.findElement(By.xpath("//*[@id=\"undefined--undefined-46777\"]"));
        // Actions action = new Actions(driver);
        //action.click(byTitle).build().perform();
        //action.sendKeys(Keys.ARROW_DOWN).build().perform();

        //  #undefined--undefined-38218 > div:nth-child(1) > div:nth-child(2)
        //       #undefined--undefined-44867 > div:nth-child(1) > div:nth-child(2)
        //action.sendKeys(Keys.ENTER).build().perform();
        // WebElement selectExpiryYear = driver.findElement(By.id("react-select-8--value"));
        //  WebElement selectExpiryYear = driver.findElement(By.id("react-select-8--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");
//*[@id="undefined--undefined-43332"]/div[1]/div[2]

        //   Actions action = new Actions(driver);
        // action.sendKeys(selectsource, "Facebook").build().perform();
        // action.click(selectExpiryYear).build().perform();
        //action.sendKeys(Keys.ARROW_DOWN).build().perform();
        //action.sendKeys(selectExpiryYear, Keys.ENTER).build().perform();
        WebElement element = driver.findElements(By.cssSelector("div[id^='undefined--undefined']")).get(1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);


        WebElement mySelectElement = driver.findElements(By.cssSelector("div[id^='undefined--undefined']")).get(1);
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();
        for(int i = 0; i<3; i++) {
            action.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(2000);
        }
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);



    }

    public void storageUnit()
    {
        //  WebElement mySelectElement = driver.findElement(By.id("react-select-9--value"));
        WebElement selectUnit =  driver.findElement(By.id("react-select-9--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectUnit,"25 sq ft").build().perform();
        action.sendKeys(selectUnit, Keys.ENTER).build().perform();
    }

    public void promotions()
    {
        // WebElement mySelectElement = driver.findElement(By.id("react-select-10--value"));
        WebElement selectPromotions =  driver.findElement(By.id("react-select-10--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectPromotions,"User promise to store data for Less than six months.").build().perform();
        action.sendKeys(selectPromotions, Keys.ENTER).build().perform();
    }

    public void standardLiability()
    {
        // WebElement mySelectElement = driver.findElement(By.id("react-select-11--value"));
        WebElement selectLiability =  driver.findElement(By.id("react-select-11--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectLiability,"£1,000 - £10.00 per month").build().perform();
        action.sendKeys(selectLiability, Keys.ENTER).build().perform();
    }

    public void discount(String d)
    {
        driver.findElement(discountValue).sendKeys(d);
    }


    public void bookingType() throws InterruptedException
    {
        WebElement selectbooking =  driver.findElement(By.id("react-select-4--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectbooking,"Lunch Break").build().perform();
        Thread.sleep(2000);
        action.sendKeys(selectbooking, Keys.ENTER).build().perform();

    }

    public void parking() throws InterruptedException
    {
        WebElement selectparking = driver.findElement(By.id("react-select-5--value"));
        Actions action = new Actions(driver);
        action.click(selectparking).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.ENTER).build().perform();


    }

    public void stairs() throws InterruptedException
    {
        WebElement selectparking = driver.findElement(By.id("react-select-6--value"));
        Actions action = new Actions(driver);
        action.click(selectparking).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(1000);
        action.sendKeys(Keys.ENTER).build().perform();

    }

    public void importantInfo(String n, String p, String r, String d)
    {
        driver.findElement(notes).sendKeys(n);
        driver.findElement(parkinginfo).sendKeys(p);
        driver.findElement(restrictedproperty).sendKeys(r);
        driver.findElement(driverinfo).sendKeys(d);
    }

    public void address()throws InterruptedException
    {

        WebElement element = driver.findElement(By.name("searchText"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

        WebElement selectsource= driver.findElement(By.name("searchText"));
        selectsource.sendKeys("1A, Rowallan Road London, SW6 6AF");
        Actions action = new Actions(driver);
        //action.sendKeys(selectsource, "1A, Rowallan Road London, SW6 6AF").build().perform();
        Thread.sleep(5000);
        //js

        // jse.executeScript("document.querySelector('#bookingForm > div:nth-child(5) > div:nth-child(3) > div > ul > li').focus();");


        WebElement selectedRow = driver.findElement(By.cssSelector("#bookingForm > div:nth-child(5) > div:nth-child(3) > div > ul > li"));
        //selectedRow.getText()
        System.out.println(selectedRow.getText());
        Thread.sleep(1000);
        selectedRow.click();



//        WebElement timeslot = driver.findElement(By.cssSelector("#bookingForm > div:nth-child(5) > div:nth-child(3) > div > ul"));
//        List<WebElement> countriesList=timeslot.findElements(By.tagName("li"));
//        for (WebElement li : countriesList) {
//            if (li.getText().equals("1A, Rowallan Road London, SW6 6AF")) {
//                li.click();
//            }
//        }
    }

//WebElement timeslot = driver.findElement(timeslotBooking);
//        List<WebElement> timeslotSelection = timeslot.findElements(By.tagName("li"));
//
//        timeslotSelection.get(2).click();
//
//        goToStep2();





    //#bookingForm > div:nth-child(5) > div:nth-child(3) > div > ul
    public void selectDate() throws InterruptedException
    {
//        WebElement element = driver.findElement(By.cssSelector("#bookingForm > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > p > button"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(500);

        WebElement mySelectElement = driver.findElement(By.cssSelector("input[id^='undefined-SelectDate-undefined']"));
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div:nth-child(6) > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div:nth-child(2) > button:nth-child(2)")).click();
        //Thread.sleep(1000);
    }

    public void selectTime() throws InterruptedException
    {

        WebElement element = driver.findElement(By.cssSelector("#bookingForm > div:nth-child(5) > button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

      //  #bookingForm > div:nth-child(5) > button

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#bookingForm > div:nth-child(5) > div:nth-child(9) > div > div:nth-child(1) > div.col.s3.m3.l3 > div > div:nth-child(1) > input[type=\"radio\"]")).click();
    }

    public void estimatedTimeLocal() throws InterruptedException
    {
        WebElement element = driver.findElement(By.name("jobStartTimeLocal"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);

        element.sendKeys("2018-10-10 22:20");
        Actions action = new Actions(driver);
        //action.sendKeys(selectsource, "1A, Rowallan Road London, SW6 6AF").build().perform();
        Thread.sleep(5000);

    }

    public void submitForm()
    {
        driver.findElement(By.cssSelector("#bookingForm > div.theme-btn > button")).click();
    }
    public void applyassertionSubmit1 (String message)  {
        WebElement mySelectElement = driver.findElement(By.className("notification-message"));
        String actualMessage = mySelectElement.getText();

        Assert.assertEquals(message, actualMessage);
        //  System.out.println("Actual Result : "+ actualMessage + "Expected Result : "+ message);
    }

    public void applyassertionSubmit2 (String message){

        WebElement mySelectElement = driver.findElements(By.className("notification-message")).get(1);
        String actualMessage = mySelectElement.getText();

        Assert.assertEquals(message, actualMessage);
    }


    public void dismiss1()
    {
        driver.findElement(By.className("notification-dismiss")).click();

    }
    public void dismiss2()
    {
        driver.findElements(By.className("notification-dismiss")).get(1).click();
    }

    public void openLoginPage(String email, String password)throws InterruptedException
    {
        Login_objects login=new Login_objects(driver);
        login.enterLoginCredentials(email,password);
        login.clickLogin();

    }



}





