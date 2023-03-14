package browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.System.setProperty;
import static org.apache.commons.lang3.SystemUtils.*;

public class BrowserGetter {
    /**
     *          detect operating system
     *          if it is not one of the predefined ones, just throw exception
     *          only create a webDriver instance for a known operating system
     */

    public WebDriver getFirefoxDriver() {
        setProperty("webdriver.gecko.driver", "src/test/resources/browserBinaries/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }



}
