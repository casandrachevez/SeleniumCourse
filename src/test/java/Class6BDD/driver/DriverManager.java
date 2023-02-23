package Class6BDD.driver;

import Class6BDD.driver.DriverBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends DriverBase {
    protected WebDriver driver;


    public void initDriver(){
        System.out.println("Initializing Driver!");
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public DriverManager(){
        super(getDriver());
        driver = getDriver();
    }

    public void quitBrowser() {
        driver.quit();
    }
}
