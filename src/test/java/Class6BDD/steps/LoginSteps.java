package Class6BDD.steps;

import Class6BDD.PO.LoginPo;
import Class6BDD.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {



    LoginPo loginPo = new LoginPo(driver);

    @And("I fill username {string}")
    public void iFillUsername(String text) {
        loginPo.fillUserName(text);
    }

    @Then("I fill password {string}")
    public void iFillPassword(String text) {
        loginPo.fillPassword(text);
    }

    @Then(value = "I click on loginButton")
    public void clickLoginButton() {
        loginPo.clickLoginButton();
    }

    @And ("I validate the error")
    public void validateErrorMessage() {
        loginPo.validateErrorMessage();
    }

    @And("I Add Sauce Labs Backpack  to cart")
    public void iAddSauceLabsBackpackToCart() {
        loginPo.clickAddButton();
    }

    @Then("Validate that Add to Cart button now has text {string}")
    public void validateThatAddToCartButtonNowHasText(String text) {
        loginPo.validateButtonText(text);
    }

    @And("Click Cart button")
    public void clickCartButton() {
        loginPo.clickCartButton();
    }

    @Then("Validate that Sauce Labs Backpack is in your cart section")
    public void validateSauceLabsBackpack() {
        loginPo.validateSauceLabsBackpack();
    }

    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        loginPo.clickContinueShoppingButton();
    }
}
