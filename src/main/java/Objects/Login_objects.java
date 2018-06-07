package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_objects {

    public static By byEmail = By.id("email");
    public static By byPassword = By.id("password");
    public static By byLoginButton = By.cssSelector("#page-content > div > div:nth-child(3) > form > div:nth-child(2) > div > button > div > div > span");
    public static By byLogoutButton = By.cssSelector("#reactAdmin > div > div:nth-child(3) > header > div.background > div > button");
    public boolean actual;

    WebDriver driver;

    public Login_objects(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterLoginCredentials(String userName, String passWord) throws InterruptedException {
        //System.out.println(""+userName+""+passWord);
        Thread.sleep(1000);
        driver.findElement(byEmail).sendKeys(userName);
        driver.findElement(byPassword).sendKeys(passWord);
    }


    public boolean clickLogin() throws InterruptedException {
        driver.findElement(byLoginButton).click();
        Thread.sleep(4000);
        actual= driver.findElement(byLogoutButton).isDisplayed();
        return actual;

    }
}