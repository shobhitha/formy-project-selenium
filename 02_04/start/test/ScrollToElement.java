import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/shobhitha/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions actions = new Actions(driver);

        actions.moveToElement(name);

        name.sendKeys("Charles");

        WebElement date = driver.findElement(By.id("date"));

//        actions.moveToElement(date);
        date.sendKeys("08/17/18");








        driver.quit();
    }
}
