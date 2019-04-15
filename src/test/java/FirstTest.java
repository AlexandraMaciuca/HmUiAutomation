import com.sun.org.glassfish.gmbal.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Helper;

import static utils.Constants.*;
import static utils.Helper.login;
import static utils.Helper.sleep;

public class FirstTest {
    private WebDriver driver;
    private Helper helper;

    @Before
    @Description("Setup Chrome driver")
    public void setup() {
        // setup chrome driver
        System.setProperty(CHROME_DRIVER, PATH_TO_CHROME_DRIVER);
        driver = new ChromeDriver();
        helper = new Helper(driver);

        // go to h&m page
        driver.navigate().to(BASE_URI);

        sleep(2000);

        // click confidentiality button
        driver.findElement(By.xpath("//*[@id=\"gdpr-modal\"]/div[2]/button")).click();
    }

    @Test
    public void testLogin() {
        login(VALID_USERNAME, PASSWORD);
    }

    @After
    public void teardown() {
        sleep(2000);
        driver.close();
    }
}
