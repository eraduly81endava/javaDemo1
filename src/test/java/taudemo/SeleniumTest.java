package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SeleniumTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;
    @BeforeAll
    public void beforeAll(){
        driver = browserGetter.getFirefoxDriver();
    }
    @AfterAll
    public void afterAll(){

        driver.quit();
    }
    @Test
    public void openTheComPageTestTheTitle (){
        String expectedComTitle = "Digi24 - Stiri - Informația la putere!";
        driver.get("https://www.digi24.ro");
        assertEquals(expectedComTitle, driver.getTitle());
    }
    @Test
    public void openTheOrgPageTestTheTitle (){
        String expectedOrgTitle = "Digi24 - Stiri - Informația la putere!";
        driver.get("https://www.digi24.ro");
        assertEquals(expectedOrgTitle, driver.getTitle());
    }
}
