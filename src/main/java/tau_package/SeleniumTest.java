package tau_package;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {

    //private static BrowserGetter browserGetter = new BrowserGetter();
    private static WebDriver driver;

    @BeforeAll
    public static void get_before_all() {
        driver = new ChromeDriver();
    }

    @AfterAll
    public static void get_after_all() {
        driver.quit();
    }

    @Test
    public void first_test_check() {
        String title = "Apple Store";
        driver.get("https://www.apple.com/in/store?afid=p238%7Cs8Vs8GkTq-dc_mtid_187079nc38483_pcrid_664737674852_pgrid_112258962467_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
        assertEquals(title, driver.getTitle());

    }
}
