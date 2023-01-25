package firstCodeClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class test1 {
    public static void main(String[] args){
        System.out.println("hello world");
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe"  );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();
        //Use the code below, to match the expected text of the first item in the shop.
        //Homework 2
        WebElement itemText1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String firstItemText = itemText1.getText();
        System.out.println("This is the text: "+firstItemText);
        Assert.assertEquals("Sauce Labs Backpack", firstItemText);

        //Homework 3
        WebElement item1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        WebElement item2 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
        WebElement itemText2 = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
        String secondItemText = itemText2.getText();
        WebElement products = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        WebElement price1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
        WebElement price2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[2]/div[2]/div[2]/div"));
        WebElement itemText3 = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
        WebElement price3 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div"));

        String productsText = products.getText();
        String buttonText = item1.getText();
        String priceOne = price1.getText();
        String priceTwo = price2.getText();
        String thirdItemText = itemText3.getText();
        String priceThree = price3.getText();

        //Select 6 elements after logging in the page
        Assert.assertEquals("PRODUCTS", productsText);
        Assert.assertEquals("ADD TO CART", buttonText);
        Assert.assertEquals("$29.99", priceOne);
        Assert.assertEquals("$9.99", priceTwo);
        Assert.assertEquals("Sauce Labs Fleece Jacket", thirdItemText);
        Assert.assertEquals("$49.99", priceThree);

        //Add to cart 2 items in the page
        item1.click();
        item2.click();
        cart.click();
        Assert.assertEquals("Sauce Labs Backpack", firstItemText);
        Assert.assertEquals("Sauce Labs Bolt T-Shirt", secondItemText);
        System.out.println("Yaaaay, all passed!");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
