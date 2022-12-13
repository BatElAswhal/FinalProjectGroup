import org.junit.Assert;
import org.junit.Test;

public class SauceDemoTestsBatEl {
    private long time_to_sleep = 1750;

    @Test
    //test number 1-Buying process E2E

    public void Processtest1() throws InterruptedException {
        String expected = "THANK YOU FOR YOUR ORDER";
        String url = "https://www.saucedemo.com/";

        // selectors
        String user_name_input_selector = "#user-name";
        String password_input_selector = "#password";
        String login_button_selector = "#login-button";
        String first_item_add_to_cart_selector = "#add-to-cart-sauce-labs-onesie";
        String second_item_add_to_cart_selector = "#add-to-cart-sauce-labs-backpack";
        String cart_button_selector = "#shopping_cart_container > a";
        String checkout_button_selector = "#checkout";
        String first_name_input_selector = "#first-name";
        String last_name_input_selector = "#last-name";
        String zip_cod_input_selector = "#postal-code";
        String continue_button_selector = "#continue";
        String finish_button_selector = "#finish";
        String checkout_complete = "#checkout_complete_container > h2";

        // inputs
        String user_name = "standard_user";
        String password = "secret_sauce";
        String first_name_input = "BatEl";
        String last_name_input = "Ashwal";
        String zip_cod_input = "6041918";

        Main selenium = new Main();

        //open the website
        selenium.driver.get(url);
        //maximize the window
        selenium.driver.manage().window().maximize();
        //sign-in with "standard user" account
        selenium.getElement(user_name_input_selector).sendKeys(user_name);
        Thread.sleep(time_to_sleep);
        selenium.getElement(password_input_selector).sendKeys(password);
        Thread.sleep(time_to_sleep);
        selenium.getElement(login_button_selector).click();
        Thread.sleep(time_to_sleep);
        //add the first product to cart
        selenium.getElement(first_item_add_to_cart_selector).click();
        Thread.sleep(time_to_sleep);
        //add the second product to cart
        selenium.getElement(second_item_add_to_cart_selector).click();
        Thread.sleep(time_to_sleep);
        //navigate to cart
        selenium.getElement(cart_button_selector).click();
        Thread.sleep(time_to_sleep);
        //checkout process
        selenium.getElement(checkout_button_selector).click();
        Thread.sleep(time_to_sleep);
        selenium.getElement(first_name_input_selector).sendKeys(first_name_input);
        Thread.sleep(time_to_sleep);
        selenium.getElement(last_name_input_selector).sendKeys(last_name_input);
        Thread.sleep(time_to_sleep);
        selenium.getElement(zip_cod_input_selector).sendKeys(zip_cod_input);
        Thread.sleep(time_to_sleep);
        selenium.getElement(continue_button_selector).click();
        Thread.sleep(time_to_sleep);
        selenium.getElement(finish_button_selector).click();
        Thread.sleep(time_to_sleep);
        //the text in the end of Successful checkout should be  "THANK YOU FOR YOUR ORDER"
        String actualValue = selenium.getElement(checkout_complete).getText();
        Assert.assertEquals(expected, actualValue);
        selenium.driver.quit();

    }

    @Test
    //test number 2- "remove" and "add to cart" button through product page -Update after clicking.

    public void Processtest2() throws InterruptedException {
        String expected = "ADD TO CART";
        String url = "https://www.saucedemo.com/";

        // selectors
        String user_name_input_selector = "#user-name";
        String password_input_selector = "#password";
        String login_button_selector = "#login-button";
        String titel_TestallTheThingsTShirtRed_selector = "#item_3_title_link > div";
        String add_to_cart_selector = "#add-to-cart-sauce-labs-backpack";
        String remove_button_selector = "#remove-sauce-labs-backpack";
        String toggle_inventory_button = ".btn.btn_small.btn_inventory";

        // inputs
        String user_name = "problem_user";
        String password = "secret_sauce";

        Main selenium = new Main();
        //open the website
        selenium.driver.get(url);
        //maximize the window
        selenium.driver.manage().window().maximize();
        Thread.sleep(time_to_sleep);
        //sign-in with "problem user" account
        selenium.getElement(user_name_input_selector).sendKeys(user_name);
        Thread.sleep(time_to_sleep);
        selenium.getElement(password_input_selector).sendKeys(password);
        Thread.sleep(time_to_sleep);
        selenium.getElement(login_button_selector).click();
        Thread.sleep(time_to_sleep);
        //enter to product page
        selenium.getElement(titel_TestallTheThingsTShirtRed_selector).click();
        Thread.sleep(time_to_sleep);
        //add the product to cart
        selenium.getElement(add_to_cart_selector).click();
        Thread.sleep(time_to_sleep);
        //trying to press on "remove" button
        selenium.getElement(remove_button_selector).click();
        Thread.sleep(time_to_sleep);
        //the text button should change from "remove" to "add to cart"
        String actualValue = selenium.getElement(toggle_inventory_button).getText();
        Assert.assertEquals(expected, actualValue);
        Thread.sleep(time_to_sleep);
        selenium.driver.quit();


    }
}
