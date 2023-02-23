package Class6BDD.PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPo {
    private WebDriver driver;

    public LoginPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement errorMessage;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addButton;

    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeButton;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement sauceLabsBackpack;

    @FindBy(id = "continue-shopping")
    WebElement continueShoppingButton;

    public void fillUserName(String text){
        this.usernameField.sendKeys(text);
    }
    public void fillPassword(String text){
        this.passwordField.sendKeys(text);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }

    public void validateErrorMessage() {
        String message = this.errorMessage.getText();
        Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", message);
        System.out.println(message + "I found it");
    }
    public void clickAddButton(){
        this.addButton.click();
    }

    public void validateButtonText(String text) {
        String buttonText = this.removeButton.getText();
        Assert.assertEquals(text, buttonText);
    }

    public void clickCartButton() {
        this.cartButton.click();
    }

    public void validateSauceLabsBackpack() {
        String product = this.sauceLabsBackpack.getText();
        Assert.assertEquals("Sauce Labs Backpack", product);
    }

    public void clickContinueShoppingButton() {
        this.continueShoppingButton.click();
    }
}
