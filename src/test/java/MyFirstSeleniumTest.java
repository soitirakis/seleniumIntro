import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://soitirakis.github.io/Weather-app/");
    }
}
