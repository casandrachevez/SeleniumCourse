package Class6BDD;

import Class6BDD.PO.LoginPo;
import Class6BDD.PO.ProductsPo;
import Class6BDD.driver.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SwagLabsTests {
    private WebDriver driver;
    //Declaring an instance of buttonsPagePo, so that we can use its methods
    LoginPo loginPo;
    ProductsPo productsPo;


    DriverManager driverManager = new DriverManager();


    @Before
    public void iniDriver() {
        driverManager.initDriver();
        driver = driverManager.getDriver();
        loginPo = new LoginPo(driver);
        productsPo = new ProductsPo(driver);
    }
    @Test
    public void login() {
        driver.get("https://www.saucedemo.com/");
        loginPo.fillUserName("standard_user");
        loginPo.fillPassword("secret_sauce");
        loginPo.clickLoginButton();
    }

    @Test
    public void checkFirstHeader(){
        login();
        productsPo.checkTextFirstItem("Sauce Labs Backpack");
    }

    @Test
    public void clickBurger(){
        login();
        productsPo.clickBurgerButton();
        productsPo.clickAllItems();
    }

    @After
    public void closeBrowser() {
        driverManager.quitBrowser();
    }

}
