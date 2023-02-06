package firstCodeClass.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Hamburger
{
    private final WebDriver driver;

    public Hamburger(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(xpath = "//*[@id='react-burger-menu-btn']")
    WebElement clickOnHamburger;

    @FindBy(id = "inventory_sidebar_link")
    WebElement clickOnAllItems;

    public void clickHamburgerButton() {
        clickOnHamburger.click();
    }

    public void clickAllItems() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement clickOnAllItems = driver.findElement(By.id("inventory_sidebar_link"));
        clickOnAllItems.click();
    }

}

