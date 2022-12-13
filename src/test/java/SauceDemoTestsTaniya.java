import org.junit.Assert;
import org.junit.Test;

public class SauceDemoTestsTaniya {
    @Test
    public void StandardUserTest()throws InterruptedException {
        String Expexted1=String.valueOf(1);
        String url="https://www.saucedemo.com";
        String UserNameSelector="#user-name";
        String PasswordSelector="#password";
        String LogInSelector="#login-button";
        String StandartUserName = "standard_user";
        String UsersPassword = "secret_sauce";
        String AddBtn1Selector = "#add-to-cart-sauce-labs-backpack";
        String AddBtn2Selector = "#add-to-cart-sauce-labs-bike-light";
        String ShopingBagSelector = "#shopping_cart_container > a";
        String RemoveBtnSelector = "#remove-sauce-labs-bike-light";

        Main selenium = new Main();
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        Thread.sleep(1500);
        selenium.getElement(UserNameSelector).sendKeys(StandartUserName);
        Thread.sleep(1500);
        selenium.getElement(PasswordSelector).sendKeys(UsersPassword);
        Thread.sleep(1500);
        selenium.getElement(LogInSelector).click();
        Thread.sleep(1500);
        selenium.getElement(AddBtn1Selector).click();
        Thread.sleep(1500);
        selenium.getElement(AddBtn2Selector).click();
        Thread.sleep(1500);
        selenium.getElement(ShopingBagSelector).click();
        Thread.sleep(1500);
        selenium.getElement(RemoveBtnSelector).click();
        Thread.sleep(1500);
        String units = selenium.getElement("#shopping_cart_container > a > span").getText();
        Assert.assertEquals(Expexted1,units);
        selenium.driver.close();
    }

    @Test
    public void ProblemUserTest2() throws InterruptedException {
        String Expexted2 = String.valueOf(0);
        String url = "https://www.saucedemo.com";
        String UserNameSelector = "#user-name";
        String PasswordSelector = "#password";
        String LogInSelector = "#login-button";
        String StandardUserName = "standard_user";
        String ProblemUserName = "problem_user";
        String UsersPassword = "secret_sauce";
        String AddBtn1Selector = "#add-to-cart-sauce-labs-backpack";
        String AddBtn2Selector = "#add-to-cart-sauce-labs-bike-light";
        String ShoppingBagSelector = "#shopping_cart_container > a";
        String MenuSelector="#react-burger-menu-btn";
        String MenuSelector2="#menu_button_container > div > div.bm-menu-wrap > div.bm-menu";
        String LogoutSelector="#logout_sidebar_link";


        Main selenium = new Main();
        selenium.driver.get(url);
        selenium.driver.manage().window().maximize();
        selenium.getElement(UserNameSelector).sendKeys(StandardUserName);
        Thread.sleep(1500);
        selenium.getElement(PasswordSelector).sendKeys(UsersPassword);
        Thread.sleep(1500);
        selenium.getElement(LogInSelector).click();
        Thread.sleep(1500);
        selenium.getElement(AddBtn1Selector).click();
        Thread.sleep(1500);
        selenium.getElement(AddBtn2Selector).click();
        Thread.sleep(1500);
        selenium.getElement(ShoppingBagSelector).click();
        Thread.sleep(1500);
        selenium.getElement(MenuSelector).click();
        Thread.sleep(1500);
        selenium.getElement(MenuSelector2).click();
        Thread.sleep(1500);
        selenium.getElement(LogoutSelector).click();
        Thread.sleep(1500);
        selenium.getElement(UserNameSelector).sendKeys(ProblemUserName);
        Thread.sleep(1500);
        selenium.getElement(PasswordSelector).sendKeys(UsersPassword);
        Thread.sleep(1500);
        selenium.getElement(LogInSelector).click();
        Thread.sleep(1500);
        selenium.getElement(ShoppingBagSelector).click();
        String units1 = selenium.getElement("#shopping_cart_container > a > span").getText();
        Assert.assertEquals(Expexted2,units1);


    }
}