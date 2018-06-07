package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.lang.InterruptedException;

//import static General.Initialization.login;

public class Room_objects {


    public static By byHamburger = By.cssSelector("#reactAdmin > div > div:nth-child(3) > header > div.background > button");
    public static By byWarehouse = By.cssSelector("#reactAdmin > div > div:nth-child(3) > header > div:nth-child(1) > div:nth-child(2) > div:nth-child(12) > a > div > div");
    public static By byAddRoom = By.cssSelector("#page-content > div > div:nth-child(3) > div > div:nth-child(1)");
    public static By byRoomID = By.name("identifier");
    public static By byroomSize = By.name("roomSize");
    public static By byroomCapacity = By.name("roomCapacity");
    public static By bycost = By.name("cost");
    public static By bysubmit = By.cssSelector("body > div:nth-child(6) > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div.theme-btn > button");
    public static By bysubmitEdit = By.cssSelector("body > div:nth-child(7) > div > div:nth-child(1) > div > div > div:nth-child(2) > div > div.theme-btn > button");

    WebDriver driver;

    public Room_objects(WebDriver driver) {
        this.driver = driver;

    }

    public void clickHamburger()throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(byHamburger).click();
    }

    public void clickWarehouse()throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(byWarehouse).click();
    }

    public void clickAddRoom() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(byAddRoom).click();
    }

    public void roomID(String room) {
        driver.findElement(byRoomID).sendKeys(room);
    }

    public void warehouse() throws InterruptedException {
        WebElement selectsource = driver.findElement(By.id("react-select-2--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectsource, "Battersea").build().perform();
        Thread.sleep(1000);
        action.sendKeys(selectsource, Keys.ENTER).build().perform();
    }

    public void roomSize(String room_size) {
        driver.findElement(byroomSize).sendKeys(room_size);
    }

    public void roomCapacity(String room_capacity) {
        driver.findElement(byroomCapacity).sendKeys(room_capacity);
    }

    public void roomCost(String cost) {
        driver.findElement(bycost).sendKeys(cost);
    }

    public void status() throws InterruptedException
    {
        WebElement selectsource = driver.findElement(By.id("react-select-3--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectsource, "Open").build().perform();
        Thread.sleep(1000);
        action.sendKeys(selectsource, Keys.ENTER).build().perform();
    }
    public void submit() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.findElement(bysubmit).click();
    }

    public void edit()
    {
        WebElement mySelectElement = driver.findElements(By.className("theme-btn")).get(4);
        Actions action = new Actions(driver);
        action.click(mySelectElement).build().perform();

    }
    public void warehouseEdit() throws InterruptedException
    {
        // driver.findElement(By.id("react-select-4--value")).clear();
        WebElement selectsource = driver.findElement(By.id("react-select-4--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectsource, "Cheam").build().perform();
        Thread.sleep(1000);
        action.sendKeys(selectsource, Keys.ENTER).build().perform();

    }

    public void roomSizeEdit(String room_size) {

        driver.findElement(byroomSize).clear();
        driver.findElement(byroomSize).sendKeys(room_size);
    }

    public void roomCapacityEdit(String room_capacity) {

        driver.findElement(byroomCapacity).clear();
        driver.findElement(byroomCapacity).sendKeys(room_capacity);
    }

    public void roomCostEdit(String cost) {

        driver.findElement(bycost).clear();
        driver.findElement(bycost).sendKeys(cost);
    }

    public void statusEdit() throws InterruptedException
    {
        WebElement selectsource = driver.findElement(By.id("react-select-5--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectsource, "Closed").build().perform();
        Thread.sleep(1000);
        action.sendKeys(selectsource, Keys.ENTER).build().perform();
    }
    public void submitEdit ()
    {

        driver.findElement(bysubmitEdit).click();
    }

    public void delete()throws InterruptedException
    {
        WebElement mySelectElement = driver.findElements(By.className("theme-delete-btn")).get(0);
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.click(mySelectElement).build().perform();
    }
    public void yesNo() throws InterruptedException
    {
        WebElement mySelectElement = driver.findElements(By.cssSelector("body > div:nth-child(8) > div > div:nth-child(1) > div > div > div:nth-child(3) > button:nth-child(1)")).get(0);
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.click(mySelectElement).build().perform();
    }

    public void applyassertionSubmit (String message)  {
        WebElement mySelectElement = driver.findElement(By.className("notification-title"));
        String actualMessage = mySelectElement.getText();

        Assert.assertEquals(message, actualMessage);
        //  System.out.println("Actual Result : "+ actualMessage + "Expected Result : "+ message);
    }


    public void openLoginPage(String email, String password)throws InterruptedException
    {
        Login_objects login=new Login_objects(driver);
        login.enterLoginCredentials(email,password);
        login.clickLogin();

    }
}