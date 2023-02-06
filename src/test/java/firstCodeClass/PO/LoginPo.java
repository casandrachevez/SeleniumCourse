package firstCodeClass.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPo
{
    private final WebDriver driver;

    public LoginPo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(xpath = "//*[@id=\"user-name\"]") //@FindBy is an alternative way to declare a WebElement
    WebElement userName;

    @FindBy(id = "password") //@FindBy is an alternative way to declare a WebElement
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login-button\"]") //@FindBy is an alternative way to declare a WebElement
    WebElement loginButton;


    public void enterNameAndPass() {
        Actions action = new Actions(driver);
        userName.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
    }

    public void clickLoginButton (){
        loginButton.click();
    }
}


