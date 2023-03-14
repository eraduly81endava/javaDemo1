package taudemo;

import browser.BrowserGetter1;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WithConfigurationTest {
    private final BrowserGetter1 browserGetter1 = new BrowserGetter1();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter1.getWinChromeDriver();
    }

    @AfterAll
    public  void afterAll(){

        driver.quit();
    }

    @Test
    public void justATest(){
        driver.get("https://www.digi24.ro");
        assertEquals ("Digi24 - Stiri - Informația la putere!", driver.getTitle());
    }


}
