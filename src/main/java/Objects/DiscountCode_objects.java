package Objects;

import General.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import java.lang.InterruptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.lang.String;

//import static General.Initialization.login;
//import static General.Initialization.login;

public class DiscountCode_objects {

    public static By byHamburger = By.cssSelector("#reactAdmin > div > div:nth-child(3) > header > div.background > button");
    public static By bydiscountcode = By.xpath("//*[@id=\"reactAdmin\"]/div/div[3]/header/div[1]/div[2]/div[8]/a/div/div");
    public static By byAddDiscount = By.cssSelector("#page-content > div > div:nth-child(3) > div > div > button > div > div > span");
    public static By bycodename = By.name("code");
    public static By bydesc = By.cssSelector("body > div:nth-child(6) > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(4) > div > div > input");
    //public static By byvalidfrom = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[1]/div/div[1]/div[3]/div[1]/div/div[1]/div[1]");
    public static By byAmount = By.name("discountValue");
    public static By bymaxRedemption = By.name("maxRedemption");

    public static By bydetails = By.cssSelector("#page-content > div > div:nth-child(4) > div:nth-child(25) > div > div.card-action > div.theme-detail-btn > button");

    public static By bydescEdit = By.cssSelector("body > div:nth-child(7) > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(4) > div > div > input");
    public static By bymaxRedempEdit = By.cssSelector("body > div:nth-child(7) > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(7) > div > div > input");
//    public static By byclose = By.cssSelector("body > div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(3) > button");


    WebDriver driver;

    public DiscountCode_objects(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickHamburger()throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(byHamburger).click();
    }
    public void clickDiscountCodes()
    {
        driver.findElement(bydiscountcode).click();
    }
    public void clickAddDiscountCode()
    {
        driver.findElement(byAddDiscount).click();
    }

    public void codeInfo(String c,String des)
    {
        driver.findElement(bycodename).sendKeys(c);
        driver.findElement(bydesc).sendKeys(des);

}
    public void validFrom() throws InterruptedException
    {
//////        WebElement element = driver.findElement(By.cssSelector("#bookingForm > div:nth-child(5) > div:nth-child(4) > div:nth-child(2) > p > button"));
////        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
////        Thread.sleep(500);
//
            WebElement mySelectElement = driver.findElement(By.cssSelector("input[id^='undefined-SelectDate-undefined']"));
            Actions action = new Actions(driver);
            action.click(mySelectElement).build().perform();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("body > div:nth-child(10) > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div:nth-child(2) > button:nth-child(2)")).click();
            Thread.sleep(1000);
        }

        public void validTill() throws InterruptedException
    {
        driver.findElement(By.cssSelector(".s6 + .s6 .calendar-style input")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div:nth-child(11) > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(3)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div:nth-child(11) > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div > div > div:nth-child(3) > button:nth-child(4)")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("body > div:nth-child(11) > div > div:nth-child(1) > div > div > div > div > div:nth-child(2) > div:nth-child(2) > button:nth-child(2)")).click();
        System.out.print("hello");

    }
    public void discount_Type() throws InterruptedException
    {
        WebElement selectsource = driver.findElement(By.id("react-select-2--value-item"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        /*Actions action = new Actions(driver);
        action.sendKeys(selectsource, "Long Term Storage").build().perform();
        //Thread.sleep(1000);
        action.sendKeys(selectsource, Keys.ENTER).build().perform();*/

        Actions action = new Actions(driver);
        action.click(selectsource).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
    }
    public void percent_amount()
    {
        WebElement selectsource = driver.findElement(By.id("react-select-3--value-item"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        /*Actions action = new Actions(driver);
        action.sendKeys(selectsource, "Long Term Storage").build().perform();
        //Thread.sleep(1000);
        action.sendKeys(selectsource, Keys.ENTER).build().perform();*/

        Actions action = new Actions(driver);
        action.click(selectsource).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
    }

    public void amount_value(String a)
    {
        driver.findElement(byAmount).sendKeys(a);
    }

    public void maxRedemption(String m)
    {
        driver.findElement(bymaxRedemption).sendKeys(m);
    }

    public void submit() throws InterruptedException
    {
        driver.findElement(By.cssSelector("body > div:nth-child(6) > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div.theme-btn > button")).click();
        Thread.sleep(1000);

    }

    public void applyassertionSubmit (String message) throws InterruptedException {
        Thread.sleep(1000);
        WebElement mySelectElement = driver.findElement(By.className("notification-title"));
        String actualMessage = mySelectElement.getText();

        Assert.assertEquals(message, actualMessage);
        //  System.out.println("Actual Result : "+ actualMessage + "Expected Result : "+ message);
    }

//    public void applyassertionEdit (String message) throws InterruptedException {
//        WebElement mySelectElement = driver.findElement(By.className("notification-message"));
//        String expectedMessage = mySelectElement.getAttribute("Discount Code updated successfully.");
//        Assert.assertEquals(message, expectedMessage);
//    }
//
//    public void applyassertionDelete (String message) throws InterruptedException {
//        WebElement mySelectElement = driver.findElement(By.className("notification-message"));
//        String expectedMessage = mySelectElement.getAttribute("Discount Code deleted successfully.");
//        Assert.assertEquals(message, expectedMessage);
//    }

    public void details() throws InterruptedException

    {
        // WebElement mySelectElement = driver.findElements(By.className("theme-detail-btn")).get(driver.findElements(By.className("theme-detail-btn")).size()-1);
        WebElement mySelectElement = driver.findElements(By.className("theme-detail-btn")).get(0);
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.click(mySelectElement).build().perform();
    }

    public void close() throws InterruptedException

    {
        WebElement mySelectElement = driver.findElements(By.cssSelector("body > div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(3) > button")).get(0);
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.click(mySelectElement).build().perform();
    }

    //#reactAdmin > div > div.notifications-wrapper > div > div > h4
    //#reactAdmin > div > div.notifications-wrapper > div > div
    ////*[@id="reactAdmin"]/div/div[2]/div/div
    //

    public void edit()
    {
        WebElement mySelectElement = driver.findElements(By.className("theme-btn")).get(1);
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();
    }
    public void fillEdit(String desc)
    {
        driver.findElement(bydescEdit).clear();
        driver.findElement(bydescEdit).sendKeys(desc);
//        driver.findElement(bymaxRedempEdit).clear();
//        driver.findElement(bymaxRedempEdit).sendKeys(max);


    }

    public void redemptionMax (String max){
        driver.findElement(bymaxRedempEdit).clear();
        driver.findElement(bymaxRedempEdit).sendKeys(max);

    }

    public void submitEdit() throws InterruptedException
    {
        driver.findElement(By.cssSelector("body > div:nth-child(7) > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div.theme-btn > button")).click();
        Thread.sleep(1000);
    }

    public void delete() throws InterruptedException
    {
//        WebElement mySelectElement = driver.findElements(By.className("theme-delete-btn")).get(0);
//        Actions action = new Actions(driver);
//        action.click(mySelectElement).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.className("theme-delete-btn")).click();

    }

    public void yesNo()
    {
        WebElement mySelectElement = driver.findElements(By.cssSelector("body > div:nth-child(9) > div > div:nth-child(1) > div > div > div:nth-child(3) > button:nth-child(1)")).get(0);
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();
    }

    public void openLoginPage(String email, String password)throws InterruptedException
    {
        Login_objects login=new Login_objects(driver);
        login.enterLoginCredentials(email,password);
        login.clickLogin();

    }

}


