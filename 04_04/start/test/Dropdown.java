import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/shobhitha/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));

        dropDown.click();

        driver.findElement(By.xpath("/html/body/div/div/div/a[12]")).click();
//        Thread.sleep(1000);
//        WebElement checkbox = driver.findElement(By.cssSelector("a[href='/checkbox']")).click().build().perform();
////
////        Select mySelect = new Select(checkbox);
//        mySelect.selectByVisibleText("Checkbox");


//        dropDown.click();
//
//        driver.findElement(By.cssSelector("a[href='/dragdrop']")).click();





        driver.quit();
    }
}