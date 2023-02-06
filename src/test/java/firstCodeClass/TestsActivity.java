package firstCodeClass;

import firstCodeClass.PO.LoginPo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestsActivity {
    private WebDriver driver;
    //Declaring an instance of buttonsPagePo, so that we can use its methods
    LoginPo login;
    DriverClass driverClass = new DriverClass();


    @Test //@Test annotation tells selenium that this is an individual test scenario
    public void testDoubleClickButton() {
        driver.get("https://www.saucedemo.com/");
        login.enterNameAndPass();
        login.clickLoginButton();
    }

    @Before //@Before annotation tells Selenium that this will run before each @Test
    public void iniDriver() {
        driverClass.initDriver();
        driver = driverClass.getDriver();
        login = new LoginPo(driver);
    }

    @After //@After annotation tells Selenium that this will run after each @Test
    public void closeBrowser() {
        driverClass.quitBrowser();
    }

    @AfterClass  //@AfterClass annotation tells Selenium that this will at the end of this class
    public static void completeTesting() {
        System.out.println("All tests complete :) ");
    }
}
