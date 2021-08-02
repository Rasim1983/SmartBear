package com.smartBear.step_definitions;

import com.smartBear.pages.SmartBear_LoginPage;
import com.smartBear.pages.SmartBear_OrderPage;
import com.smartBear.pages.SmartBear_WebOrdersPage;
import com.smartBear.pages.ViewAllOrdersPage;
import com.smartBear.urilities.ConfigurationReader;
import com.smartBear.urilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class SM_orderDefinitions {

    SmartBear_LoginPage loginPage = new SmartBear_LoginPage();
    SmartBear_WebOrdersPage webOrdersPage = new SmartBear_WebOrdersPage();
    SmartBear_OrderPage orderPage = new SmartBear_OrderPage();
    ViewAllOrdersPage viewAllOrdersPage  = new ViewAllOrdersPage();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        String url = ConfigurationReader.getProperty("smartBearUrl");
        Driver.getDriver().get(url);


    }

    @When("user enter username {string} and password {string}")
    public void user_enter_username_and_password(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginButton.click();


    }

    @Then("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        webOrdersPage.orderLink.click();

    }

    @Then("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {


    }

    @Then("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productName) {
        Select selectProduct = new Select(orderPage.product);
        selectProduct.selectByVisibleText(productName);

    }

    @Then("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantity) {
        orderPage.quantity.sendKeys(quantity);

    }

    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {
        orderPage.nameInput.sendKeys(name);


    }

    @Then("User enters {string} to street")
    public void user_enters_to_street(String street) {
        orderPage.streetInput.sendKeys(street);

    }

    @Then("User enters {string} to city")
    public void user_enters_to_city(String city) {
        orderPage.cityInput.sendKeys(city);
    }

    @Then("User enters {string} to state")
    public void user_enters_to_state(String state) {
        orderPage.stateInput.sendKeys(state);

    }

    @Then("User enters {string} zip code")
    public void user_enters(String zipCode) {
        orderPage.zipCodeInput.sendKeys(zipCode);

    }

    @Then("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        orderPage.visaCard.click();

    }

    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        orderPage.cardNumberInput.sendKeys(cardNumber);

    }

    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expirationDate) {
        orderPage.expirationInput.sendKeys(expirationDate);

    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        orderPage.processButton.click();

    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {
        viewAllOrdersPage.verifyName(expectedName);


    }

}
