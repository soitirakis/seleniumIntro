import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class MyFirstSeleniumTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://cookieyes.com/blog");



       // WebElement blogButton = driver.findElement(By.cssSelector("span.logo-text"));
       // blogButton.click();

        WebElement searchButton = driver.findElement(By.xpath("//input[@type=\'search\']"));
        searchButton.sendKeys("\"Google EU User Consent policy\"");

        //WebElement text = driver.findElement(By.xpath("//div[@class=\"is-title\"]/a"));
        //text.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"is-title\"]/a"))
        );
        element.click();

    }
}
