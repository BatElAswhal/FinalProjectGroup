import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SauceDemoTestsYuri {

    @Test
    public void locked_out_user() throws InterruptedException {

    String url = "https://www.saucedemo.com";
    Main selenium = new Main();
    selenium.driver.get(url);
    selenium.driver.manage().window().maximize();
    String expected = "https://www.saucedemo.com/inventory.html";
    // enter a username
    WebElement locked_out_User = selenium.driver.findElement(By.cssSelector("#user-name"));
    locked_out_User.sendKeys("locked_out_user");
    // enter the password
    WebElement password = selenium.driver.findElement(By.cssSelector("#password"));
    password.sendKeys("secret_sauce");
    password.sendKeys(Keys.ENTER);

    Assert.assertEquals(expected , selenium.driver.getCurrentUrl());
    selenium.driver.quit();


}


    @Test

    public void problem_user() throws InterruptedException {


        Main selenium = new Main();
        String expected = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
        // open the window
        String url = "https://www.saucedemo.com";
        selenium.driver.manage().window().maximize();
        selenium.driver.get(url);

        Thread.sleep(1500);
        // selectors
        String UsernameSelector = "#user-name";
        String PasswordSelector = "#password";
        String MenuSelector = "#react-burger-menu-btn";
        String AboutSelector = "#about_sidebar_link";
        String LoginSelector = "#login-button";
        String UsernameBtnSelector = "problem_user";
        String PasswordBtnInput = "secret_sauce";
        // enter username & password
        Thread.sleep(1500);
        selenium.getElement(UsernameSelector).click();
        selenium.getElement(UsernameSelector).sendKeys(UsernameBtnSelector);
        selenium.getElement(PasswordSelector).sendKeys(PasswordBtnInput);
        // click on login button
        selenium.getElement(LoginSelector).click();
        //click on menu button
        Thread.sleep(1000);
        selenium.getElement(MenuSelector).click();
        // click on About button
        Thread.sleep(1000);
        selenium.getElement(AboutSelector).click();
        //
        Assert.assertEquals(expected, selenium.driver.getTitle());

        Thread.sleep(1000);
        selenium.driver.quit();


    }
}
