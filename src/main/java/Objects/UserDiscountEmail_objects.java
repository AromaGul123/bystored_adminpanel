package Objects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//import static General.Initialization.login;

public class UserDiscountEmail_objects {

    public static By byHamburger = By.xpath("//*[@id=\"reactAdmin\"]/div/div[3]/header/div[2]/button");
    public static By byUserDiscountEmail = By.xpath("//*[@id=\"reactAdmin\"]/div/div[3]/header/div[1]/div[2]/div[11]/a/div/div");

    public static By byEmail = By.name("emailAddress");
    public static By byName = By.name("firstName");
    public static By byFee = By.name("returnFee");
    public static By byLoadingTime = By.name("freeLoadingTime");
    public static By byDiscountPercent = By.name("anotherDiscountPercent");
    public static By byFreeMinutesLoadingTime = By.name("freeMinsLoadingTime");
    public static By byFreePacking = By.name("freeMinsPackAsst");

    public static By bysubmit = By.className("theme-btn");
    public static By bysend = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/button[1]/div/span");

    WebDriver driver;

    public UserDiscountEmail_objects(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHamburger() {
        driver.findElement(byHamburger).click();
    }

    public void clickUserDiscountEmail()
    {
        driver.findElement(byUserDiscountEmail).click();
    }

    public void basicInfo(String e, String n)
    {
        driver.findElement(byEmail).sendKeys(e);
        driver.findElement(byName).sendKeys(n);

    }

    public void storageUnit() throws InterruptedException
    {
        WebElement selectUnit =  driver.findElement(By.id("react-select-2--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectUnit,"25 sq ft").build().perform();
        Thread.sleep(1000);
        action.sendKeys(selectUnit, Keys.ENTER).build().perform();
    }
    public void discountCode() throws InterruptedException
    {
        WebElement selectUnit =  driver.findElement(By.id("react-select-3--value"));
        // ((JavascriptExecutor)driver).executeScript("$(\"#react-select-7--value\").val(\"Students\");");

        Actions action = new Actions(driver);
        action.sendKeys(selectUnit,"SOUTHBANKSTORAGE").build().perform();
        Thread.sleep(1000);
        action.sendKeys(selectUnit, Keys.ENTER).build().perform();
    }

    public void otherInfo(String f,String l,String d ,String m,String p)
    {
        driver.findElement(byFee).sendKeys(f);
        driver.findElement(byLoadingTime).sendKeys(l);
        driver.findElement(byDiscountPercent).sendKeys(d);
        driver.findElement(byFreeMinutesLoadingTime).sendKeys(m);
        driver.findElement(byFreePacking).sendKeys(p);
    }
    public void submit() throws InterruptedException
    {
        WebElement element = driver.findElement(bysubmit);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        driver.findElement(bysubmit).click();
    }
    public void sendEmail()
    {
        driver.findElement(bysend).click();
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






